package com.java.ch077;


class SutdaDeck{
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	
	
	SutdaDeck() {
		
			for(int i=0; i<cards.length; i++) {
			
				int num = (i%10+1);
				boolean isKwang = (i<10)&&(num==1||num==3||num==8);
						
				cards[i] = new SutdaCard(num, isKwang);
			}
	}
	
	
	void shuffle(){
		for(int i=0; i<cards.length; i++) {
			int num = (int)(Math.random()*cards.length)+1;
			SutdaCard tmp = cards[i];
			cards[i] = cards[num];
			cards[num] = tmp;
			
		}
	}
	
	SutdaCard pick(int index){
		//유효성 검사
		if( index<=0 ||index>=cards.length)
			return null;
		return cards[index];
	}
	
	SutdaCard pick(){
		 
		int num = (int)Math.random()*cards.length;
		return pick(num);
		
	}
	
	
	
}

class SutdaCard{
	//원래 변수앞에 final을 붙일때는 선언과 초기화를 동시에 해야 한다.
	//그러나 인스턴스 변수의 경우, 선언시에 초기화하지 않고
	//생성자에서 초기화 할 수 있다.
	
	final int NUM;
	final boolean IS_KWANG;
	
	SutdaCard(){
		this(1,true);
	}
	
	SutdaCard(int num, boolean isKwang){
		//생성자에서 인스턴스변수 초기화
		this.NUM = num;
		this.IS_KWANG = isKwang;
	}
	
	//info()대신 Object클래스의 toString()을 오버라이딩했다.
	public String toString() {
		return NUM + (IS_KWANG ? "K":"");
	}
}

public class Exercise7_1 {
	public static void main(String[] args) {
		SutdaDeck deck = new SutdaDeck();
		
		for(int i=0; i<deck.cards.length; i++)
			System.out.print(deck.cards[i]+", ");
	}
	
}


