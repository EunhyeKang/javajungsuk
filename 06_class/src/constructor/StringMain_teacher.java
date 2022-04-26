package constructor;

import java.util.Scanner;

public class StringMain_teacher {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String str="";
		String target = "";
		String replacing="";
		int index = 0;
		int count = 0;
	
		
		System.out.print("문자열 입력 :");
		str = scan.next().toLowerCase();
		System.out.print("현재 문자열 입력 :");
		target = scan.next().toLowerCase();
		System.out.print("바꿀 문자열 입력 :");
		replacing = scan.next();
	
		
		if(str.length()<target.length()) {
			System.out.println("입력한 문자열의 크기가 작습니다.");
			System.out.println("치환하지 못했습니다.");
		}else {
				
			/*
			 * str -> "baaCCaatt" target -> "aa" str.indexOf("aa",0) --1번째위치 1 +
			 * "aa".length() str.indexOf("aa",3) --5번째위치 5 + "aa".length()
			 * str.indexOf("aa",7) ---   -1
			 * 
			 * 
			 * 012345678901234567 str -> "bfcaaaCCaaaaaaaatt" target -> "aa"
			 * str.indexOf("aaa",0) --3번째위치 3+ "aaa".length() str.indexOf("aaa",6) --8번째위치 8
			 * + "aaa".length() str.indexOf("aaa",11) --11번째위치 11 + "aaa".length()
			 * str.indexOf("aaa",14) ----   -1
			 */
			
//			str.indexOf(target,0);
			while( (index = str.indexOf(target,index)) != -1 ) {
				count++;
				index = index + target.length();
					
			}//while
		
			System.out.println(str.replace(target, replacing));
			System.out.println(count + "개 치환");
			
		}//else
		
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