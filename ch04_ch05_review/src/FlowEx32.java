import java.util.Scanner;

public class FlowEx32 {
	public static void main(String[] args) {
		int menu=0;
		
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("[1]apple");
			System.out.println("[2]banana");
			System.out.println("[3]orange");
			System.out.print("원하는메뉴를 선택하세요(종료0) >> ");
			menu = scanner.nextInt();
			
			if(menu==0) {
				System.out.println("end");break;
			}
			else if(menu>3||menu<1) {
				System.out.println("wrong, re >>");
				continue;
			}
			System.out.println("your choice is "+menu );
		}
	}
}
