package _class;

public class SungJukMain2 {
	public static void main(String[] args) {
		
		SungJuk hong = new SungJuk(); //객체
		SungJuk lion = new SungJuk(); //객체
		SungJuk apeach = new SungJuk(); //객체
		
		SungJuk[] ar = new SungJuk[3]; //객체배열방 생성
		
		for(int i=0; i<ar.length; i++) {//객체할당
			ar[i] = new SungJuk();
		}
		
		
		ar[0].setName("홍길동");
		ar[0].setKor(90);
		ar[0].setEng(96);
		ar[0].setMath(100);
		
		ar[1].setName("라이언");
		ar[1].setKor(100);
		ar[1].setEng(89);
		ar[1].setMath(75);
		
		ar[2].setName("어피치");
		ar[2].setKor(75);
		ar[2].setEng(80);
		ar[2].setMath(48);
		
		System.out.println("----------------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("----------------------------------------------------");
		
		for(int i=0; i<ar.length; i++) {
			ar[i].calc();
			
			System.out.println(ar[i].getName() +"\t"+  
					ar[i].getKor()  +"\t"+ 
					ar[i].getEng()  +"\t"+ 
					ar[i].getMath() +"\t"+
					ar[i].getTot()  +"\t"+ 
					ar[i].getAvg() );

			
		}
		System.out.println("----------------------------------------------------");
	
	}	
}
