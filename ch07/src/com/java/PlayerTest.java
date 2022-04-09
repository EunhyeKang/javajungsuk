package com.java;

abstract class Player{
	abstract void play(int pos);
	abstract void stop();
}

//추상클래스는 상속을 통해 완성해야 객체 생성 가능

class AudioPlayer extends Player{
	void play(int pos) {
		System.out.println(pos+"위치부터 play합니다.");
	}
	void stop() {
		System.out.println("재생 멈춥니다.");
	}
}
public class PlayerTest {
	public static void main(String[] args) {
//		Player p = new Player();
		Player ap = new AudioPlayer();
		ap.play(100);
		ap.stop();
	}
}
