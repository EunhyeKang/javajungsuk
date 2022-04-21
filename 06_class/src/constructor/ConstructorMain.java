package constructor;

public class ConstructorMain {

	public static void main(String[] args) {
		
		ConstructorTest ct = new ConstructorTest();
		System.out.println("객체 ct = "+ct); //기본생성자호출 + 주소값 출력됨
		System.out.println(ct.getName());
		System.out.println(ct.getAge());
		
	}
	
}
