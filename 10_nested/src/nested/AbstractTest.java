package nested;

public abstract class AbstractTest { //POJO  //추상메서드를 포함하고 있으면 추상클래스로 선언해야한다.
//	private String name;
	String name;
	
	public String getName() {
		return name;
	}
	
	public abstract void setName(String name); // 추상메서드
}
