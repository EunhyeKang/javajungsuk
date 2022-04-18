package com.java.ch077;

abstract class Unit{
	int x,y; //현재위치

	//지정된 위치로 이동
	//클래스마다 이동하는 방법이 다르므로
	//move메서드를 추상메서드로 정의
	abstract void move(int x, int y);
	
	void stop() {
		//현재 위치에 정지
	}
	
}
class Marine extends Unit{// 보병
	void move(int x, int y) {}
	void stimPack() {
		//스팀팩을 사용한다
	}
}

class Tank extends Unit{// 탱크
	void move(int x, int y) {}
	void changeMode(){
		//공격모드를 변환한다
	}
}


class Dropship extends Unit{// 수송선
	void move(int x, int y) {}
	void load() {
		//선택된 대상을 태운다
	}
	void unload() {
		//선택된 대상을 내린다
	}
}

public class Exercise7_17 {
	public static void main(String[] args) {
		
		
		
	}
}
