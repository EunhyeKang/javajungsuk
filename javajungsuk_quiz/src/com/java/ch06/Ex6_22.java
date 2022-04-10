package com.java.ch06;

public class Ex6_22 {
	public static void main(String[] args) {
		String str = "123";
		System.out.println(str+"는 숫자입니까? "+isNumber(str));
		
		str="1234o";
		System.out.println(str+"는 숫자입니까?"+isNumber(str));
	}

	private static Boolean isNumber(String str) {
		// TODO Auto-generated method stub
		
		for(int i=0; i<str.length(); i++) {
			char c = str.charAt(i);
			
			if(!('0'<= c && c<='9')) return false;
		}
		
		return true;
		
	}
}
