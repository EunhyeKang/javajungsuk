package collection;

public class SungJukDTO implements Comparable<SungJukDTO>{
	
	int no;
	String name;
	int kor;
	int eng;
	int math;
	int tot;;
	double avg;
	
	
	
	public SungJukDTO(int no, String name, int kor, int eng, int math) {
		super();
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		
		this.calc();
		
	}
	
	public void calc() {
		tot = eng + math + kor;
		avg = tot/3.0;
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
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		return avg ;
	}
	
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	public String toString() {
		return no + "\t" + name + "\t" +
				kor + "\t" +
				eng + "\t" +
				math + "\t" +
				tot + "\t" +
				String.format("%.2f", avg);
	}


	
	

	@Override  //내림차순
	public int compareTo(SungJukDTO p) {
		
		if(this.tot < p.tot) return 1;
		else if(this.tot > p.tot) return -1;
//		else if(this.age == p.age) return 0;
		else return 0;
		
	}
	

	
	
	
	




}
