package com.java;

public class MyVectorTest {
	public static void main(String[] args) {
		MyVector v = new MyVector();
		
		System.out.println(v.size());
		System.out.println(v.capacity());
		
		v.add("1");
		v.add("2");
		v.add("3");
		
		System.out.println(v);
		
		System.out.println("capacity:"+v.capacity);
		
		//변경해본 ensureCapacity 동작확인 - 2가지방법
		v.ensureCapacity(30);
		
		System.out.println("capacity:"+v.capacity);
	}
}
