package constructor;


class Compute{
	//필드
	private int x;
	private int y;
	private int sum, sub, mul;
	private double div;
	
	//생성자
	Compute(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public void calc() {
		this.sum = this.x + this.y;
		sub = x - y;
		mul = x * y;
		div = (double)x / y;
	}
	
	int getX() {
		return x;
	}
	int getY() {
		return y;
	}
	int getSum() {
		return sum;
	}
	int getSub() {
		return sub;
	}
	int getMul() {
		return mul;
	}
	String getDiv() {
		return String.format("%.3f", div);
	}
//	void calcSum(int x, int y){
//		 sum = x+y;
//	}
//	void calcMinus(int x, int y) {
//		
//		sub = Math.abs(x-y);
//	}
//	void calcMultiply(int x, int y) {
//		   mul = x*y;
//	}
//	void calcDivide(int x, int y) {
//		 div = x/y;
//	}
	
}

public class ComputeMain {
	
	public static void main(String[] args) {
//		Compute c1 = new Compute(320,258);
//		Compute c2 = new Compute(125,110);
//		Compute c3 = new Compute(578,312);
		
//		Compute [] c = new Compute[3];
//			c[0] = new Compute(320,258);
//			c[1] = new Compute(125,110);
//			c[2] = new Compute(578,312);
		
		Compute[] c = {new Compute(320,258),new Compute(125,110),new Compute(578,312)};
			
		for(Compute ar : c) {
			ar.calc();
			
			System.out.println(ar.getX()+"\t"+ar.getY() + "\t"+ ar.getSum()  +"\t"+ ar.getSub() +"\t"+ ar.getMul() +"\t"+ ar.getDiv());	
		}

		
		
	}
}

//

//[문제] x, y의 합, 차, 곱, 몫을 구하시오
//
//[실행결과]
//   x      y      sum      sub      mul      div
//   320     258
//   125     110
//   578     312   