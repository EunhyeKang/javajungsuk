package variable;

public class VariableTest2 {
	//필드
	int a;
	static int b;
	
	public static void main(String[] args) {
		int a = 10; //지역변수
		System.out.println("지역변수 = " + a);
	
		
		VariableTest2 vt = new VariableTest2();
	
		System.out.println("전역변수 b = " + b);
		System.out.println("전역변수 b = " + vt.b);
		System.out.println("전역변수 b = " + VariableTest2.b);
		System.out.println("전역변수 a = " + vt.a);
	
	
	
	}
	
	
}
