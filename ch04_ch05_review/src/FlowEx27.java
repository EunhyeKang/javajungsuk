import java.util.Scanner;

public class FlowEx27 {
	// 사용자로부터 반복해서 숫자입력 받다가 0 입력하면 입력 마치고 총합 출력하기
	public static void main(String[] args) {
		
		int sum=0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자입력(종료시0)");
		
		while(true) {
			System.out.print(">>");
			int inputNum = scanner.nextInt();
			sum += inputNum;
			
			
			if(inputNum==0)break;
		}
		
		System.out.printf("총합은 %d ",sum);
	}
}
