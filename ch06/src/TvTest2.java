

public class TvTest2 {
	public static void main(String[] args) {
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		System.out.println("t1 channel + "+t1.channel);
		System.out.println("t2 channel + "+t2.channel);
		
		t1.channel = 7;
		System.out.println("t1 channel is changed 7");
		System.out.println("t1 channel is "+t1.channel);
		System.out.println("t2 channel is "+t2.channel);
		
	}
}
