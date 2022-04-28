package constructor;

class Fruit {

	private String pum;
	private int jan, feb, mar;
	private int tot;

	private static int sumJan, sumFeb, sumMar;

	public Fruit(String pum, int jan, int feb, int mar) {
		this.pum = pum;
		this.jan = jan;
		this.feb = feb;
		this.mar = mar;
	}

	public void calcTot() {
		tot = jan + feb + mar;	//합계
		sumJan += jan; //1월 합계
		sumFeb += feb; //2월 합계
		sumMar += mar; //3월 합계
	}

	public void display() {
		System.out.println(pum + "\t" + jan + "\t" + feb + "\t" + mar + "\t" + tot);
	}

	public static void output() { // 월별 출력
		System.out.println("\t" + sumJan + "\t" + sumFeb + "\t" + sumMar);
	}


}

public class FruitMain {
	public static void main(String[] args) {

		
		Fruit[] f = new Fruit[3];
		f[0] = new Fruit("사과", 100, 80, 75);
		f[1] = new Fruit("포도", 30, 25, 10);
		f[2] = new Fruit("딸기", 25, 30, 90);

		System.out.println("-----------------------------------");
		System.out.println("PUM\tJAN\tFEB\tMAR\tTOT");
		System.out.println("-----------------------------------");

		for (int i = 0; i < f.length; i++) {
			f[i].calcTot();
			f[i].display();
		}
		System.out.println("-----------------------------------");
			
		Fruit.output();
		
	}
}

//[문제] 1사분기의 과일별 합계와 월별 합계를 구하시오
//클래스 : Fruit 
//필드  : pum, jan, feb, mar, tot
//       sumJan, sumFeb, sumMar
//       
//메소드 : 생성자
//       calcTot()
//       display()
//       output() - 월별 출력 
//
//[실행결과]
//---------------------------------
//PUM      JAN   FEB   MAR      TOT
//---------------------------------
//사과    100    80    75        255
//포도     30    25    10        xxx
//딸기     25    30    90        xxx
//---------------------------------
//        xxx   xxx   xxx
