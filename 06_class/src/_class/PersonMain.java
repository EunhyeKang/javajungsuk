package _class;            

class Person{        // -class당  *.class가 만들어진다.
	//필드, 초기화
	private String name = null;  //클래스필드 변수는 초기화값이 있다. null , 0
	private int age = 0; //iv
	
	public Person() {
		
	}
	
	public void setData(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void setName(String name){ //구현
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
}


public class PersonMain {
	public static void main(String[] args) {
		int a; //지역변수 lv
		Person p; //객체
		p = new Person(); // 생성
		System.out.println("객체 p = "+p);
		
//		p.name = "홍길동";
//		p.age = 25;;
//		System.out.println(p.name+", "+p.age); //인스턴스 접근제한자가 private여서 접근불가.
		
		p.setName("홍길동");
		p.setAge(5);
		
		System.out.println(p.getName()+", "+p.getAge());
	
		System.out.println();
		
		Person p2 = new Person(); //생성
		System.out.println("객체 p2 = "+p2);
		p2.setName("코난");
		p2.setAge(13);
		
		System.out.println(p2.getName()+", "+p2.getAge());
		System.out.println();
		
		
		Person p3 = new Person(); //생성
		System.out.println("객체 p3 = "+p3);
		p3.setData("둘리",100);
		System.out.println(p3.getName()+", "+p3.getAge());
		
		System.out.println();
		
		Person p4 = new Person();
//		p4.setData();
		System.out.println("객체 p4 = "+p4);
		System.out.println(p4.getName()+", "+p4.getAge());
		
		
			}
}
