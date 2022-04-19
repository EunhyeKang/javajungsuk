package array_1;

import java.io.IOException;
import java.util.Scanner;

public class Baseball_re {
	public static void main(String[] args) throws IOException {
		
		
		int [] com = new int[3];
		int [] user = new int[3];
		int strike=0;
		int ball=0;
		int count=0;
		boolean flag = true; 
		
		System.out.print("게임을 실행하시겠습니까(Y/N)");
	
		//난수생성
		for(int i=0; i<com.length; i++) {
			com[i] = (int)(Math.random()*9)+1;
			for(int j=0; j<i; j++) {
				if(com[i]==com[j]) {
					i--;
					break;
				}//if
			}//for j
		}//for i
		
		
		for(int c : com) // com값 확인
			System.out.print(c);
		
		
		
		while(flag) { //게임을 실행하겠습니까? yes or no
			
			String input = new Scanner(System.in).nextLine(); //  y/n 입력받기 
			
			
			if(input.equals("y")||input.equals("Y")) {//게임시작 Y 선택시
				
				
				System.out.print("게임을 시작합니다.\n");
				
			
				while(true) { // 다 맞출때까지 while문 반복
					System.out.print("숫자 입력 : ");
					int num = new Scanner(System.in).nextInt();
					
					
					//입력값 user배열에 담기
					for(int i=user.length-1; i>=0; i--) {
						user[i] = num%10;
						num = num/10;
					}
					
					System.out.println();
					
					
					// strike 개수확인
					for(int i=0; i<com.length; i++) {
						if(com[i]==user[i]) {
								strike++;
						}	
					}
					// ball 개수확인
					for(int k=0; k<com.length; k++) {
						for(int j=0; j<user.length; j++) {
							if(com[k]==user[j] && com[j]!=user[j]) // strike랑 중복요소 제거
									ball++;
						}
					}
					
					System.out.print(strike+"스트라이크 ");
//					System.out.println((ball-strike)+"볼"); // ball for문에서 중복부분 처리해주기
					System.out.println((ball)+"볼");
					
					System.out.println();	
					
					count++; //몇번만에 맞췄는지 카운트
					
					if(strike==3) { 
						System.out.printf("축하합니다...몇 %d번만에 맞추셨습니다.\n",count); 
						flag = false; break; 
					}	
					
					strike=0; ball=0; // 초기화
					
				}//while
				
			}//if 
			
			
			else if(input.equals("n")||input.equals("N")){ //게임종료 N 선택시
				System.out.print("게임을 종료합니다.");
				flag = false;
				break; 
				//종료
			}
			else { // 잘못입력했을때
				System.out.println("잘못입력하셨습니다.게임을 실행하시겠습니까(Y/N)");
			}
		
		}
		
		
		
	}
}


//위치도맞고 숫자도맞으면 1스트라이크 0볼
//위치다안맞고 숫자만2개 맞으면 0스트라이크 2볼
//3번맞을때까지 반복 while문 
//배열 for while if
//축하해 몇번만에 맞췄는지.

//
//야구 게임 - 숫자 맞추기 게임
//- 크기가 3개인 정수형 배열을 잡고 1~9사이의 난수를 발생한다
//- 난수는 중복을 허용하지 않는다
//
//[실행결과]
//게임을 실행하시겠습니까(Y/N) : w
//게임을 실행하시겠습니까(Y/N) : q
//게임을 실행하시겠습니까(Y/N) : y
//
//게임을 시작합니다
//
//숫자입력 : 123
//1스트라이크 0볼
//
//숫자입력 : 182
//0스트라이크 2볼
//
//...
//
//숫자입력 : 428
//3스트라이크 0볼
//
//축하합니다...몇x번만에 맞추셨습니다.