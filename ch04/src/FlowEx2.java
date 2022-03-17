import java.util.Scanner;

public class FlowEx2 {
	public static void main(String[] args) {
		int input;
		
		System.out.print("숫자를 하나 입력하세요 >"	);
		
		
		//화면통해 입력받은 내용 tmp에 저장
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine();
		input = Integer.parseInt(tmp);
		
		
		if(input == 0) {
			System.out.println("입력숫자 0 입니다");
		}
		if(input != 0) {
			System.out.println("입력숫자 0 아닙니다");
			System.out.printf("입력하신 숫자는 %d 입니다",input);
		}
	}
}
