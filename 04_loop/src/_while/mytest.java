package _while;

public class mytest {
	public static void main(String[] args) {
		
		int i=0;
		
		while(true) {
			System.out.println(i++);
			if(i==10) {i=0; break; }	
		
		
		}
		
		System.out.println("while 밖");
	}
}
