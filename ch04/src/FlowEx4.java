import java.util.Scanner;

public class FlowEx4 {
	public static void main(String[] args) {
		//점수저장위한 변수
		int score = 0;
//		학점 저장위한 변수
		char grade = ' ';
		
		System.out.print("점수를 입력하세요 > ");
		//화면통해 입력받은 숫자를score에 저장
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		//점수가 90보다 같거나 크면 에이
		if(score >=90) {
			grade = 'A';
		}
		//점수가 80보다 같거나 크면 삐 
		else if(score >=80) {
			grade = 'B';
		}
		//점수가 70보다 같거나 크면 씨 
		else if(score >=70) {
			grade = 'C';
		}
	//나머지는디
		else{
			grade = 'D';
		}
		
		//니 학점 출력
		System.out.printf("학점은 %c 입니다.",grade);
		
	}
}
