package _while;

import java.util.Scanner;

public class WhileTest2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		while(true) {
			
			int tmp = 1;
			
			System.out.print("숫자 입력(종료는 0): ");
				int num = sc.nextInt();
			
			if(num==0) {System.out.println("프로그램을 종료합니다."); break;}
			if(num<0) continue;
			
			for(int i=num; i>=1; i--)
				tmp *= i;
		
			System.out.printf("%d! = %d",num,tmp);
			System.out.println();
		}
		
		
	}
}

//[문제] 팩토리얼 계산 - while, for, break, continue
//- 0이 입력되면 종료한다.
//- 음수가 들어오면 다시 입력한다.
//
//[실행결과]
//숫자 입력 : 3
//3! =6
//숫자 입력 : 5
//5! = 120
//숫자 입력 : -5
//숫자 입력 : -100
//숫자 입력 : 3
//3! = 6
//숫자 입력 : 0
//프로그램을 종료합니다.