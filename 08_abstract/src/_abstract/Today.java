package _abstract;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Today {
	public static void main(String[] args) throws ParseException {
		Date date = new Date();
		System.out.println("오늘 날짜 : " + date);
		System.out.println();
		
		//날짜 형식
		SimpleDateFormat sdf = new SimpleDateFormat("y년 MM월 dd일 E요일 HH:mm:ss");
		System.out.println("오늘 날짜 : " + sdf.format(date));
		System.out.println();
		
		//입력
		SimpleDateFormat input = new SimpleDateFormat("yyyyMMddHHmmss");
		
		Date birth = input.parse("19930426052015"); //String   //현재 가지고있는 문자열을 Date형으로 변환하겠다.
		System.out.println(birth + " - 원래형식");  
		System.out.println();
		System.out.println(sdf.format(birth) + " - 내가 지정한 형식");
		
//		Calendar cal = new Calendar();
		Calendar cal = new GregorianCalendar(); // Calendar cal = 자식;  //기준은 시스템 날짜와 시간
		Calendar cal1 = Calendar.getInstance();		//Calendar cal = 메소드;
	
		System.out.println();
		
		//다른나라의 시간을 기준으로 변경
		Calendar cal2 = Calendar.getInstance(TimeZone.getTimeZone("Canada/Pacific"));
		System.out.println(cal2);
//		System.out.println(sdf.format(cal2));
		
		
//		int year = cal.get(1);
		//	1 - Calendar.YEAR (상수)
		int year = cal.get(Calendar.YEAR);
		System.out.println(year+"년");
		
		int month = cal.get(Calendar.MONTH) + 1 ; // 1월-0 2월-1 3월-2 ~~ 12월-11
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		int week = cal.get(Calendar.DAY_OF_WEEK); // 일-1, 월-2, 화-3 .. 토-7
		
		
		String dayOfWeek = null;
		switch(week) {
		case 1 : dayOfWeek = "일"; break;
		case 2 : dayOfWeek = "월"; break;
		case 3 : dayOfWeek = "화"; break;
		case 4 : dayOfWeek = "수"; break;
		case 5 : dayOfWeek = "목"; break;
		case 6 : dayOfWeek = "금"; break;
		case 17 : dayOfWeek = "토"; break;
		
		}//switch
		
		System.out.println(year + "년 " + month + "월" +  day +"일" + dayOfWeek + "요일");
		System.out.println(hour + "시 "+ minute + "분" + second + "초");
		
		
		
		
	
		
		
		
		
	}
}
