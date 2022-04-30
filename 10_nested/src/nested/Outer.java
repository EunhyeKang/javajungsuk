package nested;    // Outer.java    Outer.class      XXXX Ineer.class ???? XXXXXXXXXXXXXX      Outer$Inner.class

public class Outer { //현재 소속관계로 가질뿐인거지 상속때처럼 부모 자식 다 만드는게 아니고 .... ㅎㅎㅎ

	private String name;  //밖에있는 애들은 안에 클래스에 절대로 들어갈 수가 없다. 
						//들어갈방법은 ? ? ? ? 현재 가지고있는 클래스를 객체생성하면 바깥에서 안으로 들어갈 수 있다.
	

	
	public void output() {
//		System.out.println("이름 : " + name + "\t나이 : " + age); //age에 접근허가가 되지 않는다.  
																//접근하려면 ? 객체생성하자.
		Inner in = new Inner(); 
		System.out.println("이름 : " + name + "\t나이 : " + in.age);//private변수임에도 불구하고. 내부에 가지고있기때문에 in.age로 바로 접근이 가능하다.
								//this.name-Outer변수 			//원래는 private변수일때 setter/getter로 접근해야한지만 중첩의 경우는 바로 접근 가능.	
	}
	
	
	
	
	class Inner {
		private int age;   //학생들은 나한테 요구할수있다. 바깥에 있는애를 상속받은것처럼 쓸수있으나..!! 
		
		public void disp() {
			System.out.println("이름 : " + name + "\t나이 : " + age);  //밖에있는 name에도 접근가능하고 age는 내꺼니까 당연히 접근가능.
										//누구꺼???		//	this.age - Inner변수
										//Outer꺼.
										//Outer.this.name  내가가진 변수 아니라 밖에있는 클래스변수.
		}
	}//class Inner

	public static void main(String[] args) {
		Outer ou = new Outer();
//		ou.output(); //현재 이름에 객체생성한거 없어서 null ~~\
		
		ou.name="홍길동";  //내 클래스안은 맘대로 접근 가능  private.
		System.out.println("이름 = " + ou.name);
		
//		Outer.Inner in2 = new Inner(); XXXXXXXXXXXXXXXXXXX
		Outer.Inner in2 = ou.new Inner();
		in2.age = 25;
		in2.disp();
		
		Outer.Inner in3 = ou.new Inner();
		//in3.name = "코난";   //in3 안에는 name이없으니까. ! 
		in3.age =30;
		in3.disp();
		
		
		
		Outer.Inner in4 = new Outer().new Inner();  
		in4.age = 35;
		in4.disp();
		
		
	}
}




//프로젝트할때 중첩시키는 이유는 ? ?  private잡으면 접근못하니까 setter getter으로 접근해야하는데
//중첩쓰면 언제든지 접근해서 쓸수있기때문이다. 
//중첩시기켠 코드는 길어지나 메소드가 빠져서 편하게 사용할 수 있기 때문에 좋아라 한다.





