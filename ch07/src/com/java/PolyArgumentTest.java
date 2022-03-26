package com.java;

class Product{
	int price; //제품의 가격 
	int bonusPoint; // 제품구매 시 제공하는 보너스 점수 
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0); // 보너스 점수는 제품가격의 10%
	}
}

class Tvv extends Product{
	Tvv(){
		super(100); 
		// 조상클래스의 생성자 Product(int price)를 호출한다.
		// Tv의 가격을 100만원으로 한다.
	}
	//Object클래스의 toString()을 오버라이딩 한다.
	public String toString() {return "Tvv";}
	//문자열로 반환해준다.
}

class Computer extends Product{
	Computer(){super(200);}
	public String toString() {return "Computer";}
}

class Buyer{//고객, 물건을 사는사람
	int money = 1000; //소유 금액 
	int bonusPoint = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
		}
		money -= p.price; // 가진 돈에서 구입한 제품의 가격을 뺀다.
		bonusPoint += p.bonusPoint; //제품의 보너스 점수를 추가한다.
		System.out.println(p + "을 구입하였습니다.");
	}
}
public class PolyArgumentTest {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Tvv());
		b.buy(new Computer());
		
		System.out.println("현재 남은 돈은 "+ b.money + "만원 입니다.");
		System.out.println("현재 보너스 점수는 "+ b.bonusPoint + "점입니다.");
	}
}
