package constructor;

class StaticTest{
	//필드
	private int a; //인스턴스변수
//	private static int b; //클래스변수 //프로그램 실행하자마자 메모리에 올라온다. 
						//static붙은 애들은 실행하자마자 메모리에 올라오는데
	static int b;
	
	static {
		System.out.println("static변수 초기화 영역");
		b = 3;  //실행할때 초기화 딱 한번함.
		
	}
	
	
	public StaticTest() {
		System.out.println("StaticTest 기본 생성자");
		a=3;
	}
	
	public void calc() {
		a++;
		b++;
	}
	
	public void disp() {
		System.out.println("a = "+ a + ", b = " + b);
	}
	
	public static void output() { // static메소드는 static변수만 사용할 수 있다. 
		System.out.println("static method .... output()...");
//		System.out.println("a = "+this.a + ", b = "+StaticTest.b); //스태틱변수엔 this안먹힘.
	
	}
	
}





public class StaticMain {
	public static void main(String[] args) {
		
		StaticTest aa = new StaticTest();     // a는 계속 초기화  b는 메모리에 한번 만들어놓고 사용.
		aa.calc();
		aa.disp();
		System.out.println();
		
		
		
		StaticTest bb = new StaticTest();
		bb.calc();
		bb.disp();
		System.out.println();
		
		
		
		StaticTest cc = new StaticTest();
		cc.calc();
		cc.disp();
		System.out.println();
		
		
		System.out.println("StaticTest.b = " +StaticTest.b); //생성자를 만나기도 전에 메모리에 올라가기 때문에 
		//일반적인 변수의 초기화처럼 생성자에서 초기화가 불가능하다. 고로 초기화는 어디서 ? 
		// static 이라는 초기화영역을 사용하여 초기화할 수 있다.
		
		
		
	}
}
