import java.util.Scanner;

public class FlowEx27_boolean {
	// 사용자로부터 반복해서 숫자입력 받다가 0 입력하면 입력 마치고 총합 출력하기
	public static void main(String[] args) {
		
		int sum=0;
		boolean flag = true;
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자입력(종료시0)");
		
		while(flag) {
			System.out.print(">>");
			int inputNum = scanner.nextInt();
			
			if(inputNum!=0)
				sum += inputNum;
			else
				flag=false;
			
			
		}
		
		System.out.printf("총합 : %d ",sum);
	}
}
