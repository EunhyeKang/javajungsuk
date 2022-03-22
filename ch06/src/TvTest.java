class Tv{//tv멤버변수 속
	String color;
	boolean power;
	int channel;
	
	//tv 기능 메서드
	void power() {power = !power;}
	void channelUp() { ++channel;}
	void channelDown() {--channel;}
}


public class TvTest {
	public static void main(String[] args) {
		Tv t;
		t = new Tv();
		
		t.channel=7;
		t.channelDown();
		System.out.println("현재채널은"+t.channel);
		
	}
}
