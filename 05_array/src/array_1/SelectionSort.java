package array_1;

public class SelectionSort {
	public static void main(String[] args) {
	
		int []ar = {25,78,36,55,40};

		System.out.print("정렬 전 : ");
		
		for(int data : ar) {
			System.out.print(data);
		}
		System.out.println();
		
		
		
		System.out.print("정렬 후 : ");
		
		for(int data : ar) {
			System.out.print(data);
		}
		System.out.println();
		
		
		System.out.println();
		

		for(int i=0; i<ar.length-1; i++) {
			for(int j=i+1; j<ar.length; j++) {
				System.out.println("i="+i+","+"j="+j);		
			}
			System.out.println();
		}
		
		
		for(int i=0; i<ar.length-1; i++) {
			for(int j=1; j<ar.length; j++) {
//				System.out.println("i="+i+","+"j="+j);	
				
				if(ar[i]>ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
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