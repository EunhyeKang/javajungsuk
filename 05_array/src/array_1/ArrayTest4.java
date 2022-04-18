package array_1;

import java.util.Scanner;

public class ArrayTest4 {
	int maxNum;
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int[] ar;
		
		
		System.out.print("배열 크기를 입력:");
		int size = scan.nextInt();	
		ar = new int[size];
		
		for(int i=0; i<ar.length; i++) {
			System.out.printf("ar[%d]의 값을 입력 : ",i);
			ar[i] = scan.nextInt();
		}
		
		int sum=0;
		
		for(int data :ar) {
			System.out.print(data+"  ");
			sum+=data;
		}
		
		
//		int max = ar[0];
//		for(int i=1; i<size; i++) {
//			if(ar[i]>max) max = ar[i];
//		}
//		
//		int min = ar[0];
//		for(int i=1; i<size; i++) {
//			if(ar[i]<min) min = ar[i];
//		}
//		
		int max,min;
		max = min = ar[0];
		for(int i=1; i<size; i++) {
			if(ar[i]>max) max = ar[i];
			if(ar[i]<min) min = ar[i];
		}
		
	
		
		
		System.out.println();
		System.out.println("합 = "+sum);
		System.out.println("최대값 = "+ max);
		System.out.println("최대값 = "+ getMax(ar));
		System.out.println("최소값 = "+ min);
	}
	
	
	public static int getMax(int[] arr) {
		ArrayTest4 at = new ArrayTest4();
		
		int max = arr[0];
		for(int i=0; i<arr.length-1; i++) {
		   
			if(max<arr[i+1]) {
//				int tmp = arr[i+1];
//				arr[i+1] = max;
//				max = tmp;
				max = arr[i+1];
			}
		}
		at.maxNum = max;
		return at.maxNum;
	}
}
