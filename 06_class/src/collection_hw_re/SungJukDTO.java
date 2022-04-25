package collection_hw_re;

public class SungJukDTO {
	private int no, kor, eng, math, tot;
	private String name;
	private double avg;
	
	
	public SungJukDTO(int no, String name, int kor, int eng, int math) {
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.name = name;
		
//		this.calc();
	}
	
	public void calc() {
		tot = kor + eng + math;
		avg= tot/3.0;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	public String toString() {
//		return name;
		return no + "\t" + name + "\t" +
				kor + "\t" +
				eng + "\t" +
				math + "\t" +
				tot + "\t" +
				String.format("%.2f", avg);
				
	}
	
}


/*
1. 번호(no), 이름(name), 국어(kor), 영어(eng), 수학(math)점수를 입력하여 총점(tot)과 평균(avg)을 구하시오
번호 no
이름 name
국어 kor
영어 eng
수학 math
총점 tot
평균 avg
*/
