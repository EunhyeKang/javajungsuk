package re_01;
import java.util.Scanner;

class A{
	
	protected int num = 8;
	protected int sum = 0;
	protected double avg = 0;
	protected int[] score = new int[num];
	
	public void enterScore() { //성적입력
		for(int i=0; i<score.length; i++) {
			System.out.printf("%d번째 학생 점수:",(i+1));
			score[i] = new Scanner(System.in).nextInt();
		}
	}
	
	public void calSum() { // 성적 합계
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
	}
	
	public void calAvg() { //성적 평균
			avg = (double)sum/score.length;
	}
	
	public void printSumAvg() { //출력
		System.out.printf("합계:%d",sum);
		System.out.printf("평균:%.2f",avg);
	}
}

class B extends A{
	protected int count=0;
	
	public void initialTask() {
	}
	
	public void countUnderAvg() {

	}
	
	public void printCount() {

	
	}
}

class C extends B{
	private int[] gradeNum = new int[5];
	
	public void initialTask() {

	}
	
	public int calGrade(int score) {
		return 0;
	}
	
	public void countGrade() {
	}
	
	public void drawGraph() {
	}
}
