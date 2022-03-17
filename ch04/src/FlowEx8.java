import java.util.Scanner;

public class FlowEx8 {
	public static void main(String[] args) {
		System.out.print("주민번호 입력하세요 (123456-1234567) > ");

		Scanner scanner = new Scanner(System.in);
		String regNo = scanner.nextLine();

		char gender = regNo.charAt(7);

		switch (gender) {
		case '1':
		case '3':
			switch (gender) {
			case '1':
				System.out.println("2000이전출생남자");
				break;
			case '3':
				System.out.println("2000이후출생남자");
				break;
			}
			break;
		case '2':
		case '4':
			switch (gender) {
			case '2':
				System.out.println("2000이전출생여자");
				break;
			case '4':
				System.out.println("2000이후출생여자");
				break;
			}
			break;
		default:
			System.out.println("유효하지않은 주민번호");
		}

	}
}
