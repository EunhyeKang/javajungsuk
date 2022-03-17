
public class FlowEx14 {
	public static void main(String[] args) {
		//변수2
		for(int i=1,j=10; i<=10; i++,j--) {
			System.out.printf("%d\t%d%n",i,j);
		}
		System.out.println();
		
		//변수1개
		for(int i=1; i<=10; i++) {
			System.out.printf("%d\t%d%n",i,11-i);
		}
	}
}
