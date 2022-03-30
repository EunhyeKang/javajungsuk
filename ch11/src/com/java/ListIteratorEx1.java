package com.java;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorEx1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		ListIterator it = list.listIterator(); //ArrayList나 LinkedList와 같이 List인터페이스를 구현한 컬렉션에서만 사용가능. 
		
		while(it.hasNext()) {
			System.out.print(it.next());
		}
		System.out.println();
		while(it.hasPrevious()) {
			System.out.print(it.previous());
		}
		
		System.out.println();
	}
}
