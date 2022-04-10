package com.java.ch07;


class SutdaDeck1 {
	final int CARD_NUM =20;
	SutdaCard1[] cards = new SutdaCard1[CARD_NUM];
	//배열을 정의한것이지 인스턴스가 생성된 것은 아니다.
	//객체배열을 생성할때, 배열만 생성해놓고
	//객체를 생성하지 않는 실수를 하지않도록 주의!!하자.
	
	SutdaDeck1() {
//	1~10까지 적힌카드가 한쌍씩 있고,
//	숫자가 1,3,8 인경우는 둘중한장은 광(K)이어야한다
//	즉, 인스턴스변수 ISkWAING이 TRUE여야함.
		
		for(int i=0; i<cards.length; i++) {
			int num = i%10+1;
			boolean isKwang = (i<10)&&(num==1||num==3||num==8);
			cards[i] = new SutdaCard1(num,isKwang);
		}
	}
	
	
	public void shuffle() {
//		for(int x=0; x<cards.length; x++) {
//			
//			int i=(int)(Math.random()*cards.length);
//			int j=(int)(Math.random()*cards.length);
//		
//			SutdaCard1 tmp = cards[i];
//			cards[i] = cards[j];
//			cards[i] = tmp;
//			
//		}
		for(int i=0; i<cards.length; i++) {
			int j=(int)(Math.random()*cards.length);
			
			SutdaCard1 tmp = cards[i];
			cards[i] = cards[j];
			cards[j] = tmp;
		}
	}
	
	public SutdaCard1 pick(int index) {
		if(index<0 || index>= CARD_NUM) return null;
		
		return cards[index];
	}
	
	public SutdaCard1 pick() {
		int index = (int)(Math.random()*cards.length);
		
		return pick(index);
	}
	
}

class SutdaCard1{
	int num;
	boolean isKwang;
	
	SutdaCard1(){
		this(1,true);
	}
	SutdaCard1(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	//info()대신 Object클래스의 toString()을 오버라이딩했다.
	public String toString() {
		return num + (isKwang? "K":"");
	}
}


public class Ex7_1 {
	public static void main(String[] args) {
		SutdaDeck1 deck = new SutdaDeck1();
		
		System.out.println(deck.pick(0));
		System.out.println(deck.pick());
		deck.shuffle();
		
		for(int i=0; i<deck.cards.length; i++)
			System.out.print(deck.cards[i]+",");
		
		System.out.println();
		System.out.println(deck.pick(0));
	}
}
