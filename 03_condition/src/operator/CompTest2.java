package operator;

import java.util.Scanner;

public class CompTest2 {
	public static void main(String[] args) {
		
		int a,b;
	
		Scanner scanner = new Scanner(System.in);
		System.out.print("a의 값 입력 : ");
		a = scanner.nextInt();
		System.out.print("b의 값 입력 : ");
		b = scanner.nextInt();
		
		int maxNum = a>b ? a: b;
		System.out.println("큰 값 :"+maxNum);
	}
}
