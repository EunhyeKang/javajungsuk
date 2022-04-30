package nested;

public abstract class AbstractExam {
	public void cc() {}  //추상클래스인데 추상메서드는 없는 경우?
						//누군가 상속받아서 오버라이드해서 사용하게 될때 
						//이 메서드는 추상이 아니므로 인식되지 않기 때문에
						//빈 body로.  
						//오버라이드 될 메서드들이기때문.
	
	public void dd() {}
	
}
