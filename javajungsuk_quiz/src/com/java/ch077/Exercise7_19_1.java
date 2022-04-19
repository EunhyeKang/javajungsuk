package com.java.ch077;

public class Exercise7_19_1 {
	public static void main(String[] args) {
		Buyer1 b = new Buyer1();
		b.buy(new Tv1());
		b.buy(new Computer1());
		b.buy(new Tv1());
		b.buy(new Audio1());
		b.buy(new Computer1());
		b.buy(new Computer1());
		b.buy(new Computer1());
	
		b.summary();
	}
}

class Buyer1{
	int money = 1000;
	Product1 [] cart = new Product1[3];
	int i=0; //Product배열 cart에 사용될 index
	
	void buy(Product1 p) {
				/*	
		(1) . 아래의 로직에 맞게 코드를 작성하시오
		1.1 . 가진 돈과 물건의 가격을 비교해서 가진 돈이 적으면 메서드를 종료한다
		1.2 , 가진 돈이 충분하면 제품의 가격을 가진 돈에서 빼고
		1.3 .(add ) */
		if(money<p.price) {
			System.out.println("잔액부족하여 "+p+"를 살수없습니다.");
			return;
		}
		else {
			money -= p.price;
			add(p);
		}
		
	}
	
	void add(Product1 p) {
			/*
			(2) . 아래의 로직에 맞게 코드를 작성하시오
			1.1 i의 값이 장바구니의 크기보다 같거나 크면
			1.1.1 2 . 기존의 장바구니보다 배 큰 새로운 배열을 생성한다
			1.1.2 . 기존의 장바구니의 내용을 새로운 배열에 복사한다
			1.1.3 . 새로운 장바구니와 기존의 장바구니를 바꾼다
			1.2 (cart) . i 1 .*/
			if(i>=cart.length) {
				Product1 [] tmp = new Product1[cart.length*2];
				System.arraycopy(cart, 0, tmp, 0, cart.length);
				cart = tmp;	
			}
			//물건을 장바구니(cart)에 저장한다. 그리고 i의값을 1증가시킨다.
			cart[i++] = p;
	}
	
	void summary() {
			/*
			(3) . 아래의 로직에 맞게 코드를 작성하시오
			1.1 . 장바구니에 담긴 물건들의 목록을 만들어 출력한다
			1.2 . 장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다
			1.3 (money) . 물건을 사고 남은 금액 를 출력한다
			*/
		int sum=0;
		
			for(int i=0; i<cart.length; i++) {
				System.out.print(cart[i].toString()+" ");
				sum += cart[i].price;
			}
			
			System.out.println();
			System.out.println("합계 : "+sum + "남은금액 : "+money);
			
	}
}

class Product1{
	int price; //제품의 가격
	
	Product1(int price){
		this.price = price;
	}
}

class Tv1 extends Product1{
	Tv1(){super(100);}
	
	public String toString() {return "Tv";}
}


class Computer1 extends Product1{
	Computer1(){super(200);}
	
	public String toString() {return "Computer";}
}

class Audio1 extends Product1{
	Audio1(){super(50);}
	
	public String toString() {return "Audio";}
}