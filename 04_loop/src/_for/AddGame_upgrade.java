package _for;

import java.util.Scanner;

public class AddGame_upgrade {
	public static void main(String[] args) {
		
		int count=0; int point=0;
		int answer;
		int re = 0;
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			re=0;
			int a = (int)(Math.random()*90)+10;
			int b = (int)(Math.random()*90)+10;
			
			System.out.printf("[Q%d] %d + %d = ",i+1,a,b);
			answer = scanner.nextInt();
			
			if((a+b) == answer) { //정답일때
				System.out.println("정답입니다.");
				count++; //맞힌개수 
				point+=20; //보너스점수
			}
			else { //오답일때
				if(re==1)break;
				
				System.out.println("틀렸습니다.");
				System.out.printf("한번더 기회! %d + %d = ",a,b);
				answer = scanner.nextInt();
				re++; 
				if(answer==(a+b)) {System.out.println("정답입니다."); point+=20; count++;}
				else {System.out.printf("틀렸습니다. 정답은 %d입니다.%n",a+b);}
			}
			
		}
	
		System.out.printf("당신은 총 5문제중에서 %d문제 맞추어서 %d점 입니다.",count,point);
		
	}
}

//[문제] 덧셈
//- 10 ~ 99사이의 난수를 2개(a, b) 발생하여 출력
//- 문제는 총 5문제 제공한다
//- 맞추면 20점씩 계산
//-틀리면 1번의 기회를 더 준다.(다중for문)
////
//[실행결과]
//  a    b
//[1] 25 + 36 = 52
//틀렸당
//
//[2] 10 + 12 = 22
//딩동뎅...참 잘했어요
//
//[5] 12 + 90 = 100
//틀렸다
////
//[5] 12 + 90 = 150
//틀렸다 ... 정답은 102 입니다.

//당신은 총 5문제중에서 x문제 맞추어서 xx점 입니다.









//
//[문제] 덧셈
//- 10 ~ 99사이의 난수를 2개(a, b) 발생하여 출력
//- 문제는 총 5문제 제공한다
//- 맞추면 20점씩 계산
//- 틀리면 1번의 기회를 더 준다. (다중 for문)
//
//[실행결과]
//    a    b
//[1] 25 + 36 = 52
//틀렸당
//[1] 25 + 36 = 61
//딩동뎅
//
//[2] 10 + 12 = 22
//딩동뎅...참 잘했어요
//
//[5] 12 + 90 = 100
//틀렸다
//[5] 12 + 90 = 150
//틀렸다...정답은 102 입니다.
//
//당신은 총 5문제중에서 x문제 맞추어서 xx점 입니다.