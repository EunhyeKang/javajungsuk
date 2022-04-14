package _for;

import java.util.Scanner;

public class AddGame {
	public static void main(String[] args) {
		
		// a~b 사이의 난수 만들기
		// (int)(Math.ramdon()*(b-a+1)) + a
		
		int count = 0;
		int point = 0;
		Scanner sc = new Scanner(System.in);
		
		
		for(int i=0; i<5; i++) {
			
			int a = (int)(Math.random()*90)+10;
			int b = (int)(Math.random()*90)+10;
			
			System.out.printf("[%d] %d + %d = ", i+1,a,b);
			int answer = sc.nextInt();
			
			if(answer == (a+b)) {
				System.out.println("정답입니다.");
				count++;
				point += 20;
			}
			else
				System.out.println("오답");
		}
		
		System.out.printf("당신은 총 5문제중에서 %d개 맞췄습니다. %d점입니다.",count,point);
	}
}

//[문제] 덧셈
//- 10 ~ 99사이의 난수를 2개(a, b) 발생하여 출력
//- 문제는 총 5문제 제공한다
//- 맞추면 20점씩 계산
//
//[실행결과]
//    a    b
//[1] 25 + 36 = 52
//틀렸당
//
//[2] 10 + 12 = 22
//딩동뎅...참 잘했어요
//
//[5] 12 + 90 = 100
//틀렸다
//
//당신은 총 5문제중에서 x문제 맞추어서 xx점 입니다.

