package array_2;

import java.util.Scanner;//////////////////////삽질삽질삽질

//int [][] ar = new int[3][]; // 가변길이
//
//ar[0] = new int[2];
//ar[1] = new int[3];
//ar[2] = new int[4];

public class SungJuk3 {
	public static void main(String[] args) {
		int stuNum, subjectCnt;
		String [] name, subject,jumsu;
		
		int [] sum; double []avg;
		
		// 인원수입력
		System.out.print("인원수 입력:");
		stuNum = new Scanner(System.in).nextInt(); 
		
		String[][] student = new String[5][];
		name = new String[stuNum]; //배열방생성
		sum = new int[stuNum];
		avg = new double[stuNum];
		
		for(int i=0; i<stuNum; i++) {//명수만큼 입력받기
			System.out.printf("%d번째 이름입력 :",i+1);
			name[i] = new Scanner(System.in).nextLine();
			
			
			// 과목수 입력
			System.out.print("과목수 입력:");
			subjectCnt = new Scanner(System.in).nextInt();
			student[0] = new String[subjectCnt]; //과목수만큼 방잡아주기//**************
			
			for(int j=0; j<subjectCnt; j++) {//과목입력받기
				System.out.print("과목명 입력:");
				student[i][j] = new Scanner(System.in).nextLine();	
			}//for j
			
			//성적입력
			student[1] = new String[subjectCnt]; //과목수만큼 방잡아주기//**************
			for(int j=0; j<subjectCnt; j++) {//성적입력받기
				System.out.print("성적 입력:");
				student[i][j] = new Scanner(System.in).nextLine();//**********
				
				//총점
				sum[i] += Integer.parseInt(student[1][j]);
				
			}//for j	
			
			
			
			
		
			
			
			//평균
			avg[i] = (double)sum[i]/subjectCnt;
		
			
	
		}//for i //한명씩 입력 반복
		
	
	

		
		
		
		int kk=0;
		
		// 출력
		for (int i = 0; i < name.length; i++) {

			
			
//			System.out.println("************************************************");
			System.out.print("이름\t ");
			
			for(int j=0; j<student[i].length; j++) {
				System.out.print(student[kk][j]+" ");
				kk+=3;
			}
			System.out.println("총점\t 평균\t");
			
			
			System.out.printf(name[i]+"\t");//이름
					
			for(int k=0; k<student[1].length; k++) { //점수
				System.out.print(Integer.parseInt(student[1][k])+"\t");	
			}
			
//			for (int j = 0; j < student[i].length; j++) {
//				System.out.printf(student[i][j]+"\t");
//			}
			
			System.out.printf(sum[i]+"\t"+avg[i]);
			System.out.println();
		}
		
		

	}
}
//
//[문제]
//
//인원수를 입력하여
//인원수만큼 데이터를
//입력받고 총점과
//평균을 구하시오
//평균은 소수이하 2 째자리까지 출력
//
//[실행결과]인원수:2
//
//1
//번째 이름입력:
//
//홍길동 (name)
// 과목수 입력 : 2   (subjectCnt)
// 과목명 입력 : 국어 (subject)
// 과목명 입력 : 영어
// 국어 점수 입력 : 95 (jumsu)
// 영어 점수 입력 : 100
// 
// 2번째
// 이름입력 : 이기자 (name)
// 과목수 입력 : 3   (subjectCnt)
// 과목명 입력 : 국어 (subject)
// 과목명 입력 : 영어
// 과목명 입력 : 자바
// 국어 점수 입력 : 95 (jumsu)
// 영어 점수 입력 : 100
// 자바 점수 입력 : 100
// 
// 이름     국어     영어    총점     평균
//홍길동    95        100      xxx    xx.xx
//
// 이름      국어      영어     자바    총점      평균
//이기자       95       100     100    xxx      xx.xx