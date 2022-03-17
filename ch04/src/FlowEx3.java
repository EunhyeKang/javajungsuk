import java.util.Scanner;

public class FlowEx3 {
	public static void main(String[] args) {
		System.out.print("숫자하나입력 > ");

		Scanner sc = new Scanner(System.in);
		// int input = sc.nextInt();
		
		String input = sc.nextLine();

		/*
		 * if(input ==0) { System.out.println("0입니다"); }else {
		 * System.out.println("0아닙니다"); }
		 */

		if (input.equals("0")) {
			System.out.println("0입니다");
		} else {
			System.out.println("0아닙니다");
		}
	}
}
