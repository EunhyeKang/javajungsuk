
public class FlowEx26 {
	//몇까지 더하면 누적합계가 100을 넘지 않는 제일 큰 수가 되는지 구하기
	public static void main(String[] args) {
		
		int sum=0;
		int num=0; 
		
		
		while((sum += ++num)<100) {
				
			System.out.printf("%d - %d",num,sum);
			System.out.println();
		}
		
		/*
		while(true) {
			if(sum>=100)break;
			
			sum += ++num;
					
			System.out.printf("%d - %d",num,sum);
			System.out.println();
			
		}*/ //100 넘어가버림 
		
	}
}
