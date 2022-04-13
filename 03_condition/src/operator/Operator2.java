package operator;

public class Operator2 {
	public static void main(String[] args) {
		int a = 5;
		a += 2; // a = a + 2; // 21
		a *= 3; // a = a * 3;
		System.out.println("a = "+a);//21
		
		a++;
		System.out.println("a = "+a);//22
		
		int b = a++;
		System.out.println("a = " + a + "b = "+b);//23, 22
		
		int c = ++a - b--;
		System.out.println("a = "+ a + "b = "+b + "c = "+c);//24,21,2
		
		System.out.println("a++ = "+ a++);//24
		
//		System.out.println("a++ = "+ a);// 
//		a++; //25
		
		System.out.println("a = "+a); // 25
		
		
	}
}
