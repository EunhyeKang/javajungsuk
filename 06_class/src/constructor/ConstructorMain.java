package constructor;

public class ConstructorMain {

	public static void main(String[] args) {
		
		ConstructorTest aa = new ConstructorTest();
		System.out.println("객체 aa = "+aa); //기본생성자호출 + 주소값 출력됨
		System.out.println(aa.getName());
		System.out.println(aa.getAge());
		System.out.println();
		
		ConstructorTest bb = new ConstructorTest("홍길동");
		System.out.println("객체 bb = "+bb); //기본생성자호출 + 주소값 출력됨
		System.out.println(bb.getName());
		System.out.println(bb.getAge());
		System.out.println();
		
		ConstructorTest cc = new ConstructorTest(25);
		System.out.println("객체 cc = "+cc); //기본생성자호출 + 주소값 출력됨
		System.out.println(cc.getName());
		System.out.println(cc.getAge());
		System.out.println();
		
		
		
	}
	
}
