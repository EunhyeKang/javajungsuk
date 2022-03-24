package com.java;

public class InstanceofTest {
	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) {
			System.out.println("this is a FireEngine instance");
		}
		if(fe instanceof Car) {
			System.out.println("this is a Car instance.");
			
		}
		if(fe instanceof Object) {
			System.out.println("this is an Object instance.");
		}
		System.out.println(fe.getClass().getName());
		//참조변수가 가리키고 있는 인스턴스의 클래스 이름을 문자열로 반환한다.
	}
}


