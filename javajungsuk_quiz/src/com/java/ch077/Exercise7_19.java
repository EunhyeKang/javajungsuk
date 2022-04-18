package com.java.ch077;

public class Exercise7_19 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Tv());
		b.buy(new Audio());
		b.buy(new Computer());
		b.buy(new Computer());
		b.buy(new Computer());
	
		b.summary();
	}
}

class Buyer{
	int money = 1000;
	Product [] cart = new Product[3];
	int i=0; //Product배열 cart에 사용될 index
	
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액부족하여 "+p+"를 살수없습니다.");
			return;
		}else if(money>=p.price) {
			money -= p.price;
			add(p);
		}
			
	}
	
	void add(Product p) {
		
		//i의 값이 장바구니의 크기보다 같거나 크면
		if(i>=cart.length) {
			//기존의 장바구니보다 2배 큰 새로운 배열을 생성한다.
			Product [] tmp = new Product[cart.length*2];
//			int [] cart = new int [i*2];
			//기존의 장바구니의 내용을 새로운 배열에 복사한다.
			System.arraycopy(cart,0,tmp,0,cart.length);
			//새로운 장바구니와 기존장바구니를 바꾼다.
			cart = tmp;
		}
		
		//물건을 장바구니(cart)에 저장한다. 그리고 i의값을 1증가시킨다.
		cart[i++] = p;
	
	}
	
	void summary() {
		int sum=0;
		System.out.print("구매목록:");
		
		for(int i=0; i<cart.length; i++) {
			System.out.print(cart[i].toString()+" ");
			sum += cart[i].price;
		}
		System.out.println();
		System.out.println("총가격:"+sum);
		System.out.println("잔액:"+money);
	}
}

class Product{
	int price; //제품의 가격
	
	Product(int price){
		this.price = price;
	}
}

class Tv extends Product{
	Tv(){super(100);}
	
	public String toString() {return "Tv";}
}


class Computer extends Product{
	Computer(){super(200);}
	
	public String toString() {return "Computer";}
}

class Audio extends Product{
	Audio(){super(50);}
	
	public String toString() {return "Audio";}
}