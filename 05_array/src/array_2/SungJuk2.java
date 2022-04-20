package array_2;

import java.util.Scanner;

//int [][] ar = new int[3][]; // 가변길이
//
//ar[0] = new int[2];
//ar[1] = new int[3];
//ar[2] = new int[4];

public class SungJuk2 {
	public static void main(String[] args) {
		int stuNum, subjectCnt;
		String name, subject;
		String[][] student = new String[3][];
		

		// 인원수입력
		stuNum = new Scanner(System.in).nextInt();

		
		for(int i=0; i<stuNum; i++) {//명수만큼 입력받기
			
			
			student[i][i] = new Scanner(System.in).nextLine();
			
			// 과목수 입력
			subjectCnt = new Scanner(System.in).nextInt();
	
			
	
			student[0] = new String[stuNum]; //이름
			student[1] = new String[subjectCnt]; //과목
			student[2] = new String[subjectCnt]; //점수
			
			
	
			// 과목수 입력한만큼 과목명 입력받기
			// 과목명에 해당하는 점수 입력받기
	
			// 가변길이에 데이터랑 점수입력받기
	

			
			
			
			
			
			
			
		}//for i
		

		// 출력
		for (int i = 0; i < student.length; i++) {
			System.out.printf("ar[%d] = %s\n", i, student[i]);

			for (int j = 0; j < student[i].length; j++) {
				System.out.printf("ar[%d][%d] = %s\n", i, j, student[i][j]);
			}
			System.out.println();
		}

	}
}

[문제]

인원수를 입력하여
인원수만큼 데이터를
입력받고 총점과
평균을 구하시오
평균은 소수이하 2 째자리까지 출력

[실행결과]인원수:2

1
번째 이름입력:

홍길동 (name)
 과목수 입력 : 2   (subjectCnt)
 과목명 입력 : 국어 (subject)
 과목명 입력 : 영어
 국어 점수 입력 : 95 (jumsu)
 영어 점수 입력 : 100
 
 2번째
 이름입력 : 이기자 (name)
 과목수 입력 : 3   (subjectCnt)
 과목명 입력 : 국어 (subject)
 과목명 입력 : 영어
 과목명 입력 : 자바
 국어 점수 입력 : 95 (jumsu)
 영어 점수 입력 : 100
 자바 점수 입력 : 100
 
 이름     국어     영어    총점     평균
홍길동    95        100      xxx    xx.xx

 이름      국어      영어     자바    총점      평균
이기자       95       100     100    xxx      xx.xx