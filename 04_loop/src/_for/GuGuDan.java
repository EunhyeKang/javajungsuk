package _for;

import java.io.IOException;

public class GuGuDan {
	public static void main(String[] args) throws IOException {
		int dan;
		
		System.out.print("원하는 단을 입력 :");
//		dan = System.in.read() - 48; //1개 문자 입력
		dan = System.in.read() - '0'; // 1개 문자 입력
		System.out.println(dan);
		
		if(dan>=2 && dan<=9) {
			for(int i=1; i<=9; i++){
//				System.out.println(dan + "*" + i +"=" + dan*i);
				System.out.printf("%d * %d = %d", dan,i,dan*i);
				System.out.println();
			}
		}else
			System.out.println("범위초과");
		
	}
}

//[문제] 구구단
//-> 2 ~ 9까지만 구구단을 구하시오
//-> System.in.read() 사용
//
//[실행결과]
//원하는 단을 입력 : -5
//범위 초과
//----------------------------
//원하는 단을 입력 : 7
//7 * 1 = 7
//7 * 2 = 14
//7 * 3 = 21
//7 * 4 = 28
//7 * 5 = 35
//7 * 6 = 42
//7 * 7 = 49
//7 * 8 = 56
//7 * 9 = 63