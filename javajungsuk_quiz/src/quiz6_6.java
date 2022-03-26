
public class quiz6_6 {
	
	//두점 (x,y)와 (x1,y1)간의 거리를 구한다.
	
	public static void main(String[] args) {
//		System.out.println(getDistance(1, 1, 2, 2));
		
		MyPoint p = new MyPoint(1, 1);
		//p   (2,2) 거리구한다.
		System.out.println(p.getDistance(2,2));
	}
}

class MyPoint{
	int x;
	int y;
	
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
	}
	double getDistance(int x1, int y1) {
		//(1)	
		return Math.sqrt((x-x1)*(x-x1)+(y-y1)*(y-y1));
	}
}
