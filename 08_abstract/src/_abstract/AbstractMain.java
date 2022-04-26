package _abstract;

public class AbstractMain extends AbstractTest { //상속받은 추상메서드를 모두 구현하지 않으면 이 클래스도 추상클래스가 된다.
	
	

	public void setName(String name) {
		this.name = name;
	}

	
	public static void main(String[] args) {
		
//		AbstractTest at = new AbstractTest();    //추상클래스는 객체생성 불가
		AbstractTest at = new AbstractMain();
		at.setName("홍길동"); 
		System.out.println(at.getName());

	}
}






//그럼 how to?
//1) 상속 
//2) 메소드라는것을 통해 생성
//3) 익명 이너클래스를 통해 생성







//생성
//- 추상클래스는 new할 수 없다
//- 추상클래스를 생성하려면 1.상속 2. 메소드 3. 익명 Inner class
// 반드시 추상메소드 재구현(Override)해야 한다.