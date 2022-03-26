package com.java;

import java.util.Vector;

class Product9{
	int price;
	int bonusPoint;
	
	Product9(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	Product9(){
		price = 0;
		bonusPoint = 0;
	}
}

class Tv9 extends Product9 {
	Tv9 (){super(100);}
	public String toString() {return "Tv";}
}
class Computer9 extends Product9{
	Computer9() {super(200);}
	public String toString() {return "Computer";}
}
class Audio9 extends Product9{
	Audio9() {super(50);}
	public String toString() {return "Audio";}
}

class Buyer9{
	int money = 1000;
	int bonusPoint = 0;
	Vector item = new Vector();
	
	void buy(Product9 p) {
		if(money<p.price) {
			System.out.println("out of money");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);
		System.out.println(p+"를 구입하셨습니다.");
	}
	void refund(Product9 p) {
		if(item.remove(p)) {
			money +=p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p+"를 반품하셨습니다.");
		}else {
			System.out.println("구입하신 제품 중 해당제품이 없습니다.");
		}
	}
	
	void summary() {
		int sum = 0;
		String itemList="";
		if(item.isEmpty()) {
			System.out.println("구입하신 제품이 없습니다.");
			return;
		}
		for(int i=0; i<item.size();i++) {
			Product9 p = (Product9)item.get(i);
			sum += p.price;
			itemList += (i==0)? ""+p : ","+p;
		}
		System.out.println("구입하신 물품의 총금액은 : "+sum);
		System.out.println("구입하신 제품은 : "+itemList);
	}
}

public class PolyArgumentTest3 {
	
	public static void main(String[] args) {
		
		Buyer9 b = new Buyer9();
		Tv9 tv = new Tv9();
		Computer9 com = new Computer9();
		Audio9 audio = new Audio9();
		
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();
		System.out.println();
		b.refund(com);
		b.summary();
	}
}
