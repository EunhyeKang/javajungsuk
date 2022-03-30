package com.test;

import java.util.Scanner;

//문제2) 정수형 변수 n1, n2를 선언하고 Scanner 클래스를 통하여 
//두정수를 입력받은 후 큰수에서 작은 수를 나눈 결과값을 소수점 첫번째까지 구하는 기능 작성. 
public class Exam02 {
	public static void main(String[] args) {
		int n1, n2 = 0;
		float result=0;

		Scanner scanner = new Scanner(System.in);

		
		System.out.print("첫번째 정수를 입력하세요>>");
		n1 = scanner.nextInt();
		System.out.print("두번째 정수를 입력하세요>>");
		n2 = scanner.nextInt();
<<<<<<< HEAD
		
		// 처음 작성한 코드
		/*
=======

		// first code
		/*

>>>>>>> development
		if(n1>n2) {
			result = (float)n1/n2;
			System.out.printf("answer : %.1f",result);
		}else {
			result = (float)n2/n1;
<<<<<<< HEAD
			System.out.printf("answer : %.1f",result);
			
		}
		*/
		
		//두번째 코드
		
		result = (float)Math.max(n1, n2) / Math.min(n1, n2);
		System.out.printf("answer : %.1f",result);
		
=======
			System.out.printf("answer : %.1f",result);			
		}*/
		
		
		//second code - refactoring
		result = (float)Math.max(n1, n2)/Math.min(n1, n2);
		System.out.printf("answer : %.1f",result);

>>>>>>> development
	}
}
