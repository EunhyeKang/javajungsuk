package variable;

import java.io.IOException;
import java.util.Scanner;

public class InputTest {
	public static void main(String[] args) throws IOException {
		System.out.print("������ �Է� : ");
		int data = System.in.read();
		System.out.println(data);

		
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �Է� : ");
		int a = scan.nextInt();
		System.out.println("�Ǽ� �Է� : ");
		double b = scan.nextDouble();
	
		System.out.println(a + "+" + b + "="+ (a+b));
	
	}
}
