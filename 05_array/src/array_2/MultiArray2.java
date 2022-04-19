package array_2;

public class MultiArray2 {
	public static void main(String[] args) {
		int [][] ar = new int[10][10];
		
		
//		//입력
//		int num=0;
//		for(int i=0; i<ar.length; i++) {
//			for(int j=0; j<ar[i].length; j++) {
//				ar[i][j] = ++num;
//			}
//		}
//		
//		//출력	
//		for(int i=0; i<ar.length; i++) {
//			for(int j=0; j<ar[i].length; j++) {
//				System.out.print(String.format("%4d", ar[i][j]));
//			}
//			System.out.println();
//		}
		
		
//		//입력
//		int num=0;
//		for(int i=0; i<ar.length; i++) {
//			for(int j=0; j<ar[i].length; j++) {
//				ar[j][i] = ++num;
//			}
//		}
//		
//		//출력	
//		for(int i=0; i<ar.length; i++) {
//			for(int j=0; j<ar[i].length; j++) {
//				System.out.print(String.format("%4d", ar[i][j]));
//			}
//			System.out.println();
//		}
//		
		
		
		//입력
		int num=1;
		for(int i=ar.length-1; i>=0; i--) {
			for(int j=ar[i].length-1; j>=0; j--) {
				ar[j][i] = num++;
			}
		}
		
		
//		num=100;
//		for(int i=0; i<ar.length; i++) {
//			for(int j=0; j<ar[i].length; j++) {
//				ar[j][i] = num--;
//			}
//		}
		
		
		//출력	
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar[i].length; j++) {
				System.out.print(String.format("%4d", ar[i][j]));
			}
			System.out.println();
		}
		
		
		
		
		
		
		
	}
}
