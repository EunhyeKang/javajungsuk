package com.test;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

//문제4) 1 ~ 6까지 임의의 정수를 생성하는 Math.random()을 사용하여 작성하세요.
//생성된 값을 정수배열(크기 5)를 선언 후 값을 저장 후 가장 큰 값을 구하는 코드를 작성.
public class Exam04 {
	public static void main(String[] args) {
		int[] arr = new int[5];
		int max = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*10 + 1);
			System.out.printf("%d\t",arr[i]);
		}
		
		System.out.println();
		System.out.println();
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.printf("가장 큰 값은 : %d%n",max);
		System.out.println();
		
		for(int num : arr) {
			if( num >max) {
				max = num;
			}
		}
		System.out.printf("가장 큰 값은 : %d",max);
		
		System.out.println();
		

	}
}
