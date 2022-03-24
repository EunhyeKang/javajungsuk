import java.util.Scanner;

public class quiz4_14 {
	public static void main(String[] args) {
		//1~100 random -->answer 
		int answer = (int)(Math.random()*100+1);
		int input = 0;
		int count = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			count++;
			System.out.print("1~100 사이의 값을 입력하세요 : >>");
			input = scanner.nextInt();
			
			if(answer>input) {
				System.out.print("더 큰수를 입력하세요");
			}
			if(answer<input) {
				System.out.print("더 작은수를 입력하세요");
			}
			System.out.println();
			if(answer==input) {
				System.out.println("맞췄습니다.");
				System.out.printf("시도횟수는 %d번",count);
				break;
			}
			
		
		}while(true);
	}
}
