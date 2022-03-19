
public class FlowEx21 {
	public static void main(String[] args) {
		final int SIZE=5;
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				
				if(i==j)
					System.out.printf("[%d,%d]",i+1,j+1);
				else
					System.out.printf("     ");
			}
			System.out.println();
		}
	}
}
