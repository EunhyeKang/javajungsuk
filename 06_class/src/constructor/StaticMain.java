package constructor;

class StaticTest{
	//필드
	private int a; //인스턴스변수
	private static int b; //클래스변수
	
	
	public void calc() {
		a++;
		b++;
	}
	
	public void disp() {
		System.out.println("a = "+ a + ", b = " + b);
	}
}





public class StaticMain {
	public static void main(String[] args) {
		
		StaticTest aa = new StaticTest();
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
	}
}
