package com.java.ch077;

import com.java.ch077.Outer.Inner;

class Outer{
	class Inner{
		int iv=100;
	}
}
public class Exercise7_25 {
	public static void main(String[] args) {
		Outer o = new Outer();
		Outer.Inner il = o.new Inner();
		
		System.out.println(il.iv);
		
	}
}
