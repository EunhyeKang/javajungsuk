import java.util.Scanner;

public class FlowEx27 {
//사용자로부터 반복해서 숫자를 입력받다가 0을 입력하면 입력마치고 총 합을 출력하는 예제
	//while문 조건식으로 변수 flag사용. true false
	
	public static void main(String[] args) {
		
		System.out.print("합계를 구할 숫자를 입력하세요.(끝내려면 0 입력) >");
		int sum = 0;
		int num = 0;
		boolean flag = true;
		
		while(flag) {
			System.out.print(">>");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			num = Integer.parseInt(input);
			
			sum += num;
			
			if(num == 0) {
				flag = false;
			}
			
		}
		System.out.printf("합계는 %d 입니다",sum);
	}
}
