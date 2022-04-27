package zoo;

public class Zoo {
	
	public void tiger() { //패키지가 다를때도 접근 가능
		System.out.println("무서운 호랑이");
	}
	
	protected void giraffe() { // 같은패키지 & 다른패키지일때 자손이면 사용 가능
		System.out.println("목이 긴 기린");
	}
	
	void elephant() { // 같은 패키지내에서
		System.out.println("뚱뚱한 코끼리");	
	}
	
	private void lion() { //선언된 클래스 내
		System.out.println("멋진 사자");
	}
	
	
	
}
