package com.java;

class Tv2{
	boolean power;//전원상태 온오프
	int channel;//채널
	void power() {power = !power;}
	void channelUp() { ++channel;}
	void channelDown() { --channel;}
	
}

class CaptionTv extends Tv2{
	boolean caption;//캡션상태 온오프
	void displayCaption(String text) {
		if(caption) { //캡션상택 온 일때만 text보여준다.
			System.out.println(text);
		}
	}
}

public class CaptionTvTest {
	public static void main(String[] args) {
		CaptionTv ctv = new CaptionTv();
		ctv.channel = 10; //조상클래스로부터상속받은멤
		ctv.channelUp();//조상클래스로부터 상속받은 멤버  
		System.out.println(ctv.channel);
		ctv.displayCaption("hello");
		ctv.caption = true;
		ctv.displayCaption("hello,world");
	}
}
