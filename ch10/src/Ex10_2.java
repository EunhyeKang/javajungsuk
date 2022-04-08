import java.util.Calendar;

public final class Ex10_2 {
	public static void main(String[] args) {
		final String[] DAY_OF_WEEK= {"","일","월","화","수","목","금","토"};
		
//		date1 년월일 요일,
//		오늘 date2 년원일 요일
//		그날 date1-date2까지 초
//		일로 계산하면 며칠.
//		
		Calendar date1 = Calendar.getInstance();
		Calendar date2 = Calendar.getInstance();
		
		//month의 경우 0부터 시작하기 때문에 4월인 경우, 3로 지정해야한다.
		//date1.set(2019,Calendar.APRIL,29);와 같이 할수도 있다.
		date1.set(2019, 3, 29); 
		
		System.out.println("date1은 "+toString(date1));
		System.out.println("오늘(date2)는 " + toString(date2) + DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)]+"요일");
		
		//두 날짜간의 차이를 얻으려면, getTimeInMillis() 천분의 일초 단위로 변환해야 한다.
		long diff = Math.abs( (date2.getTimeInMillis() - date1.getTimeInMillis())/1000 );
		
		System.out.println("date1부터 date2까지 "+ diff +"초가 지났습니다.");
		System.out.println("일(day)로 계산하면 " + diff/(24*60*60)+"일 입니다.");//1일 = 24시간 * 60분 * 60초
		
	}
	
	public static String toString(Calendar date) {
		return date.get(Calendar.YEAR)+"년"+(date.get(Calendar.MONTH)+1)+"월"+date.get(Calendar.DATE)+"일";
	}
}
