import java.util.Scanner;

public class OperatorEx25 {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch = ' ';
		
		System.out.printf("문자 하나 입력하세요 >");
		String input = scanner.nextLine();
		ch = input.charAt(0);
		
		if('0'<=ch && ch<='9') {
			System.out.printf("입력하신 문자는 숫자입니다%n");
		}
		
		if('a'<=ch && ch<='z') {
			System.out.printf("입력하신 문자는 소문자 입니다%n");
		}
		
		if('A'<=ch && ch<='Z') {
			System.out.printf("입력하신 문자는 대문자 입니다%n");
		}
		
		
	}
//	public static void main(String[] args) {
//		Scanner scanner = new Scanner(System.in);
//		char ch = ' ';
//
//		while (true) {
//			System.out.printf("문자열 하나 입력하세요(종료는 * 누르세요) > ");
//
//			String input = scanner.nextLine();
//			ch = input.charAt(0);
//
//			if ('0' <= ch && ch <= '9') {
//				System.out.printf("입력하신 문자는 숫자입니다.%n");
//
//			}
//			if (('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'Z')) {
//
//				System.out.printf("입력하신 문자는 영문자 입니다.%n");
//
//			}
//			if (ch == '*') {
//				System.out.println("종료");
//				break;
//			}
//		}
//
//	}
}
