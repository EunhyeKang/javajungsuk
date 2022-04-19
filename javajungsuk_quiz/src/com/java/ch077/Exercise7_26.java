package com.java.ch077;

import com.java.ch077.Outer.Inner;

class Outer1{
	static class Inner{
		int iv=200;
	}
}
public class Exercise7_26 {
	public static void main(String[] args) {
		Outer1 o = new Outer1();
	
		Outer1.Inner li = new Outer.Inner();
		System.out.println(li.iv);
		
	}
}
