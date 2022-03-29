package com.test;

//문제1) 정수형 변수 num1, num2 를 선언하고 두 수 중에서 큰 수에서 작은 수를 뺀 결과를 저장하는 변수 result.
public class Exam01 {
	public static void main(String[] args) {
		int num1=30;
		int num2=10;
		int result = 0;
		
//		첫번째코드
		/*
		if(num1>num2) {System.out.println("result : "+ (num1-num2));}
		else {System.out.println("result : "+ (num2-num1)); }
		*/
		
//		두번째코드
		result = Math.max(num1, num2) - Math.min(num2, num1);
		System.out.println(result);
	}
}
