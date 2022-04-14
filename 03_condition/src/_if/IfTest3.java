package _if;

import java.util.Scanner;

public class IfTest3 {
	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 입력 :");
		a = sc.nextInt();
		System.out.print("두번째 입력 :");
		b = sc.nextInt();
		System.out.print("세번째 입력 :");
		c = sc.nextInt();
		
		int tmp = 0;
		
		if (a > b) {
			tmp=a;
			a=b;
			b=tmp;
		}
		if( a > c ) {
			tmp=a;
			a=c;
			c=tmp;
		}
		if( b > c ) {
			tmp=b;
			b=c;
			c=tmp;
		}
		System.out.printf("%d  %d  %d",a,b,c);		
			
				
	}
}
//[문제] if문 사용 
//3개의 숫자(a,b,c)를 입력받아서 순서대로 출력하시오
//3개의 숫자를 모두 다르게 입력한다.
//
//[실행결과]
//첫번째 입력 : 85
//두번째 입력 : 80
//세번째 입력 : 65
//65  80  85
//
//첫번째 입력 : 62
//두번째 입력 : 60
//세번째 입력 : 80
//60  62  80