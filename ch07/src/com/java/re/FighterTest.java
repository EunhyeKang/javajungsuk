package com.java.re;

abstract class Unit2{
	int x,y;
	abstract void move(int x, int y);
	void stop() {System.out.println("멈춥니다.");}
	
}
interface Fightable{ //인터페이스의 모든 메서드는 public abstract. 예외없이.
	void move(int x, int y); //public abstract가 생략됨
	void attack(Fightable f); //public abstract가 생략됨
}

class Fighter extends Unit2 implements Fightable{
//	오버라이딩 규칙: 조상public보다 저ㅂ근제어자가 범위가 좁으면 안된다.
	public void move(int x, int y) {
		System.out.println("["+x+","+y+"]"+"로이동");
	}
	public void attack(Fightable f) {
		System.out.println(f+"을 공격");
	}
	public String toString() {
		return "x,y에 위치한 적군";
	}
	
	//싸울 수 있는 상대를 불러온다.
	Fightable getFighter() {
		Fightable f = new Fighter();
		return f;
	}
}
public class FighterTest {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		f.move(100, 200);
		f.attack(new Fighter());
		
		Fightable f2 = f.getFighter();
	}
}
