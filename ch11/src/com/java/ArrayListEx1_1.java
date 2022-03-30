package com.java;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1_1 { //책 예제
	public static void main(String[] args) {
		ArrayList list1 = new ArrayList(10);
		list1.add(new Integer(5));
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);
		
		ArrayList list2 = new ArrayList(list1.subList(1, 4));
		
		print(list1,list2);
		
		Collections.sort(list1); //Collections.sort(List l)를 이용해서 정렬하였다.
		Collections.sort(list2);
		print(list1, list2);
		
		//list1 이 list2의 모든 요소를 포함하고 있을때만 true
		System.out.println("list1.containsAll(list2) : "+ list1.containsAll(list2));
		
		list2.add("B"); //새로운 객체를 저장하였다.
		list2.add("C");
		list2.add(3,"A");//중간에 삽입 시 자리이동이 필요해진다.
		print(list1, list2);
		
		list2.set(3, "AA"); //다른 객체로 변경
		print(list1, list2);
		
		//list1에서 list2와 겹치는 부분만 남기고 나머지는 삭제한다.
		System.out.println("list1.retainAll(list2):" + list1.retainAll(list2));//교집합
		print(list1, list2);
		
		//list2에서 list1에 포함된 객체들을 삭제한다.
		for(int i=list2.size()-1; i>=0; i--) {
			if(list1.contains(list2.get(i)))
				list2.remove(i);
		}
		print(list1, list2);
		
	}
	
	
	private static void print(ArrayList list1, ArrayList list2) {
		// TODO Auto-generated method stub
		System.out.println("list1:"+list1);
		System.out.println("list2:"+list2);
		System.out.println();
		
	}
}
