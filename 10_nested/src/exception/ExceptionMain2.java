package exception;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionMain2 {
	private int dan;
	
	
	
	public static void main(String[] args) throws IOException {
		
		ExceptionMain2 ex = new ExceptionMain2();
		ex.input();  //호출부    //메소드는 구현부와 호출부가 있다. throws는 구현부와 호출부에 모두 걸어줘야 한다.  
		ex.output();  
		
	}
	
	
	
	
	
	public void input() throws IOException {// NumberFormatException, IOException  //구현부
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("원하는 단을 입력 : ");
		dan = Integer.parseInt(br.readLine());	
		
//		try {
////			dan = br.read();
//			dan = Integer.parseInt(br.readLine());
//		
//		
//		}catch(ArithmeticException e) {
//			System.out.println("잘못 입력하셨습니다. 숫자를 다시 입력하세요");
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		
	}
	
	
	
	
	
	
	
	public void output() {  
		int i=0;
		if(2<=i && i<=9) {
		
			for(i=1; i<=9; i++) {
				System.out.printf("%d * %d = %d%n", dan, i , dan*i);
			}
		}else {
			//System.out.println("범위 초과");
			
			try{
				//개발자가 강제로 Exception 발생
				throw new Exception("범위 초과");           //throw는 익셉션 발생을 터뜨리는애    
			}catch(Exception e) {							//throws는    JVM한테 ~~ 
				e.printStackTrace();
			}
			
		}
	}
}
