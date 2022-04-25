package inheritance;

public class SubTest extends SuperTest{
	private String name;
	private int age;
//	
//	public SubTest() {
////		this("Hi",0,0,0);
//		
//	}
	public SubTest(String name, int age, double weight, double height) {
		//부모 생성자 호출
		
		super(weight, height);
		
		System.out.println("SubTest 생성자 - 자식");
		
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
		
	}
	
	public void output() {
		System.out.println("이름 = "+name);
		System.out.println("나이 = "+age);
//		System.out.println("몸무게 = "+weight);
//		System.out.println("키 = "+height);
//		this.disp();
		super.disp();
	}
	
	
	public static void main(String[] args) {
//		SubTest aa = new SubTest();
		SubTest aa = new SubTest("홍길동",25,72.8,183.6); // 1:1관계, 결합도 100%
		aa.output();
		System.out.println("------------");
		aa.disp();
		System.out.println();
		
		SuperTest bb = new SubTest("코난",13,52.3, 162.5); // 부모 = 자식 (다형성)
//		bb.output();  -error
		bb.disp();
		
		String a = new String("apple");
		String b = a;
		
		Integer c = 25;
		Integer d = c;
		
//		String e = c;  error
		
//		부모 = 자식
		Object ob = a;
		ob = c;
		
		
		
	}
}

//상속의 개념에서 제일 중요한것 ?
// 자식클래스를 생성하면 나와 내 부모를 같이 생성한다. => 생성자 2번 호출
