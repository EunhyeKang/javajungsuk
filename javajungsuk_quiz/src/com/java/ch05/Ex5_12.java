package com.java.ch05;

import java.util.Scanner;

public class Ex5_12 {
	public static void main(String[] args) {
		
		String[][] word = {
				{"chair","의자"},
				{"computer","컴퓨터"},
				{"integer","정수"}
		};
		
		Scanner scanner = new Scanner(System.in);
		
		int count = 0;
		for(int i=0; i<word.length; i++) {
			
			System.out.printf("Q%d. %s의 뜻은?",i,word[i][0]);
			String answer = scanner.nextLine();
			
			if(answer.equals(word[i][1])) {
				System.out.println("goodjob");
				count++;
			}else {
				System.out.println("wrong");
				
			}
			
			
		}
		System.out.printf("전체%d문제중 %d문제 맞췄",word.length,count);
		
	}
}
