package com.java;

import java.util.Vector;

public class VectorEx1 {
	public static void main(String[] args) {
		Vector v = new Vector(5);
		v.add("1");
		v.add("2");
		v.add("3");

		print(v);
		
		v.trimToSize(); // 빈 공간을 없앤다. (용량과 크기가 같아진다)
		System.out.println("========After trimToSize==========");
		print(v);
		
		v.ensureCapacity(6);
		System.out.println("========After ensureCapacity==========");
		print(v);
		
		v.setSize(7); //capacity가 부족할 경우  자동적으로 기존의 크기보다 2배의 크기로 증가된다. 기존6, 그래서 12
		System.out.println("========After setSize==========");
		print(v);
		
		v.clear();
		System.out.println("========After clear==========");
		print(v);
		
		
		
		
		
		
		
		
		
	}
	
	
	
	public static void print(Vector v) {
		System.out.println(v);
		System.out.println("size = "+ v.size());
		System.out.println("capacity = "+ v.capacity());
	}
}
