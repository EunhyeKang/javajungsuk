import java.util.Calendar;

public class Ex10_5 {
	public static void main(String[] args) {
		if(args.length!=2) {
			System.out.println("Usage : java Ex10_5 2019 9");
			return;
		}
		int year = 2019;
		int month = 9;
		int START_DAY_OF_WEEK = 0; // 1일의 요일
		int END_DAY = 0;
		
		Calendar sDay = Calendar.getInstance(); //시작일
		Calendar eDay = Calendar.getInstance(); //끝일
		
		sDay.set(year,8,1); //2019.9.1
		eDay.set(year,9,1); //2019.10.1
		//다음달의 첫날에서 하루를 빼면 현재달의 마지막날이
		eDay.add(Calendar.DATE, -1);
		
		//첫번째 요일이 무슨요일인지 알아낸다. 1일이 무슨요일인지 알아낸다.
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
		
		END_DAY = eDay.get(Calendar.DATE);
		
		System.out.println("      "+year+"년 "+ month+"월");
		System.out.println(" su mo tu we th fr sa");
		
		for(int i=1; i<START_DAY_OF_WEEK; i++) {
			System.out.print("  ");
		}
		for(int i=1, n=START_DAY_OF_WEEK; i<=END_DAY; i++,n++) {
			System.out.print((i<10)? "  "+ (i) : " "+(i));
			if(n%7==0) System.out.println();
		}
	}
}
