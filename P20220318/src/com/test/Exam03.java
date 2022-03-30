package com.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//문제3) 정수형배열 선언하고 사용자로 세개의 정수값을 입력받아서 배열에 저장. 제일 큰값을 구하는 코드를 작성.
public class Exam03 {
	
	/*/처음 코드
	public static void main(String[] args) {
		int [] arr = new int[3];
		int max = arr[0];
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d 번째 정수를 입력하세요> ",i+1);
			arr[i] = scanner.nextInt();
		}
		
		for(int i=1; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("가장 큰 값은 : " + max);
	}
	*/
	
	//두번째코드
	public static void main(String[] args) {
		int []arr= new int[3];
		

		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<arr.length; i++) {
			System.out.printf("%d 번째 정수를 입력하세요> ",i+1);
			arr[i] = scanner.nextInt();
		}
		// Arrays의 sort메소드 이용 정렬. //성능떨어짐. 
		Arrays.sort(arr);
		System.out.println(arr[arr.length-1]);
		
		System.out.println();
		
		//향상된 for문 
		int max = arr[0];
		for(int num : arr) {
			if(num>max) {
				max = num;
			}
		}
		System.out.println("가장 큰 값은 : " + max);
		
		
	}
}
