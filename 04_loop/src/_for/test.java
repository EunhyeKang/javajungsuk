package _for;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("소문자알파벳하나입력: ");
		String s = sc.nextLine();
		char alpa = s.charAt(0);
		
		if('a'<=alpa && alpa<='z') { 
		
			for(int j=alpa; j>='a'; j--) {
				for(int i='a'; i<=alpa; i++) 
					System.out.print((char)i);
				alpa--;
				System.out.println();
			}
		
		}else 
			System.out.println("잘못입력하셨습니다.");
	}
}
