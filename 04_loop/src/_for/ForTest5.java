package _for;

import java.util.Scanner;

public class ForTest5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("x입력 : ");
		int x = scanner.nextInt();
		System.out.print("y입력 : ");
		int y = scanner.nextInt();
		
		int mul=1;
		
		for(int i=0; i<y; i++) {
			mul*=x;
		}
		
		System.out.printf("%d의 %d승은 %d",x,y,mul) ;
	}
}
