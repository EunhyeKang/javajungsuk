package _multiFor;

public class MultiForTest4 {
	public static void main(String[] args) {
		int tmp = 0;
		
		
		for(int k=1; k<=3; k++) {
				
			if(k==1) {
				for(int i=1; i<=9; i++) {
					for(int j=2; j<=4; j++) {
						System.out.printf("%d*%d=%d   ",j,i,i*j);
					}
					System.out.println();	
				}
			}
			if(k==2){
				for(int i=1; i<=9; i++) {
					for(int j=5; j<=7; j++) {
						System.out.printf("%d*%d=%d   ",j,i,i*j);
					}
					System.out.println();	
				}
			}
			
			if(k==3){	
				for(int i=1; i<=9; i++) {
					for(int j=8; j<=9; j++) {
						System.out.printf("%d*%d=%d   ",j,i,i*j);
					}
					System.out.println();	
				}
			}
			
			
			System.out.println();		
		}
		
//
////		for(int i=0; i<3; i++) {
//			for(int j=2; j<=9; j++) {
//				for(int k=1; k<=9; k++) {
//				System.out.printf("%d*%d=%d  ",k,j,k*j);
//				}
//			}
//			
////			if(i%3==0)System.out.println();
////			System.out.println();
////		}
		
		
		
	}
	
}


//[문제] 구구단
//- 3단씩 끊어서 출력하세요
//- 3중 for, if문 사용

//[실행결과]
//2*1=2   3*1=3   4*1=4
//2*2=4   3*2=6   4*2=8
//2*3=6   3*3=9   4*3=12
//2*4=8   3*4=12   4*4=16
//2*5=10   3*5=15   4*5=20
//2*6=12   3*6=18   4*6=24
//2*7=14   3*7=21   4*7=28
//2*8=16   3*8=24   4*8=32
//2*9=18   3*9=27   4*9=36
//
//5*1=5   6*1=6   7*1=7
//5*2=10   6*2=12   7*2=14
//5*3=15   6*3=18   7*3=21
//5*4=20   6*4=24   7*4=28
//5*5=25   6*5=30   7*5=35
//5*6=30   6*6=36   7*6=42
//5*7=35   6*7=42   7*7=49
//5*8=40   6*8=48   7*8=56
//5*9=45   6*9=54   7*9=63
//
//8*1=8   9*1=9
//8*2=16   9*2=18
//8*3=24   9*3=27   
//8*4=32   9*4=36   
//8*5=40   9*5=45   
//8*6=48   9*6=54   
//8*7=56   9*7=63   
//8*8=64   9*8=72
//8*9=72   9*9=81