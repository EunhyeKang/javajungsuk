import java.util.Scanner;

import javax.xml.soap.SAAJResult;

public class FlowEx6 {
	public static void main(String[] args) {

		// 현재 몇월인지 입력받아서 해당하는 계절을 출력하는 예제

		System.out.print("현재 월을 입력하세요 >");

		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();

		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄입니다");
			break;

		case 6:
		case 7:
		case 8:
			System.out.println("여름 입니다");
			break;

		case 9:
		case 10:
		case 11:
			System.out.println("가을 입니다");
			break;

		default:
			System.out.println("겨울 니다.");

		}
	}
}
