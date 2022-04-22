package constructor;

//데이터베이스(오라클)
// -> 메모리에 딱 1번만 생서한다. => 싱글톤

public class StringMain {
	public static void main(String[] args) {
		
		String a = "apple"; // literal 생성
		String b = "apple"; // 똑같은 문자열 literal은 2번이상 잡히지 않는다.
		if(a==b) System.out.println("a와 b의 참조값은 다르다.");
		else System.out.println("a와 b의 참조값은 다르다");
		
		if(a.equals(b))System.out.println("a와b의 문자열은 같다");
		else System.out.println("a와b의 문자열은 다르다");
		System.out.println();
		
		String c = new String("apple");
		String d = new String("apple");
		if(c==d) System.out.println("c와 d의 참조값은 다르다.");
		else System.out.println("c와 d의 참조값은 다르다");
		
		
		if(c.equals(d)) System.out.println("c와 d의 문자열은 같다");
		else System.out.println("c와 d의 문자열은 다르다");
		System.out.println();
		
		String e = "오늘 날짜는 " + 2022 + 4 + 22;
		//이렇게 하면 메모리에 여러번 남게된다. 오늘날짜는/오늘날짜는2022/등등
//		문자열은 편집이 안되므로 메모리 4번 생성된다
//		JVM에 의해서 삭제 시 Garbage Collector로 보낸다
//		Garbage Collector가 실행(휴지통 비우기)되면 컴퓨터는 멈춘다
		
		//그래서 문자열 문자열 편집이 가능하게끔 String Buffer 를 사용한다
		//StringBuffer
		
		System.out.println("문자열 = "+e);
		System.out.println("문자열 크기 = "+e.length());
		System.out.println();
		System.out.println("첫번째 문자 = " +e.charAt(0));
		System.out.println("두번째 문자 = " +e.charAt(1));
		System.out.println("마지막 문자 = " +e.charAt(13));
		
		System.out.println("부분 문자열 추출=" + e.substring(7));
		System.out.println("부분 문자열 추출=" + e.substring(7,11));//7번부터 10번까지
		
		System.out.println("대문자 변경 = " + "HELLO".toUpperCase());
		System.out.println("소문자 변경 = " + "HELLO".toLowerCase());
		
		System.out.println("문자열 검색 = " + e.indexOf("짜")); //4
		System.out.println("문자열 검색 = " + e.indexOf("날짜")); //3
		System.out.println("문자열 검색 = " + e.indexOf("개바부")); //-1(찾는문자열이 없을때)
		System.out.println("문자열 검색 = " + e.indexOf("2")); //7
		System.out.println("문자열 검색 = " + e.indexOf("2",0)); //7
		System.out.println("문자열 검색 = " + e.indexOf("2",8)); //9
	
		
		System.out.println("문자열 치환 = " + e.replace("날짜","일자")); //
		
		
		
	}
}
