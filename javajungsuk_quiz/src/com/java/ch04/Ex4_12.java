package com.java.ch04;

public class Ex4_12 {
	public static void main(String[] args) {
		
		for(int i=2; i<10; i++) {
			for(int j=1; j<=3; j++) {
				System.out.printf("%d*%d=%d   ",i,j,i*j);
			}
			System.out.println();
			if(i%3==1)System.out.println();
		}
		
		System.out.println();System.out.println();System.out.println();
		
		
		
		
	}
}
