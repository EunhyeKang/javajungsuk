package method;

import java.text.DecimalFormat;
import java.util.Scanner;

public class PayTest {
	public static void main(String[] args) {
	
	String name; //이름
	String title; //직급
	int basePay; // 기본급
	int extraPay; // 수당
	double rate; //세율
	
	Scanner sc = new Scanner(System.in);
	System.out.print("이름 입력 : ");
	name = sc.next();
	System.out.print("직급 입력 : ");
	title = sc.next();
	System.out.print("기본급 입력 : ");
	basePay = sc.nextInt();
	System.out.print("수당 입력 : ");
	extraPay = sc.nextInt();
	
	
	PayTest pt = new PayTest();
	int totalPay = pt.calcTotalPay(basePay,extraPay); // 급여 = 기본급 + 수당
	
	
	if( totalPay >= 4_000_000) rate=0.03; 
	else rate = 0.02;
	
//	int tax = (int)(totalPay * rate); // 세금 = 급여 * 세율
	int tax = pt.calcTax(totalPay, rate);
	
	int salary = pt.calcSalary(totalPay,tax); // 월급 = 급여 - 세금
	
	DecimalFormat df = new DecimalFormat();
	System.out.printf("***%s 월급 명세서***%n",name);
	System.out.printf("직급 : %s%n%n",title);
	System.out.println("기본급 \t 수당 \t  급여 \t 세율 \t  세금 \t 월급");
	System.out.println(df.format(basePay) +" "+ df.format(extraPay) + " "+ df.format(totalPay) +" "+  (int)(rate*100) + "% "+ df.format(tax) + " "+ df.format(salary));
	
	
	}
	

	public int calcSalary(int totalPay, int tax) {
		return totalPay - tax;
	}

	public int calcTotalPay(int totalPay, int tax){
		return totalPay+tax;
	}
	
	public int calcTax(int totalPay, double rate) {
		return (int)(totalPay * rate);
	}
	
	
}
/*
 * /*
 * 
 * [문제] 월급 계산 프로그램
이름, 직급, 기본급, 수당을 입력하여 급여, 세금, 월급을 계산하시오
세율은 급여가 4,000,000원 이상이면 3% 아니면 2%로 한다 
if문 또는 조건 연산자 사용해도 된다.

급여 = 기본급 + 수당
세금 = 급여 * 세율
월급 = 급여 - 세금

[실행결과]
이름 입력 : 홍길동
직급 입력 : 부장
기본급 입력 : 4500000
수당 입력 : 200000

         *** 홍길동 월급 명세서 ***
직급 : 부장

기본급      수당         급여            세율      세금      월급
4,500,000     200,000     4,700,000      3%      xx,xxx   x,xxx,xxx
 */




//public class PayTest {
//
//	   public static void main(String[] args) {
//	      Scanner scan = new Scanner(System.in);
//	      DecimalFormat df = new DecimalFormat();
//	      
//	      System.out.print("이름 입력 : ");
//	      String name = scan.next();
//	      System.out.print("직책 입력 : ");
//	      String position = scan.next();
//	      System.out.print("기본급 입력 : ");
//	      int basePay = scan.nextInt();
//	      System.out.print("수당 입력 : ");
//	      int extraPay = scan.nextInt();
//	      
//	      int totalPay = basePay + extraPay;
//	      double taxRate;
//	      if(totalPay >= 4000000)  taxRate = 0.03;
//	      else taxRate = 0.02;
//	      int tax = (int)(totalPay * taxRate);
//	      int pay = totalPay - tax;
//	      
//	      System.out.println("\t *** " + name + " 월급 명세서 ***");
//	      System.out.println("직급 : " + position);
//	      System.out.println("기본급\t\t수당\t급여\t\t세율\t세금\t월급");
//	      
//	      System.out.println(df.format(basePay) + "\t"
//	            + df.format(extraPay) + "\t"
//	            + df.format(totalPay) + "\t"
//	            + df.format((int)(taxRate*100)) + "% \t"
//	            + df.format(tax) + "\t"
//	            + df.format(pay));
//	   }
//
//	}
