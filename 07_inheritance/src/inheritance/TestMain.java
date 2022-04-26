package inheritance;

class Test extends Object{
//	private int a, b;
//	protected int a, b;
	int a, b; // default 접근제어자.  같은 패키지 내에서 사용 가능하다.
	
	@Override
	public String toString() {
		return "class Test to String호출";
	}
	
	//class Object{
//		public String toString() {} // 클@16진주
	//}
	
}




public class TestMain {
		public static void main(String[] args) {

			Test aa = new Test();
			System.out.println("객체 aa = " + aa);
			Test bb = aa;
			
			aa.a = 2; // 접근제어자가 default이기때문에 접근 가능.
			aa.b = 5;
			
			System.out.println(aa.a + "\t" + aa.b);
			System.out.println(bb.a + "\t" + bb.b);
			
			System.out.println();
			
			bb.a = 7;
			bb.b = 9;
			
			System.out.println(aa.a + "\t" + aa.b);
			System.out.println(bb.a + "\t" + bb.b);
			
			System.out.println();
			bb = new Test();
			bb.a = 10;
			bb.b = 20;
			
			System.out.println(aa.a + "\t" + aa.b); // 기존 a, b
			System.out.println(bb.a + "\t" + bb.b);  // 새로 만든 객체의 a,b
			
			
			
		}
	//Test라는 클래스를 만들었습니다. 그 안에는 a,b 가 들어있고
		//이 클래스에 대한 주소값을 aa가 가져라
//	그래서 aa가 Test를 참조하게 됩니다.
//		클@100 주소를 가지고 있는데  Test bb = aa; 로 a의 주소값을 bb에게 대입해줍니다.
//		주소값 bb가 클@100 을 가지게 되고 Test를 참조하게 된다
//		둘다 Test타입이기 때문에 주소를 받을수있다.
		
		
		//tv는 한대이고 리모콘은 2개인 셈.
}
