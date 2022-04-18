package array_1;

import java.util.Scanner;

public class Parking {
	public static void main(String[] args) {
		boolean[] ar = new boolean[5]; //기본값false
		Scanner scan = new Scanner(System.in);
		int num;
		
		while(true) {
			System.out.println();
			System.out.println("**********");
			System.out.println("\t 1.입차");
			System.out.println("\t 2.출차");
			System.out.println("\t 3.리스트");
			System.out.println("\t 4.종료");
			System.out.println("**********");
			System.out.print("\t 메뉴 : ");
			
			num = scan.nextInt();
			if(num==4)break;
			
			if(num==1) {//입차
				//위치입력
				//3번위치 입차/ 이미 주차되어 있습니다.
				System.out.print("위치입력 :");
				int parkNum = scan.nextInt();

				if(ar[parkNum-1]){
					System.out.println("이미주차되어있습니다.");
				}
				else {
					System.out.println(parkNum + "번위치 입차");
					//false -> true
					ar[parkNum-1] = true;
				}
			}	
			
			else if(num==2) {//출차
				System.out.print("위치입력 :");
				int parkNum = scan.nextInt();
				if(ar[parkNum-1]){
					System.out.println(parkNum+"번위치 출차"); 
					//true -> false
					ar[parkNum-1] = false;
				}else
					System.out.println("차가 주차되어있지 않습니다.");
			}	
			
			else if(num==3) {//리스트
				for(int i=0; i<ar.length; i++) {
					System.out.println((i+1)+"번째위치 : "+ar[i]);
				}//for
			}	
			
			
		}//while
		System.out.println("프로그램을 종료합니다.");
		
		
	}
}
