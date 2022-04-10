package com.java.ch06;

public class Ex6_23 {
	public static void main(String[] args) {
		int [] data = {3,2,9,4,7};
		
		System.out.println(java.util.Arrays.toString(data));
		System.out.println("최대값:"+max(data));
		System.out.println("최대값:"+max(null));
		System.out.println("최대값:"+max(new int[] {}));
	}
	
	private static int max (int[] arr) {
		
		if(arr==null || arr.length==0) return -99999;
		
		int maxNum= arr[0];
		
		for(int i=0; i<arr.length-1; i++) {
			if(maxNum<arr[i+1])
				maxNum = arr[i+1];
		}
		return maxNum;
	}
}
