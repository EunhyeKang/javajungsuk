package method;

public class MethodTest2 {
	int iv; //필드 
	
	public static void main(String[] args) {
		int lv; //지역변수 local variable
		
		MethodTest2 mt = new MethodTest2();
		int s = mt.sum(25, 36); //호출
		
		System.out.println("합="+mt.sum(25, 36)); //호출
		System.out.println("합="+mt.sub(25, 36)); //호출
		System.out.println("합="+mt.mul(25, 36)); //호출
		System.out.println("합="+mt.div(25, 36)); //호출
		
	}
	
	public int sum(int a, int b) { //구현
		return a+b; //반환
	}
	
	
	public int sub(int a, int b) { //구현 sum(매개변수parameter,인수argument)
		return a-b; //반환
	}
	
	
	public int mul(int a, int b) { //구현
		return a*b; //반환
	}
	
	
	public double div(int a, int b) { //구현
		return (double)a/b; //반환
	}
	
	
	
}
