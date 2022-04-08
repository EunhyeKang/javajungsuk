import java.util.Calendar;

public class Ex10_1 {
	public static void main(String[] args) {
		//기본적으로 현재날짜와 시간으로 설정된다.
		Calendar cal = Calendar.getInstance(); //캘린더 객체를 생성
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)); // 0:1월
		System.out.println(cal.get(Calendar.WEEK_OF_YEAR));
		System.out.println(cal.get(Calendar.WEEK_OF_MONTH));
		
		//DATE와 DAY_OF_MONTH는 같다.
		System.out.println(cal.get(Calendar.DATE));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.DAY_OF_YEAR));
		System.out.println(cal.get(Calendar.DAY_OF_WEEK)); //1~7 1:일요일 
		System.out.println(cal.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println(cal.get(Calendar.AM_PM));//0:오전 1:오후
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		System.out.println(cal.get(Calendar.MILLISECOND));
		System.out.println(cal.getActualMaximum(Calendar.DATE));
		
		
		
		
	}
	
}
