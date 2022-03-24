
public class quiz4_5 {
	public static void main(String[] args) {
		//while문으로 변경하시오.
		
		/*
		 * for(int i=0; i<=10; i++) { 
		 * 		for(int j=0; j<=i; j++)
               		System.out.print("*");
           	System.out.println();
			}
		 */
	/*	
	int i=1;
	while(i<=10) {
		for(int j=1; j<=i; j++) {
			System.out.print("*");
		}
		System.out.println();
		++i;
	}
	*/
		
		int i=0;
		while(i<=10) {
			int j=0;
			while(j<=i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
	
		
		
	
	}
}
