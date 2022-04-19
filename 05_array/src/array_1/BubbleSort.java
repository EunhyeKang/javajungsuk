package array_1;

public class BubbleSort {
	public static void main(String[] args) {
	
		int []ar = {25,78,36,55,40};

		System.out.print("정렬 전 : ");
		
		for(int data : ar) {
			System.out.print(data+" ");
		}
		System.out.println();
		
		
		

		for(int i=0; i<ar.length-1; i++) {
			for(int j=1; j<ar.length; j++) {
				System.out.println("i="+i+","+"j="+j);		
			}
			System.out.println();
		}
		
		
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar.length-i-1; j++) {
//				System.out.println("i="+i+","+"j="+j);	
				
				if(ar[j]>ar[j+1]) {
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}//if
			}//for j
			
			//중간결과
			 for(int data : ar) {
				 System.out.print(data + "  ");
			 }
		System.out.println();
		}
		
		
		System.out.println("정렬 후 : ");
		for(int data : ar ) {
			System.out.print(data + "  ");
		}
		System.out.println();
		
	}
}

/*
정렬(Sort)
-오름차순
-내림차순

*/