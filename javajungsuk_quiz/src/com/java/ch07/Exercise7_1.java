package com.java.ch07;


class SutdaDeck {
	final int CARD_NUM =20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	//배열을 정의한것이지 인스턴스가 생성된 것은 아니다.
	//객체배열을 생성할때, 배열만 생성해놓고
	//객체를 생성하지 않는 실수를 하지않도록 주의!!하자.
	
	SutdaDeck() {
		int num=0; 
		
		for(int i=0; i<cards.length; i++){
			num = i%10+1;
			
			//결과가 참이면 true
			boolean isKwang = (i<10)&&(num==1|num==3||num==8);
			
		cards[i] = new SutdaCard(num,isKwang);
		}
		
	}
	
}

class SutdaCard{
	int num;
	boolean isKwang;
	
	SutdaCard(){
		this(1,true);
	}
	SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	//info()대신 Object클래스의 toString()을 오버라이딩했다.
	public String toString() {
		return num + (isKwang? "K":"");
	}
}


public class Exercise7_1 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		for(int i=0; i<deck.cards.length; i++)
			System.out.println(deck.cards[i]+",");
	}
}
