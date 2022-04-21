import java.util.Scanner;

class A{
	
	protected int num = 8;
	protected int sum = 0;
	protected double avg = 0;
	protected int[] score = new int[num];
	
	public void enterScore() { //성적입력
		Scanner scan = new Scanner(System.in);
		
		for(int i=0; i<this.score.length; i++) {
			System.out.print((i+1) + "번의 성적을 입력하세요: ");
			this.score[i] = scan.nextInt();
		}
	}
	
	public void calSum() { // 성적 합계
		for(int i=0; i<this.score.length; i++) {
			sum += this.score[i];
		}
	}
	
	public void calAvg() { //성적 평균
		avg = (double)sum/this.score.length;
	}
	
	public void printSumAvg() { //출력
		System.out.println("합계 = " + sum + "  |  평균 = " + avg);
	}
}

class B extends A{
	protected int count=0;
	
	public void initialTask() {
		super.enterScore();
		super.calSum();
		super.calAvg();
	}
	
	public void countUnderAvg() {

		for(int i=0; i<this.score.length; i++) {
			if(score[i] < this.avg) {
				count++;
			}
		}
	}
	
	public void printCount() {
		printSumAvg();
		System.out.println("평균 이하인 사람은 " + count + "명입니다.\n");
	}
}

class C extends B{
	private int[] gradeNum = new int[5];
	
	public void initialTask() {

		super.initialTask();
		super.countUnderAvg();
		super.printCount();
	}
	
	public int calGrade(int score) {
//단 평점의 종류는 A(100~90점), B(89~80점), C(79~70점), D(69~60점), F(59점 이하)로 정한다.
		if(score>=90) 					return 0;
		else if(score>=80)	return 1;
		else if(score>=70)	return 2;
		else if(score>=60) 	return 3;
		else							return 4;
	}
	
	public void countGrade() {
		for(int i=0; i<this.score.length; i++) {
			gradeNum[calGrade(score[i])]++;
		}
	}
	
	public void drawGraph() {
		for(int i=0; i<this.gradeNum.length; i++) {
			if(i == 4) {
				System.out.print((char)(i+'A'+1) + "(" + gradeNum[i] + "명) | ");
			}
			else {
				System.out.print((char)(i+'A') + "(" + gradeNum[i] + "명) | ");
			}
			for(int j=0; j<gradeNum[i]; j++) {
				System.out.print("#");
			}
			System.out.println();
		}
	}
}
