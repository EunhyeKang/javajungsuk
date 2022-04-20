package _class;

class SungJuk{
	private String name;
	private int kor, eng, math, tot;
	private double avg;
	
	public void calc() {
		tot = kor + eng + math;
		avg = tot/3.0;
	}
	
	//setter
	public void setName(String name){
		this.name = name;
	}
	public void setKor(int kor){
		this.kor = kor;
	}
	public void setEng(int eng){
		this.eng = eng;
	}
	public void setMath(int math){
		this.math = math;
	}
	//getter
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	public int getTot() {
		return tot;
	}
	public String getAvg() {
		return String.format("%.2f", avg);
	}
	
	
	
}


public class SungJukMain {
	public static void main(String[] args) {
		
//		String[] name = {"홍길동","라이언","어피치"};
//		int [][] jumsu = {{90,96,100,0},{100,89,75,0},{}};
//		double[] avg = new double[3];
//		char[] grade = new char[3];	
		
		SungJuk hong = new SungJuk();
	
		hong.setName("홍길동");
		hong.setKor(90);
		hong.setEng(96);
		hong.setMath(100);
		hong.calc();
		System.out.println("----------------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------------");
		System.out.println(hong.getName() +"\t"+  hong.getKor()  +"\t"+ hong.getEng()  +"\t"+ hong.getMath() 
										+"\t"+hong.getTot()  +"\t"+ hong.getAvg() );
		
		SungJuk lion = new SungJuk();
		lion.setName("라이언");
		lion.setKor(100);
		lion.setEng(89);
		lion.setMath(75);
		lion.calc();
		
//		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(lion.getName() +"\t"+  lion.getKor()  +"\t"+ lion.getEng()  +"\t"+ lion.getMath() 
										+"\t"+lion.getTot()  +"\t"+ lion.getAvg() );
		
		SungJuk apeach = new SungJuk();
		apeach.setName("어피치");
		apeach.setKor(75);
		apeach.setEng(80);
		apeach.setMath(48);
		apeach.calc();
		
		
//		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println(apeach.getName() +"\t"+  apeach.getKor()  +"\t"+ apeach.getEng()  +"\t"+ apeach.getMath() 
										+"\t"+apeach.getTot()  +"\t"+ apeach.getAvg() );
		
		System.out.println("----------------------------------------------------");
		
		//----------------------------------------------------
		//이름      국어      영어      수학      총점      평균      학점
		//----------------------------------------------------
		//홍길동   90      96      100
		//라이언   100      89      75
		//어피치   75      80      48
		//----------------------------------------------------
	}	
}
