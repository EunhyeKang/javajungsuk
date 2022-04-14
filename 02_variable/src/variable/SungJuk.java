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
		
		
		//학점
		char grade;
		//평균이 90이상이면 A
		// 80이상이면 B
		// 70이상이면 C
		// 60이상이면 D
		// 그 외는 F
		
//		if(avg>=90) grade = 'A';
//		else if(avg>=80) grade = 'B';
//		else if(avg>=70) grade = 'C';
//		else if(avg>=60) grade = 'D';
//		else grade = 'F';
		
		
		switch((int)avg /10) {
		case 10: 
		case 9: grade = 'A'; break;
		case 8: grade = 'B'; break;
		case 7: grade = 'C'; break;
		case 6: grade = 'D'; break;
		default : grade = 'F';
			
		
		
		}
		
		
		
		System.out.println();
		System.out.printf("      ***%s성적표***%n",name);
		System.out.println("국어\t영어\t수학\t총점\t평균\t학점");
		System.out.printf(" %2d %6d %6d %6d   %6.3f", kor,eng,math,tot,avg);
		System.out.println();
		System.out.printf( kor + "\t"+  eng  +"\t"+  math   +"\t"+  tot  +"\t"+  String.format("%.3f",avg)+ "\t" + grade);
		System.out.println();
	
		
		
		
	}
}
