//package com.hw;
//
////아래의 내용에 클래스 상속, 객체 배열, 생성자 등을 적용한 객체지향프로그램을 작성하시오.
////
////
////1. 8명의 자바 중간고사 성적을 입력하고 이들의 합과 평균을 구하는 프로그램을 작성하라.
////
////2. 8명의 성적 중 평균 미만이 몇 명인지 카운트하는 내용을 상기1.에 추가하라.
////
////3. 입력한 성적에 평점을 구하고 평점별 누적을 계산하고 아래와 같이 출력하도록 상기2.를 확장하라.
////A(2명) | **
////B(4명) | ****
////C(1명) | **
////D(0명) |
////F(1명)  | *
////-----------------
////총합 8명(평균 82점)
//
//
//
//public class Main {
//
//	public static void main(String[] args) {
////		A a = new A();
////		B b = new B();
//		C c = new C();
//		
//		Score_1 s1 = new Score_1();
//		s1.makeScoreList(c);
//		
//		Score_2 s2 = new Score_2(c);
//		s2.getbelowAvgCount();
//		
//		Score_3 s3 = new Score_3(c);
////		s3.setBelowCount(student);
//		
////		
//	}	
//}
//
//
//
//
//
//
//class A {
//	int [] studentScore;
//	int totalScore;
//	double avg;
//	
//	public void inputScore(int [] score){//   성적입력();
//		this.studentScore = score;
//	}
//	public void setTotal(int total) {
//		this.totalScore = total;
//	}
//	public int getTotal(){//성적합계();
//		return totalScore;
//	}
//	public double getAvg(){//성적평균();
//		avg = (double)totalScore/studentScore.length;
//		return avg;
//	}
//}
//
//
//class B extends A {
//
//	int belowAvgCount = 0;
//	
//	public void setbelowAvgCount(int below){//   평균미만학생수카운트();	
//			this.belowAvgCount = below;
//	}
//	
//}
//
//
//class C extends B {
//
//	char [] grade;
//	int [] gradeCount;
//	
//	public void getGrade(){//  평점구하기(); 단 평점의 종류는 A(100~90점), B(89~80점), C(79~70점), D(69~60점), F(59점 이하)로 정한다.
//		
//	}
//
//	int gradeStuNumCount(){//  평점별학생수카운트();
//		
//		return 1;
//	}
//
//	void drawGraph(){//  가로형막대그래프그리기();
//		
//	}
//	
//	
//	
//}
