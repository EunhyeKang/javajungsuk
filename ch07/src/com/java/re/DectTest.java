package com.java.re;


class DeckTest {
	public static void main(String[] args) {
		//카드 한벌 Deck을 만든다
		//섞기 전에 제일 위의 카드를뽑는다.
		//system.out.println(c.toString())과 같다.
		
		//카드를 섞는다.
		//섞은 후에 제일 위의 카드를 뽑는다.
	}
}

class Deck{
	//카드의 개수.
	//Card객체 배열을 포
	
	Deck() {//Deck의 카드를 초기화한다.

		
	}/*
	Card pick(int index) {//지정된 위치(index)에 있는 카드 하나를 꺼내서 반
	}
	Card pick(){//덱 에서 카드 하나를 선택한다
		
	}*/
	
	void shuffle() {//카드의 순서를 섞는다.
		
		}
		
}//deck클래스의 



class Card{
	
	static final int KIND_MAX = 4;
	static final int NUM_MAX = 13;
	
	static final int SPADE = 4;
	static final int DIAMOND = 3;
	static final int HEART = 2;
	static final int CLOVER = 1;
	int kind;
	int number;

	Card(){
		this(SPADE,1);
	}

	Card(int kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	public String toString() {
		String[] kinds = {"","CLOVER","HEART","DIAMOND","SPADE"};
		String numbers = "0123456789XJQK";
		return "kind :" + kinds[this.kind]+",number : "+numbers.charAt(this.number);
		
	}
	
}
