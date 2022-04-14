package _for;

public class ForTest {
	public static void main(String[] args) {
		int i;
		
		//반복 회수 지정
		for(i=1; i<=10; i++) {
			System.out.println("Hello Java!! "+i);
			
		}//for
		System.out.println("탈출 i = "+i);
		System.out.println();
		
		//10 9 8 7 6 5 4 3 2 1
		for(int j=10; j>0; j--)
			System.out.print(j+" ");
		
		System.out.println();
		
		//A B ~~~ Z
		for(i = 'A'; i<='Z'; i++)
			System.out.print((char)i+" ");
		
	}
		
	
}
