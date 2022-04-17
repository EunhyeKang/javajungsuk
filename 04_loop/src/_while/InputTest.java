package _while;

import java.io.IOException;

public class InputTest {
	public static void main(String[] args) throws IOException {
		System.out.print("숫자 입력 :");
		int a = System.in.read();
		System.in.read(); //flush
		System.in.read();
		System.out.print("숫자 입력 : ");
		int b = System.in.read();
		
		System.out.println("결과 = "+ a + ", " + b);
		
	}
}
