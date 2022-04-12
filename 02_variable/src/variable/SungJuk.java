package variable;

import java.util.Scanner;

public class SungJuk {
	public static void main(String[] args) {
		
		String name;
		int kor;
		int eng;
		int math;
		int tot;
		double avg;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("이름?");
		name = scanner.nextLine();
		
		System.out.print("국어점수?");
		kor = scanner.nextInt();
		
		System.out.print("영어점수?");
		eng = scanner.nextInt();
		
		System.out.print("수학점수?");
		math = scanner.nextInt();
		
		
		tot = kor + eng + math;
		avg = (double)tot/3;
		
		System.out.println();
		System.out.println("국어   영어   수학   총점   평균");
		System.out.printf(" %2d %6d %6d %6d   %6.3f", kor,eng,math,tot,avg);
		System.out.println();
	
		
		
		
	}
}
