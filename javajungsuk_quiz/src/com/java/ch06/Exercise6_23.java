package com.java.ch06;

public class Exercise6_23 {
	
	public static int max(int[] arr) {
		if(arr==null || arr.length==0)
			return -999999;
		
		int max = arr[0]; //배열 첫번째값을 최대값으로 초기화
		for(int i=1; i<arr.length; i++) { //배열의 두번째값부터 비교
			if(max<arr[i])
				max=arr[i];			
		}
		return max;
	}
	
	
	public static void main(String[] args) {
		int[]data = {3,2,9,4,7};
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("max :"+max(data));
		System.out.println("max :"+max(null));
		System.out.println("max :"+max(new int[] {}));
	}
}
