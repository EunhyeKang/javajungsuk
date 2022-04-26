package _abstract;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberMain {
	
	
	public static void main(String[] args) {
		//3자리마다 ,를 찍고 기본으로 소수이하 3째자리
//		NumberFormat nf = new NumberFormat();
		NumberFormat nf = new DecimalFormat();
		//DecimalFormat df = new DecimalFormat();
		System.out.println(nf.format(12345678.456789));
		System.out.println(nf.format(12345678));
		System.out.println();
		
		
		//유효숫자가 아닌 것은 표현하지 않는다.
		NumberFormat nf2 = new DecimalFormat("#,###.##원");
		System.out.println(nf2.format(12345678.456789));
		System.out.println(nf2.format(12345678));
		System.out.println();
		
		
		//0을 강제로 표시
		NumberFormat nf3 = new DecimalFormat("#,###.00원");
		System.out.println(nf3.format(12345678.456789));
		System.out.println(nf3.format(12345678));
		System.out.println();
		
		
		//3자리마다 , 를 찍고 기본으로 소수이하 2째자리
		//static붙어있으면 클래스명으로 바로 접근 가능하며
		//메소드 사용해서 객체얻어........?
//		NumberFormat nf4 = ??; //메소드 이용
//		NumberFormat nf4 = NumberFormat.getInstance(); //메소드 이용하여 생성
		NumberFormat nf4 = NumberFormat.getCurrencyInstance(); //메소드 이용하여 생성
		nf4.setMaximumFractionDigits(3);//소수이하 2째자리
		nf4.setMinimumFractionDigits(3);//0을 강제로 표시
		System.out.println(nf4.format(12345678.456789));
		System.out.println(nf4.format(12345678));
		System.out.println();
		
		
		
		NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.US); //메소드 이용하여 생성
		System.out.println(nf5.format(12345678.456789));
		System.out.println(nf5.format(12345678));
		System.out.println();
		
		
		NumberFormat nf6 = NumberFormat.getCurrencyInstance(Locale.CHINA); //중국 일본
		nf6.setMaximumFractionDigits(2);//소수이하 2째자리
		System.out.println(nf6.format(12345678.456789));
		System.out.println(nf6.format(12345678));
		System.out.println();
		
		
		
		
	}
	
}
