package constructor;

import java.util.StringTokenizer;

//StringTokenizer    String-split()


public class Token {
	public static void main(String[] args) {
		String str = "학원,집,,게임방";
		
		StringTokenizer st = new StringTokenizer(str,",");
		System.out.println("토큰 개수 = "+st.countTokens());// 3 // 비어있는 문자열 안셈.
		
		//hasMoreTokens() - 현재 위치에 항목 있다/없다. T/F
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		System.out.println("--------------");
		
		String[] ar = str.split(",");
		for(String data : ar) {
			System.out.println(data);
		}
		
	}
}

//배열.length
//문자열.length()