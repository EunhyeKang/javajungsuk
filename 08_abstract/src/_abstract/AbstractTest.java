package _abstract;

public abstract class AbstractTest { // POJO 형식 (Plain Old Java Object) 자바 기본 오리지날
//		private String name; //캡슐화. 외부에서 접근 안됌. setter/getter필요.
		String name;
	
		public String getName() {
			return name;
		}
		
		public abstract void setName(String name); // 추상메서드. 아직 만들어지지 않았다.
		//추상메서드는 abstract키워드로 선언해줘야하며,
		//추상메서드를 갖고있는 클래스 또한 추상클래스 abstract 클래스로 선언해준다.
		//추상클래스는 추상메서드가 있을수도 있고 없을수도 있다.
		//추상메서드가 있으면 반드시 추상클래스이다.
		//추상클래스라고 꼭 추상메서드가 있는것은 아니다.
		
		//그럼 굳이 왜 추상메서드가 없는데 추상클래스라고 선언할때가 있을까? ? ? ? ?
		
		
		
		
}
