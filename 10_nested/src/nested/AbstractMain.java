package nested;

////////////////1   implements 모든 추상메서드
/*
public class AbstractMain implements InterA {

	@Override
	public void aa() {}
	@Override
	public void bb() {}
	
	public static void main(String[] args) {
	}
}
*/


/////////////////2  대신할 클래스              // 한번 메모리에만들어져서 계속 불러다 쓸수있음
//public class AbstractMain {
//	
//	public static void main(String[] args) {
//		InterA in = new InterAImpl();    
//		in.aa();
//	}
//}


/////////////////////3  익명Inner class       //일회성   ///////////////////////     ----    익명객체 로 정정
public class AbstractMain {   //클래스를 new한거임 ! 인터페이스 뉴 아님. 
	
	public static void main(String[] args) {
		InterA in = new InterA() { //익명 이너 클래스
			public void aa() {}
			public void bb() {}
		};   //세미콜론 빼먹지말기 . 
		
		
		//AbstractTest at = new AbstractTest(); - error
		//생성하려고 1. 자식클래스    상속관계로 묶이기싫다 ? 그럼 2번째방법으로
//					 2.익명Inner Class
		
		AbstractTest at = new AbstractTest() {
			public void setName(String name) {
				this.name = name;
			}
			//상속까지 안넘어가고 1회성으로 간단히 사용하고 넘어가겟다.
			//바로 오버라이딩 해서 구현하겠다는 의미.
			
		};
		
		
		AbstractExam ae = new AbstractExam() {};  //오버라이드하고싶은 원하는 메서드만 선택해서 오버라이드가능.
												//선택권은 우리에게 있다.
		
		
		
	}
	
	
}



/////////////////////4  메소드            







//인터페이스를 처리할수있는 방법은 3가지
//인터페이스도 메소드로 생성이 가능하다.



