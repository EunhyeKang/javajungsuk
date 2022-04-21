package constructor;

public class ConstructorTest {
	private String name; //필드, 초기화(null) 클래스 객체는 null로 초기화된다.
	private int age; // 0으로 초기화
	
	
	
	public ConstructorTest() {
		System.out.println("기본 생성자");
	}
	
	public ConstructorTest(String name) {
		this();
		this.name = name;
		System.out.println("this = "+this);
	}
	
	public ConstructorTest(int age) {
		this("네오");//Overload된 다른생성자를 호출
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
}
