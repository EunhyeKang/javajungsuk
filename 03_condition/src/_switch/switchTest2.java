package _switch;

import java.io.IOError;
import java.io.IOException;
import java.util.Scanner;

public class switchTest2 {
	public static void main(String[] args) throws IOException {

		int num1,num2=0;
//		String op;
		int op;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 데이터 : ");
		num1 = scanner.nextInt();
		scanner.nextLine(); //밑에 nextLine()으로 입력받을 경우 엔터를 값으로 받아버리기 때문에 이렇게 추가해주면 정상작동.
		System.out.print("연산자 입력 : ");
//		op = scanner.next();
		op = System.in.read();// 딱 1개 문자만 입력받는다. // IOException 예외처리를 해줘야한다.
		
		System.out.print("두번째 데이터 : ");
		num2 = scanner.nextInt();
		
		
		//1) my answer
//		switch(op) {
//		case "+": System.out.printf("%d %s %d = %d", num1,op,num2,num1+num2); break;
//		case "-": System.out.printf("%d %s %d = %d", num1,op,num2,num1-num2); break;
//		case "*": System.out.printf("%d %s %d = %d", num1,op,num2,num1*num2); break;
//		case "/": System.out.printf("%d %s %d = %.3f", num1,op,num2,(double)num1/num2); break;
//		default: System.out.println("연산자 에러");
//		}
//		
		
		
		// from t
		String op2 = (char)op+"";
		switch(op) {
		case '+': System.out.println(num1 + "+" + num2 + "=" + (num1+num2)); break;
		case '-': System.out.println(num1 + ((char)op+"") + num2 + "=" + (num1-num2)); break;
		case '*': System.out.println(num1 + op2 + num2 + "=" + (num1*num2)); break;
		case '/': System.out.println(num1 + op + num2 + "=" + ((double)num1/num2)); break;
		default: System.out.println("연산자 에러");
		}
		
		
	}
}
//
//[문제] 계산 - switch
//정수형 2개와 연산자를 입력하여 계산하시오
//단 연산자(+,-,*,/)만 입력하고 그외는 
//에러가 나오게 하면 된다.
//
//[실행결과]
//첫번째 데이터 : 25
//연산자 입력  : +
//두번째 데이터 : 36
//25 + 36 = xx
//
//첫번째 데이터 : 25
//연산자 입력  : /
//두번째 데이터 : 36
//25 / 36 = 0.~~~~
//
//첫번째 데이터 : 25
//연산자 입력  : %
//두번째 데이터 : 36
//연산자 에러
