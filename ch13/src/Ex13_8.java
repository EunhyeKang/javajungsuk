
public class Ex13_8 {
	public static void main(String[] args) {
		Thread_1 th1 = new Thread_1();
		Thread_2 th2 = new Thread_2();
		
		th1.start();
		th2.start();
		delay(2*1000);
		System.out.println("main종료");
		
	}
	
	static void delay(long millis) {
		try {
			Thread.sleep(millis);
		}catch(InterruptedException e) {}
	}
}

class Thread_1 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) System.out.print("-");
		System.out.println("th1 종료");
	}
}

class Thread_2 extends Thread{
	public void run() {
		for(int i=0; i<300; i++) System.out.print("|");
		System.out.println("th2 종료");
	}
}
