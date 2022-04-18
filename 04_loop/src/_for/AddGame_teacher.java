package _for;

import java.util.Scanner;

public class AddGame_teacher {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b, dab, count=0;
		int i, j;
		
		for(i=1; i<=5; i++) { //5문제
			a = (int)(Math.random()*90) + 10; //10 ~ 99
			b = (int)(Math.random()*90) + 10;
			
			for(j=1; j<=2; j++) { //기회를 2번
				System.out.print("[" + i + "] " + a + " + " + b + " = ");
				dab = scan.nextInt();
				if(dab == a+b) {
					count++; //맞힌 개수
					System.out.println("딩동뎅");
					break; //for j를 벗어나라
				}else {
					if(j== 2)System.out.println("틀렸다..정답은 " + (a+b) + "입니다");
					else System.out.println("틀렸다");
				}
			}//for j
			
		}//for i
		System.out.println();
		System.out.println("당신은 총 5문제중에서 " + count + "문제 맞추어서 " + count*20 +"점 입니다.");
	}

}

/*
[문제] 덧셈
- 10 ~ 99사이의 난수를 2개(a, b) 발생하여 출력
- 문제는 총 5문제 제공한다
- 맞추면 20점씩 계산
- 틀리면 1번의 기회를 더 준다. (다중 for문)

[실행결과]
    a    b
[1] 25 + 36 = 52
틀렸당
[1] 25 + 36 = 61
딩동뎅

[2] 10 + 12 = 22
딩동뎅...참 잘했어요

[5] 12 + 90 = 100
틀렸다
[5] 12 + 90 = 150
틀렸다...정답은 102 입니다.

당신은 총 5문제중에서 x문제 맞추어서 xx점 입니다.
*/







