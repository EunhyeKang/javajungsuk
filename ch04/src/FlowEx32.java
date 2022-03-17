import java.util.Scanner;

public class FlowEx32 {
	public static void main(String[] args) {
		int menu = 0;
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("1)square");
			System.out.println("2)square root");
			System.out.println("3)log");
			System.out.println("원하는 메뉴 1~3 선택하세요.(종료0)");
			
			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu == 0) {
				System.out.println("quit");
				break;
			}else if(!(1<=menu && menu <=3)) {
				System.out.println("wrong");
				continue;
			}
			System.out.println("your choice is menu " +menu+"번입니다.");
			
		}
	}
}
