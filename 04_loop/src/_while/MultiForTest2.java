package _while;

public class MultiForTest2 {
	public static void main(String[] args) {
		//2단~9단
		int dan, i;
		
		
		for(dan=2; dan<=9; dan++) {
			for(i=1; i<=9; i++) {
				System.out.println(dan +" * " + i + " = " + (dan*i));
			}
			System.out.println();
		}
	}
}
