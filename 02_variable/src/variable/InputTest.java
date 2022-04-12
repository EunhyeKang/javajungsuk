package variable;

import java.io.IOException;
import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) throws IOException {
		System.out.print("데이터 입력 : ");
		int data = System.in.read();
		System.out.println(data);

		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 입력 : ");
		int a = scan.nextInt();
		System.out.println("실수 입력 : ");
		double b = scan.nextDouble();
	
		System.out.println(a + "+" + b + "="+ (a+b));
	
	}
}
