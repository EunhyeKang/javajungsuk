package constructor;

import java.util.Scanner;

public class StringBufferMain {
	private static int dan;
	
	public static void main(String[] args) {
//		int dan=0;
		
		GuguDan gugudan = new GuguDan();
		
		dan = gugudan.input();
		
		gugudan.output(dan);
		
		
	}
}


class GuguDan{
	
	
	int input() {
		Scanner scan = new Scanner(System.in);
		int dan=0;
		System.out.print("원하는 단을 입력: ");
		dan = scan.nextInt();
		
		return dan;
	}
	
	
	void output(int dan) {
		StringBuffer buffer = new StringBuffer(); //append(), delete()
		
		for(int i=1; i<=9; i++) {
//			System.out.printf("%d * %d = %d",dan,i,dan*i);
//			System.out.println();
			
			buffer.append(dan);
			buffer.append("*");
			buffer.append(i);
			buffer.append("=");
			buffer.append(dan*i+" ");
			
			System.out.println(buffer);
			
			//buffer의 내용을 지우기
//			buffer.delete(0, buffer.capacity());
			buffer.delete(0, buffer.length());// buffer의 내용 지우기
			
		}//for
	}
	
}