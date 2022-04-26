package _abstract;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

import java.util.Scanner;

class CalendarTest{
	
	int year, month = 0;
	Scanner scan = new Scanner(System.in);
	
	
	CalendarTest(){
		System.out.print("년도 입력 : ");
		year = scan.nextInt();
		System.out.print("월 입력 : ");
		month = scan.nextInt();
	}
	 
	
	void calc(){
		//월마다 끝나는 일(28,29,30,31)을 구하기
		// 월마다 시작하는 요일 구하기
//		
//		int month = cal.get(Calendar.MONTH) + 1 ; // 1월-0 2월-1 3월-2 ~~ 12월-11
//		int day = cal.get(Calendar.DAY_OF_MONTH);
//		int hour = cal.get(Calendar.HOUR_OF_DAY);
//		int minute = cal.get(Calendar.MINUTE);
//		int second = cal.get(Calendar.SECOND);
//		int week = cal.get(Calendar.DAY_OF_WEEK); // 일-1, 월-2, 화-3 .. 토-7
//		
		Calendar cal = new GregorianCalendar();
		
		int fday;
		int eday;
		int yoil;
		
		fday = cal.get(Calendar.DAY_OF_WEEK_IN_MONTH);
	
		
		
		
		
	}
	
	
	void display(){
		/*
	
		[실행결과]
		년도 입력 : 2002
		월 입력 : 10

		일	월	화	수	목	금	토
				1	2	3	4	5
		6	7	8	9	10	11	12
		13	14	15	16	17	18	19
		20	21	22	23	24	25	26
		27	28	29	30	31

		 */
		
		System.out.println("일 월 화 수 목 금 토");
		for(int i=1; i<=31; i++) {
			
			System.out.print(i + " ");
			
			System.out.println();
			
		}
	
		
		
		
		
	}
	
	
	
}






public class CalendarMain {
	public static void main(String[] args) {
		CalendarTest ct = new CalendarTest();
		ct.display();
	
		
	}
}



/*
[문제] 만년달력
1. 년, 월을 입력하여 달력을 출력하시오
2. 클래스 : CalendarTest
   필드
   생성자 : 입력
   메소드 : calc() -> 월마다 끝나는 일(28, 29, 30, 31)을 구하기
                  -> 월마다 시작하는 요일을 구하기
           display()

[실행결과]
년도 입력 : 2002
월 입력 : 10

일	월	화	수	목	금	토
		1	2	3	4	5
6	7	8	9	10	11	12
13	14	15	16	17	18	19
20	21	22	23	24	25	26
27	28	29	30	31

 */
