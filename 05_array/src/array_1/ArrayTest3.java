package array_1;

import java.util.Scanner;

public class ArrayTest3 {
	public static void main(String[] args) {
		String str;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.print("문자열 입력:");
		str = sc.nextLine();
		
		System.out.println("가운데 문자:"+str.charAt(str.length()/2));
		System.out.println();
		}
		
		
	}
}
