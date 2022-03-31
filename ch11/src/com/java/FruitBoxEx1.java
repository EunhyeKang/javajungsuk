package com.java;

import java.util.ArrayList;

class Fruit {public String toString() {return "Fruit";}}
class Apple extends Fruit {public String toString() {return "Apple";}}
class Grape extends Fruit {public String toString() {return "Grape";}}
class Toy {public String toString() {return "Toy";}}


public class FruitBoxEx1 {
	public static void main(String[] args) {
		Box <Fruit> fruitBox = new Box<Fruit>();
		Box <Apple> appleBox = new Box<Apple>();
		Box <Grape> grapeBox = new Box<Grape>();
		Box <Toy> toyBox = new Box<Toy>();
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple());//자손객체 추가 가능
		fruitBox.add(new Grape());//자손들은 이 메서드의 매개변수가 될수 있다.
		
		appleBox.add(new Apple());
		appleBox.add(new Apple());
//		appleBox.add(new Toy()); 타입이 다른 객체 추가 불가. 자손도아님.
		toyBox.add(new Toy());
		
		System.out.println(fruitBox);
		System.out.println(appleBox);
		System.out.println(grapeBox);
		System.out.println(toyBox);
		
	
		
		
	}
	
	
}

class Box<T>{
	ArrayList <T> list = new ArrayList<T>();
	
	void add(T item) {list.add(item);}
	T get(int i) { return list.get(i);}
	int size() {return list.size();}
	public String toString() {
		return list.toString();
	}
	

}
