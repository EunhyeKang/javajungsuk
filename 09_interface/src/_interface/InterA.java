package _interface;

public interface InterA {
	//인터페이스 안에는 상수만 올수있다.
	//인터페이스에는 상수와 추상메소드만 존재하기때문에 
	//public static final, abstract 등 생략이 가능한것이다.
	
	//추상이있다면 재구현해야한다는 뜻
	
	public static final String NAME = "홍길동"; //상수
	int AGE = 25;
	
	public abstract void aa();
	public void bb(); //abstract 생략 가능
}
