package com.java.ch05;

import java.util.Scanner;

public class Ex5_13 {
	public static void main(String[] args) {
		String[] words = {"television","computer","mouse","phone"};
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<words.length; i++) {
			char[] question = words[i].toCharArray();//String을 char[]로 변환
			
			
			for(int j=0; j<question.length; j++) {
				int tmp = (int)(Math.random()*question.length);
				
				char t = question[tmp];
				question[tmp] = question[j];
				question[j] = t;
			}
			
			
			
			System.out.printf("Q%d, %s의 정답을 입력하세요.>", i+1, new String(question));
			String answer = scanner.nextLine();
			
			//trim으로 answer의 좌우 공백을 제거한 후, equals로 word[i]와 비교
			
			if(words[i].equals(answer.trim()))
					System.out.println("right");
			else
				System.out.println("wrong");
		}
		
	}
}
