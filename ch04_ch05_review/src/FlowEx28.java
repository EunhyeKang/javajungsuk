import java.util.Scanner;

public class FlowEx28 {
	public static void main(String[] args) {
		//1과 100사이의 임의의 수를 변수 answer에 저장하고, 이 값을 맞출때까지 반복하는 예
		
		int input = 0, answer = 0;
		
		answer = (int)(Math.random()*100+1);
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1~100사이의 숫자를 맞춰보세요 ");
		
		do {
			
			//입력받기
			System.out.print(">>");
			input = scanner.nextInt();
			//맞춰라  
			if(input<answer)System.out.println("더 큰 수를 입력하세요");
			if(input>answer)System.out.println("더 작은수를 입력하세요");
			
		}while(input!=answer);
			
		System.out.println("correct!");
			
	}
}
