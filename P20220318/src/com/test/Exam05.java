package com.test;

import java.util.Scanner;

// 문제5) Book클래스를 선언(필드:책제목, 저자, 출판사, 금액) 
//      생성자(책제목, 저자, 출판사, 금액)를 선언 후 Scanner클래스를 사용하여 사용자의 입력을 통하여 인스턴스를 생성하고 
//      입력한 내용을 책제목, 저자, 출판사, 금액 정보를 화면에 출력하는 기능 구현.
public class Exam05 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
		
		System.out.print("책 제목을 입력하세요>");
		String t = scanner.nextLine();
		System.out.print("저자 >");
		String w = scanner.nextLine();
		System.out.print("출판사 >");
		String p = scanner.nextLine();
		System.out.print("금액 >");
		int price = scanner.nextInt();
		
		Book b = new Book(t, w, p, price); 
		
		System.out.println(b); //toString() 메소드 호출
		System.out.println();
		b.printInfo(); //출력 메서드 호출
		
	}
}
