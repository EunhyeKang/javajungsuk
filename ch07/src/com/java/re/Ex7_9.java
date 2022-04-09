package com.java.re;

class Product2 {
	// 제품의 가격
	// 제품구매 시 제공하는 보너스 점수
	int price;
	int bonusPoint;

	// 생성자
	Product2() {
	}

	Product2(int price) {
		this.price = price;
		bonusPoint = (int) (price / 10.0);
	}
}

class Tv2 extends Product2 {
	Tv2() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer2 extends Product2 {
	Computer2() {
		super(200);
	}

	public String toString() {
		return "computer";

	}
}

class Audio2 extends Product2 {
	Audio2() {
		super(300);
	}

	public String toString() {
		return "audio";
	}

}

class Buyer2 { // 고객, 물건을 사는 사람
	// 소유금액
	// 보너스점수
	int money = 1000;
	int bonusPoint = 0;
	// 구입한 제품을 저장하기 위한 배열
	Product2[] cart = new Product2[10];
	// Product배열에 사용될 카운터
	int count = 0;

	void buy(Product2 p) {
		if (money < p.price) {
			System.out.println("잔액부족");
			return;
		}
		// 가진돈에서 구입한 제품의 가격을 뺀다.
		money -= p.price;
		// 제품의 보너스 점수를 추가한다.
		bonusPoint += p.bonusPoint;
		// 제품을 product[] cart에 저장한다.
		cart[count++] = p;
		// ~구입하셨습니다. 출력
		System.out.println(p + "를구입하셨습니다.");
	
	}
	
	void summary() {// 구매한 물품에 대한 정보를 요약해서 보여준다.
	
		// 구입한 물품의 가격 합계
		int sum = 0;
		// 구입한 물품 목록
		String list = "";
		// 반복문을 이용해서 구입한 물품의 총 가격과 목록을 만든다.
		for (int i = 0; i < cart.length; i++) {
	
			if (cart[i] == null)
				break; // 없을경우 !!!! 처리해주기
			sum += cart[i].price;
			list += cart[i].toString() + ",";
		}
	
		// 구입한물품의 총금액 출력
		System.out.println("sum = " + sum);
		// 구입한 제품 이름 출력
		System.out.println("list = " + list);
	
	}
}
class Ex7_9 {
	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		
		b.buy(new Tv2());
		b.buy(new Computer2());
		b.buy(new Audio2());
		b.summary();
	}
}
