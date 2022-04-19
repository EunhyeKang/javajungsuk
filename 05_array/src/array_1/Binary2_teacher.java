package array_1;

import java.util.Scanner;

public class Binary2_teacher {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] binary = new int [32];
//		int size=0;
		
		while(true) {
			
			System.out.print("10진수 입력(0입력시 종료) :");
			int num = sc.nextInt();
			
//			System.out.println("입력값은 " + num);
			
			if(num==0) break; //0입력시 종료
			if(num<0) continue; //음수 입력시 재입력
			
			int i;
			
			for(i=0; num !=0; i++) {//몫이 0이 될때까지 증가조건 증가조건
					binary[i] = num%2; //나머지를 배열에 담아주고
					num = num/2; // 몫으로 
			}

			//출력
			for(int j=i-1 ; j>=0; j--) {
				System.out.print(binary[j]);
				if(j%4==0) System.out.print(" "); //4개씩 끊어찍기
			}
			System.out.println();
			
		} //while 
		System.out.println("프로그램을 종료합니다.");
		
		
	}
}

//
//10진수를 입력하여 2진수로 변환하시오
//- 0이 입력되면 프로그램을 종료하시오
//- 음수가 입력되면 재입력하시오
//- 4개씩 끊어서 보여주기
//- Integer.toBinaryString() 사용 X
//
//10진수 입력 : -5
//
//10진수 입력 : 12
//1100
//
//10진수 입력 : 250
//1111 1010
//
//10진수 입력 : -8
//
//10진수 입력 : 0
//프로그램을 종료합니다