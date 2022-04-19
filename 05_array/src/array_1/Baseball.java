package array_1;

import java.io.IOException;
import java.util.Scanner;

public class Baseball {
	public static void main(String[] args) throws IOException {
		
		
		int [] com = new int[3];
		int [] user = new int[3];
		int count=0;
//		
//		게임을 실행하시겠습니까(Y/N) : w
//		게임을 실행하시겠습니까(Y/N) : q
//		게임을 실행하시겠습니까(Y/N) : y
		System.out.print("게임을 실행하시겠습니까(Y/N)");
	
		String input = new Scanner(System.in).nextLine();
	
		
		//컴 값 미리 확인해서 테스트해볼때 위치 
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
		//com입력값출력
		for(int i=0; i<user.length;i++) {
			System.out.printf("com[%d]=%d ",i,com[i]);
//			System.out.println();
		}
		
		
		
		//게임시작
		if(input.equals("y")||input.equals("Y")) {
			
//			//난수생성
//			for(int i=0; i<com.length; i++) {
//				com[i] = (int)(Math.random()*9)+1;
//				for(int j=0; j<i; j++) {
//					if(com[i]==com[j]) {
//						i--;
//						break;
//					}//if
//				}//for j
//			}//for i
			
			
			
			
			//맞추기
			while(true){
				
				
				System.out.print("게임을 시작합니다.\n");
				
				System.out.print("숫자 입력 : ");
				int num = new Scanner(System.in).nextInt();
				
//				System.out.print("사용자입력값:");

				//user배열에 담기
				for(int i=user.length-1; i>=0; i--) {
					user[i] = num%10;
					num = num/10;
//					System.out.printf("user[%d]=%d",i,user[i]);
				}
				
				
				
	/**************제대로 들어갔는지 확인해보려고 ******/
//				//com입력값출력
//				for(int i=0; i<user.length;i++) {
//					System.out.printf("com[%d]=%d ",i,com[i]);
////					System.out.println();
//				}
//				System.out.println();
//				//user입력값출력
//				for(int i=0; i<user.length;i++) {
//					System.out.printf("user[%d]=%d ",i,user[i]);
////					System.out.println();
//				}
				
				
				
				
				System.out.println();
				
				//맞췄는지 확인
				
				int strike=0;
				int ball=0;
				
				for(int i=0; i<com.length; i++) {
					if(com[i]==user[i]) {
						strike++;
					}	
				}
				
				for(int k=0; k<com.length; k++) {
					for(int j=0; j<user.length; j++) {
						if(com[k]==user[j])
								ball++;
					}
				}
				
				System.out.print(strike+"스트라이크 ");
				System.out.println((ball-strike)+"볼");
				System.out.println();	
				
				count++;
				
				if(strike==3)System.out.printf("축하합니다...몇 %d번만에 맞추셨습니다.\n",count); 
			
				
			}//while
			
		}
		//게임종료
		else if(input.equals("n")||input.equals("N")){
			System.out.print("게임을 종료합니다.");
			//종료
			
		}
		else {
			System.out.print("잘못입력하셨습니다.");
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