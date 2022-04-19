package array_2;

public class SungJuk {
	public static void main(String[] args) {
		String [] name = {"홍길동","라이언","어피치"}; //1차원
		int [][] jumsu = {{90,96,100,0},{100,89,75,0},{75,80,48,0}};
		double[] avg = new double[3]; 
		char[] grade = new char[3]; 
		
		
		//총점
		//jumsu0,3 = 0,0 + 0,1 + 0,2
		//jumsu1,3 = 1,0 + 1,1 + 1,2
		//
		int sum=0;
		for(int i=0; i<jumsu.length; i++) {
			//총점
			for(int j=0; j<jumsu[i].length-1; j++) { // 국어 영어 수학
				jumsu[i][3] += jumsu[i][j];
			}	//for j
			
			avg[i] = (double)(jumsu[i][3])/3;
		
			if(avg[i]>=90) grade[i] = 'A';
			else if(avg[i]>=80) grade[i] = 'B';
			else if(avg[i]>=70) grade[i] = 'C';
			else if(avg[i]>=80) grade[i] = 'D';
			else grade[i] = 'F';
			
		}//for i
		
		
		System.out.println("************************************************");
		System.out.println("이름\t 국어\t 영어\t 수학\t 총점\t 평균\t 학점\t");
		System.out.println("************************************************");
		
		//출력
		for(int i=0; i<jumsu.length; i++) {
			
			System.out.print(name[i]+"\t"); //이름
			
			for(int j=0; j<jumsu[i].length; j++) { //국어 영어 수학 총점
				
				System.out.print(jumsu[i][j]+"\t");
				
			}// for j
			
			System.out.print(String.format("%.2f", avg[i])+"\t");//평균
			System.out.print(grade[i]+"\t");//학점
			System.out.println();
		}//for i
		
	}
}


//
//
//----------------------------------------------------
//이름      국어      영어      수학      총점      평균      학점
//----------------------------------------------------
//홍길동   90      96      100
//라이언   100      89      75
//어피치   75      80      48
//----------------------------------------------------
//
//
//[문제] 성적처리
//- 평균의 소수이하 2째 자리까지 출력하시오
//
//총점 = 국어 + 영어 + 수학
//평균 = 총점 / 3
//평균이 90이상이면 A
//평균이 80이상이면 B
//평균이 70이상이면 C
//평균이 60이상이면 D
//그외는 F
//
