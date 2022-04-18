package array_1;

import java.util.Scanner;

public class Binary {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [] binary = new int [32];
		int size=0;
		
		while(true) {
			
			System.out.print("10진수 입력(0입력시 종료) :");
			int num = sc.nextInt();
			
//			System.out.println("입력값은 " + num);
			
			if(num==0) break; //0입력시 종료
			if(num<0) continue; //음수 입력시 재입력
			
			
			
			for(int i=0; i<binary.length; i++) {
					
					binary[i] = num%2;
					num = num/2;
					size++; //binary 배열길이 구하기
					
//				System.out.printf("binary[%d]=%d ",i,binary[i]); 
//				System.out.println();
//				System.out.println(num);
				
				if(num==0)break; // 몫이0이면 멈추기
	
			}
//			System.out.println("size:"+size); //binary 배열길이확인 출력
			
			for(int i=size; i>0; i--) {
				if(i%4==0) System.out.print(" "); //4개씩 끊어찍기
				System.out.print(binary[i-1]);
			
			}
			size=0; //초기화
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