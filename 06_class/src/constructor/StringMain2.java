package constructor;

import java.util.Scanner;

public class StringMain2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input="";
		String s1 = "";
		String s2 = "";
		String output = "";
		int count = 0;
		//문자열 입력 : aabba      
		//현재 문자열 입력 : aa      
		//바꿀 문자열 입력 : dd
		//ddbba
		//1번 치환
		
		System.out.print("문자열 입력 :");
		input = scan.next();
		System.out.print("현재 문자열 입력 :");
		s1 = scan.next();
		System.out.print("바꿀 문자열 입력 :");
		s2 = scan.next();
		output = input.replace(s1, s2);
		System.out.println(output);
		
		
//		System.out.println(s1.indexOf(input));
		
//		System.out.println(input.indexOf(s1));
//		input = input.replaceFirst(input, s2);
//		System.out.println(input.indexOf(s1));
//		System.out.println(input.indexOf(s1));
//		System.out.println(input.indexOf(s1));
		
		while(input.indexOf(s1)!=-1) {
			input= input.replaceFirst(input,s2);
			count++;
		}
		System.out.println("치환은 "+count+" 번");
		count=0;
		
//		while(input.indexOf(s1)!=-1) {
//			System.out.println("?");
//			input = input.replaceFirst(input, s1);
//			count++;	
//		}
		
//		for(int i=0; i<input.length(); i++)
//			for(int j=0; j<s1.length(); j++)
//				if(input.charAt(j) == s1.charAt(j)) {
//					
//					
//				}
//				
	
		
		

		System.out.println();
		
		
		//문자열 입력 : aAbbA
		//현재 문자열 입력 : aa
		//바꿀 문자열 입력 : dd
		//ddbba
		//1번 치환
		
		System.out.print("문자열 입력 :");
		input = scan.next();
		System.out.print("현재 문자열 입력 :");
		s1 = scan.next();
		System.out.print("바꿀 문자열 입력 :");
		s2 = scan.next();
		
	
		String tmp = input.toLowerCase();
		output = tmp.replace(s1, s2);
		
		System.out.println(output);
//////////
		
		while(input.indexOf(s1)!=-1) {
			input= input.replaceFirst(input,s2);
			count++;
		}
		System.out.println("치환은 "+count+" 번");
		count=0;
		
		//------------------------------------------------------
		
		
		//문자열 입력 : aabbaa
		//현재 문자열 입력 : aa
		//바꿀 문자열 입력 : dd
		//ddbbdd
		//2번 치환

		System.out.print("문자열 입력 :");
		input = scan.next();
		System.out.print("현재 문자열 입력 :");
		s1 = scan.next();
		System.out.print("바꿀 문자열 입력 :");
		s2 = scan.next();
		
	
		output = input.replaceAll(s1, s2);
		
		System.out.println(output);
	
		
		
		while(input.indexOf(s1)!=-1) {
			input= input.replaceFirst(input,s2);
			count++;
		}
		System.out.println("치환은 "+count+" 번");
		count=0;
		
		
		
		
		
		//문자열 입력 : AAccaabbaaaaatt
		//현재 문자열 입력 : aa
		//바꿀 문자열 입력 : dd
		//ddccddbbddddatt
		//4개 치환
		System.out.print("문자열 입력 :");
		input = scan.next();
		System.out.print("현재 문자열 입력 :");
		s1 = scan.next();
		System.out.print("바꿀 문자열 입력 :");
		s2 = scan.next();
		
		
		String tmp1 = input.toLowerCase();
		output = tmp1.replaceAll(s1, s2);
		
		System.out.println(output);
		
		while(input.indexOf(s1)!=-1) {
			input= input.replaceFirst(input,s2);
			count++;
		}
		System.out.println("치환은 "+count+" 번");
		count=0;
		
		
		//문자열 입력 : aabb
		//현재 문자열 입력 : aaaaa
		//바꿀 문자열 입력 : ddddd
		//입력한 문자열의 크기가 작습니다
		//치환 할 수 없습니다
		System.out.print("문자열 입력 :");
		input = scan.next();
		System.out.print("현재 문자열 입력 :");
		s1 = scan.next();
		System.out.print("바꿀 문자열 입력 :");
		s2 = scan.next();
		if(input.length()<s1.length()) {
			System.out.println("입력한 문자열의 크기가 작습니다.");
			System.out.println("치환할 수 없습니다.");
		}
		
		
		
	}
}

//
//[문제] 치환하는 프로그램을 작성하시오 - indexOf(), replace()
//- String 클래스의 메소드를 이용하시오
//- 대소문자 상관없이 개수를 계산하시오
//
//[실행결과]
//문자열 입력 : aabba      
//현재 문자열 입력 : aa      
//바꿀 문자열 입력 : dd
//ddbba
//1번 치환
//---------------------
//문자열 입력 : aAbbA
//현재 문자열 입력 : aa
//바꿀 문자열 입력 : dd
//ddbba
//1번 치환
//----------------
//문자열 입력 : aabbaa
//현재 문자열 입력 : aa
//바꿀 문자열 입력 : dd
//ddbbdd
//2번 치환
//----------------
//문자열 입력 : AAccaabbaaaaatt
//현재 문자열 입력 : aa
//바꿀 문자열 입력 : dd
//ddccddbbddddatt
//4개 치환
//----------------
//문자열 입력 : aabb
//현재 문자열 입력 : aaaaa
//바꿀 문자열 입력 : ddddd
//입력한 문자열의 크기가 작습니다
//치환 할 수 없습니다