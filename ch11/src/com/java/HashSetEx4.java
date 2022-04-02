package com.java;

import java.util.HashSet;
import java.util.Objects;

public class HashSetEx4 {
	public static void main(String[] args) {
		HashSet set = new HashSet();
		
		//HashSet의 add()메서드는 새로운 요소를 추가하기 전에
//		기존에 저장된 요소와 같은 것인이 판별하기 위해 
//		추가하려는 요소의 equals()와 hashCode()를 호출한다.
//		목적에 맞게 오버라이딩이 필요하다.
		set.add(new String("abc"));
		set.add("abc");
		set.add(new Person2("David",10));
		set.add(new Person2("David",10));
		
		System.out.println(set);		
	}
}

class Person2{
	String name;
	int age;
	
	Person2(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Person2) {
			Person2 tmp = (Person2)obj;
			//서로 같으면 true를 반환
			return name.equals(tmp.name) && age==tmp.age;
		}
		//다르면 false반환
		return false;
	}
	
	public int hashCode() {
//		return (name+age).hashCode();
		return Objects.hash(name,age);
	}
	
	public String toString() {
		return name+":"+age;
	}
}
