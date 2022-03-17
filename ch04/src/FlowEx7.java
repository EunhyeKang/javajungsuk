import java.util.Scanner;

public class FlowEx7 {
	public static void main(String[] args) {
		
		//가위바위보 게임 
		/*
		 * 사용자로부터 1,2,3 하나 입력받고 컴퓨터는 1,2,3중에 하나 임의로 선택
		 * 난수 Math.random()
		 * 0.0~1.0사이 범위속하는 하나의 double값 반환 
		 * 0.0<=Math.random()<1.0
		 */
		
		System.out.print("가위(1)바위(2)보(3)중 하나를 내세요> ");
		Scanner scanner = new Scanner(System.in);
		int user = scanner.nextInt();
		int com = (int)(Math.random()*3 + 1);
		
		System.out.printf("당신은 %d입니다%n",user);
		System.out.printf("컴퓨터는 %d입니다%n",com);
		
		switch(com-user) {
		case 0 : 
		System.out.printf("비겼습니다"); break;
		case 1 : case -2:
			System.out.printf("이겼습니다"); break;
		case -1 : case 2:
			System.out.printf("졌습니다"); break;
			
		}
	}
}
