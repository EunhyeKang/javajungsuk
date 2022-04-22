package collection;

class GenericTest<T>{
	private T a;
	
	public void setA(T a) {
		this.a = a;
	}
	
	public T getA() {
		return a;
	}
}

public class GenericMain {
	public static void main(String[] args) {
		
		
		GenericTest<Integer> aa = new GenericTest();
		aa.setA(25);
		System.out.println("나이 = " + aa.getA());
		
//		aa.setA("홍길동");//에러남 Integer만 담기로 했는데 문자열 들어가서
	
		GenericTest<String> bb = new GenericTest();
		bb.setA("String");
		System.out.println("문자 = " + bb.getA());
	}
}
