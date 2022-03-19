
public class FlowEx24 {
	public static void main(String[] args) {
		//countdown
		
		int i=11;
		
		while(i-- != 0) {
			System.out.println(i);
			for(int j=0; j<2_000_000_000l; j++);
		}
		System.out.println("game over");
	}
}
