import java.util.Scanner;

public class FlowEx17 {
	public static void main(String[] args) {
		
		int num=0;
		
		while(true) {
			
			System.out.print("*을 출력할 라인수를 입력하세요(종료는99) >>");
			
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			num = Integer.parseInt(input);
			if(num==99)break;
			
			for(int i=0; i<num; i++) {
				for(int j=0; j<=i; j++) {
					System.out.print("*");
				}
				System.out.println();
			}
			
	
			
		}
		System.out.println("끝!");
}
}