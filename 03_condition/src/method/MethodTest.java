package method;

public class MethodTest {
	
	public static void main(String[] args) { //구현
		output(); //호출
//		클래스명.output(); 
		MethodTest.output();
		
		MethodTest mt = new MethodTest(); //생성
		System.out.println("mt = "+mt);
		mt.disp(); //호출
	}
	
	
	public void disp() { //구현
		 System.out.println("non_static method..");
	}
	
	public static void output() { //구현
		System.out.println("static method..");
	}
}
