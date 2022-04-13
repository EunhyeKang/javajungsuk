package operator;

public class Operator {
	public static void main(String[] args) {
		
		boolean a = 25> 36;
		System.out.println("a = "+a);
		System.out.println("!a = "+a);
		System.out.println();
		
		String b = "apple"; //리터럴 생성
		String c = new String("apple");
		
		//주소
		System.out.println(b==c? "같다":"다르다");
		
		//문자열
		System.out.println(b.equals(c)? "같다":"다르다");
		
	}
}
