package com.java;

import java.util.ArrayList;

public class ArrayListEx1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList(10); //참조변수의 크기 4byte,8byte
		list.add("111");
		list.add("222");
		list.add("333");
		list.add("222");//중복요소 추가가능
		list.add(333); //list add(new Integer(333));
		
		System.out.println(list);
		
		list.add(0,"000");//void add(int index, Object obj)
		System.out.println(list);
		
		System.out.println("index = "+list.indexOf("333"));
		
		list.remove("333"); //boolean remove(Object obj)
		System.out.println(list);
		
		System.out.println(list.remove("333"));
		System.out.println("index="+list.indexOf("333"));
		
		for(int i=0; i<list.size(); i++)
			list.set(i, i+""); //Object set(int index, Object obj)
		
		System.out.print("{");
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+", ");
		}
		System.out.println("}");
		
//		for(int i=0; i<list.size(); i++)
//			list.remove(i);
//		
//		System.out.println(list);
		
		for(int i=list.size()-1; i>=0; i--)
			list.remove(i); 
		
		System.out.println(list);
		 
		
		
		
		
		
	}
}
