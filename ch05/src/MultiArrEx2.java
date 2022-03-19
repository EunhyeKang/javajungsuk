import java.util.Scanner;

public class MultiArrEx2 {
	public static void main(String[] args) {
		final int SIZE = 5;
		int[][] bingo = new int[SIZE][SIZE];
		int answer = 0;
		int x,y=0;
		Scanner scanner = new Scanner(System.in);
		
		/* 빙고판에 중복값 발생 해서 안됨 
		for(int i=0; i<bingo.length; i++) {
			for(int j=0; j<bingo[i].length; j++) {
				bingo[i][j] = (int)((Math.random()*25)+1);		
			}
		}
		 */
		
		// 빙고판에 1~25값(size*size) 초기화
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				bingo[i][j] = i * SIZE + (j+1);	// x5 +5	
//				System.out.printf("%3d",bingo[i][j]);
			}
//			System.out.println(); //1~25값 셋팅찍어봄. 잘 출력 확
		}
		
		// 빙고판 섞어주기 
		for(int i=0; i<SIZE; i++) {
			for(int j=0; j<SIZE; j++) {
				int tmp=0;
				x = (int)(Math.random()*SIZE);
				y = (int)(Math.random()*SIZE);
						
				tmp = bingo[i][j];
				bingo[i][j] = bingo[x][y];
				bingo[x][y] = tmp;
			}
		}
		
		
		
		
		
		// 사용자 빙고게임 시작  
		
			do {
				
				for(int i=0; i<bingo.length; i++) {
					for(int j=0; j<bingo[i].length; j++) {
						System.out.printf("%3d",bingo[i][j]);
					}
					System.out.println();
				}
				
			
				System.out.print("1~25숫자를 입력하세요(종료:0) >>");
				answer = scanner.nextInt();
				
				outer:
				for(int i=0; i<bingo.length; i++) {
					for(int j=0; j<bingo[i].length; j++) {
						
						if(answer == bingo[i][j]) {
							bingo[i][j] = 0; break outer;
						}
					
					}
				}
			
			} while(answer!=0);
			
			System.out.println("End game");
		
	}
}
