
public class quiz4_6 {
	public static void main(String[] args) {
		//주사위눈 1~6까지		
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				//합이 6인 경우의 수 모두 출력 
				if(i+j == 6) {	
					System.out.printf("%d+%d=%d%n",i,j,i+j);
				}
			}
		}
	
	}
}
