package _for;

import java.util.Scanner;

public class ForTest4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력:");
		int num = sc.nextInt();
		int count=0;
		//약수구하기
		for(int i=1; i<=num; i++) {
			if(num%i == 0) {
				System.out.print(i+" ");
				count++;
			}
		}
		if(count==2)
			System.out.println("소수이다.");
		else
			System.out.println("소수가아니다");
		
		
	}
}
