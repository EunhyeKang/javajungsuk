package variable;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Money {
	public static void main(String[] args) {
		 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("money입력>> ");
		int num = scanner.nextInt();
		String input = scanner.nextLine();
		System.out.println();
		
		
		// 1)
		DecimalFormat df = new DecimalFormat();
		System.out.printf("money : " + df.format(num)+"원%n");
		System.out.printf("천의자리%d원%n",num/1000);
		num = num%1000;
		System.out.printf("백의자리%d원%n",num/100);
		num = num%100;
		System.out.printf("십의자리%d원%n",num/10);
		num = num%10;
		System.out.printf("일의자리%d원%n",num);
		System.out.println();
		
		
		
		//2)
//		String [] s = {"일","십","백","천"};
//		int [] n = new int[4];
//			for(int i=0; i<=3; i++) {	
//				n[i] = num%10;
//				num = num/10;
//			}	
//			for(int i=3; i>=0; i--) {
//			System.out.printf("%s의자리 : %d",s[i], n[i]);
//			System.out.println();
//			}
		
		
		//3)
//		String input = scanner.nextLine();
//		
//		for(int i=0; i<input.length(); i++) {
//			System.out.println(input.charAt(i));
//		}
		
		
	}
}
