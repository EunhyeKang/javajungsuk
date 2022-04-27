package constructor;
//import static java.lang.Math.random;
//import static java.lang.Math.pow;
import static java.lang.Math.*; //(*와일드 카드, 모든 것)
import static java.lang.System.out;




public class ImportStatic {
	public static void main(String[] args) {
		
//		System.out.println("난수 = " + Math.random());
//		System.out.println("난수 = " + java.lang.Math.random());
		System.out.println("난수 = " + random());
//		System.out.println("제곱 = " + Math.pow(2, 5));//2의 5승
//		System.out.println("제곱 = " + pow(2, 5));//2의 5승
		out.println("제곱 = " + pow(2, 5));// import 보면..  이 클래스 안에 out이 있는데 static으로 정의되어있다!
		
		
		
		
		
		
		
		
	}
}
