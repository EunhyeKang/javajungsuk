package operator;

public class Operator3 {
	public static void main(String[] args) {

		int num1 = 0, num2 = 0;
		boolean result;

//		              false     &&    앞이 false라 연산안함
		result = ((num1 += 10) < 0 && (num2 += 10) > 0);
		System.out.println("result = " + result); //
		System.out.println("num1 = " + num1 + " num2 = " + num2); // num1=10, num2=0
		System.out.println();

//					 true   ||   앞이 true라 연산 안함
		result = ((num1 += 10) > 0 || (num2 += 10) > 0);
		System.out.println("result = " + result);
		System.out.println("num1 = " + num1 + " num2 = " + num2); // num1=20, num2=0

	}
}
