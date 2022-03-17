import java.util.Scanner;

public class FlowEx28 {
//1~100 사이 숫자맞추기게임
	public static void main(String[] args) {
		
		int answer = (int)((Math.random()*100) + 1);
		int input = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		do { System.out.print("숫자맞춰보세요 (1~100) >>");
			input = scanner.nextInt();
			
			if(input < answer) {System.out.println("더 큰수를 입력하세요>>");}
			else if(input > answer) {System.out.println("더 작은수를 입력하세요>>");}
			
		}while(input != answer) ;
		System.out.println("정답입니다");
	}
	
}
