package _while;

import java.util.Scanner;

public class NumberGame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count=0;
		int num = (int)(Math.random()*100)+1;
		
		while(true){
		
		System.out.print("1~100사이의 난수를 발생하였습니다. 맞추어보세요 >>");
		int answer = sc.nextInt();
		
		if(num>answer)System.out.println(answer+"보다 큽니다.");
		if(num<answer)System.out.println(answer+"보다 작습니다.");
		count++;
		
		if(answer == num) {
			System.out.println("정답입니다."+count+"번만에 맞추셨습니다.");break;
		}
		
		}
	}
}


//[문제] 숫자맞추기 게임
//1~100 사이의 난수를 발생하여 발생한 난수를 맞추는 게임
//
//[실행결과]
//1~100 사이의 난수를 발생하였습니다. (85)
//맞추어보세요
//
//숫자 입력 : 50
//50보다 큽니다.
//
//숫자 입력 : 90
//90보다 작습니다.
//..
//..
//..
//숫자 입력 : 85
//딩동뎅..x번만에 맞추셨습니다