import java.util.Scanner;

public class MultiArrEx2 {
	public static void main(String[] args) {
		final int SIZE = 5;
		int[][] bingo = new int[SIZE][SIZE];
		int answer = 0;
		//int i,j=0;
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<bingo.length; i++) {
			for(int j=0; j<bingo[i].length; j++) {
				bingo[i][j] = (int)((Math.random()*25)+1);		
			}
		}
	
		
		
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
			
			
		
	}
}
