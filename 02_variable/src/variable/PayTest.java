package variable;

import java.text.DecimalFormat;

public class PayTest {
	public static void main(String[] args) {

		String name = "L";
		int basePay = 2500000;
		int tax = (int)(basePay * 0.033);
		int salary = basePay - tax;

		DecimalFormat df = new DecimalFormat();
		System.out.println("***"+name+"의 월급 ***");
		System.out.println("기본급 : "+df.format(basePay)+"원");
		System.out.println("세금 : "+df.format(tax)+"원");
		System.out.println("월급 : "+df.format(salary)+"원");
		System.out.println();

		System.out.printf("*** %s의 월급 ***%n",name);
		System.out.printf("기본급 : %d원%n",basePay);
		System.out.printf("세금 : %d원%n", tax);
		System.out.printf("월급 : %d원%n", salary);
		
	}
}

//이름이 L (name)인 사람의 기본급(basePay)이 2500000일때, 3.3% 세금(tax)과 월급(salary)을 계산.

//세금 = 기본급 * 3.3%(0.033)
//월급 = 기본급 - 세금

//[실행결과]
//		
//		