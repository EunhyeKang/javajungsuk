package operator;

import java.io.IOException;
import java.util.Scanner;

public class CompTest3 {
	public static void main(String[] args) throws IOException {
		
//		Scanner scanner = new Scanner(System.in);
		
		System.out.print("문자 입력 : ");
		int ch = System.in.read(); //int형으로 데이터 입력받음
		
//		
//		if('A' <= ch && ch <='Z')
//			ch += 32;
//		else
//			ch -= 32;
//	
//		System.out.println((char)ch);
		
		int result = 'A' <= ch && ch <='Z'? ch+32 : ch-32;
		System.out.println((char)ch + "-> "+ (char)result);
		
	}
}

/*
문자(ch)를 입력하여 대문자이면 소문자로 변경하고,
아니면(소문자) 대문자로 변경하시오.

[실행결과]

문자입력 : T
T -> t

문자입력 : e
e -> E
*/