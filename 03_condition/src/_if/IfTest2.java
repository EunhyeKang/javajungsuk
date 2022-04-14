package _if;

import java.util.Scanner;

public class IfTest2 {
	public static void main(String[] args) {
		int a,b,c = 0;
		int sum = 0;
		double avg = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 과목 점수 입력 : ");
		a = scanner.nextInt();
		System.out.print("두번째 과목 점수 입력 : ");
		b = scanner.nextInt();
		System.out.print("세번째 과목 점수 입력 : ");
		c = scanner.nextInt();
		
		sum = a+b+c;
		avg = (double)(a+b+c)/3;
		
		if(avg>=60)	
			if(a>=40 && b>=40 && c>=40)
				System.out.println("합격");
			else
				System.out.println("과락으로 불합격");		
		else
			System.out.println("불합격");
		
	}
}

/*

[문제] 3과목(a,b,c)의 평균이 60점 이상이고 각 과목이 40점 이상이면 "합격"

*/