	
public class FlowEx29 {
	
	//숫자중 3,6,9 가 포함되어있으면, 포함된 개수만큼 박수를 치는 3,6,9게임을
	//1~100까지 출력하는 예제
	
	public static void main(String[] args) {
		for(int i=1; i<=100; i++) {
			System.out.printf("i = %d",i);
			
			int tmp=i;
			
			do {
			if(tmp%10!=0 && tmp%10%3==0)
			
			System.out.print("짝");
			}while((tmp/=10) != 0);
			

			System.out.println();
		}
		
	}
}
