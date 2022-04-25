package collection;

public class SungJukDTO {
	
	int no;
	String name;
	int kor;
	int eng;
	int math;
	int tot;;
	double avg;
	
//	SungJukService s = new SungJukService();
	
	
	public SungJukDTO(int no, String name, int kor, int eng, int math) {
		super();
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		tot = kor+eng+math;
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		double avg = tot/3.0;
		return avg ;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
}
