package inheritance;

class Test2 extends Object{
	
	
}

class Sample{
	
	@Override
	public String toString() {
		return "바보";
	}
}

public class ObjectMain {
	public static void main(String[] args) {
		Test2 t = new Test2();
		System.out.println("객체 t = " + t); // 클@16진수
		System.out.println("객체 t = " + t.toString());
		System.out.println("객체 t = " + t.hashCode()); //10진수
		System.out.println();
		
		Sample s = new Sample();
		System.out.println("객체 s = " + s.toString());
		System.out.println();
		
		
		
		String str = "apple";
		String text = new String("apple");
		System.out.println("객체 str = " + str);
		System.out.println("str == text : " + (str == text)); // 주소비교
		System.out.println("str.equals(text) : " + (str.equals(text)));  //String클래스일때만 문자열 비교하는것이다. !!! 
		System.out.println();
		
		Object ob = new Object();
		Object ob2 = new Object();
		System.out.println("ob == ob2 : " + (ob == ob2));            // 주소 비교  false
		System.out.println("ob.equals(ob2) : " + (ob.equals(ob2))); // 주소 비교  false
		System.out.println();
	///-------------------------------------------------	
		//내가한거
		System.out.println(ob);//////////////////////////
		System.out.println(ob2);
		System.out.println(ob.toString());
		System.out.println(ob2.toString());/////////////////
		
		
		//***********************************  
//		ob2 = ob;
		ob = "hello";  //String pool 이라는 곳에 담김. 
		ob2 = "hello";  //ob = "hello"랑 ob = new String("hello")랑 다름
		//String타입 객체는 heap에 저장이 되고, 
		//그래서 다른 객체에서 "문자";(같은 문자열)로 초기화해주면
		//새로운 객체를 생성하는게 아니라
		// String constant pool에 이미 있는 주소가 할당되서 같은 객체로 나옴
		
		
		
		//new String("1234");
		//"1234"; 이거는 서로 다른거임.
		
		
		//Object타입의참조변수니까 Object객체에 있는건 사용 가능
		//그래서 toString도 사용 가능.
		//Object ob = "hello"; 여기서 실제 객체는 String.
		
		//obj는 문자열객체의 toString을 호출해준것밖에 안되니
		//ob가 가르치고 있는 객체의 toString을 호출한것임.
		
		
		System.out.println("ob == ob2 : " + (ob == ob2));            // 주소 비교  false
		System.out.println("ob.equals(ob2) : " + (ob.equals(ob2))); // 주소 비교  false
		System.out.println();
		
		System.out.println();
		System.out.println(ob);
		System.out.println(ob2);   //이렇게했을때 호출되는 메서드는 toString.
		//문자열객체의 toString을 호출하는부분이System.out.println(ob);
		//obj의 toString이 아니고  담고잇는게 String이니까 자동으로 String에 toStiing 호출
	}
}

/*  

class Object{
	public String toString(){} // 클@16진수
	public boolean equals(Object ob){} // 주소비교
}


class String extends Object {
	public String toString(){} //문자열
	public boolean equals(Object ob){} // 문자열 비교



 */
