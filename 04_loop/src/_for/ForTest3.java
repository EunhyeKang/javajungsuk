package _for;

public class ForTest3 {
	public static void main(String[] args) {
		//65~90사이의 난수를 100개 발생하여 출력하시오
		//1줄에 10개씩 출력하시오
		
		int com=(int)(Math.random()*100); // 0~99
		System.out.println(com);
		int count=0;
		
		// a~b 사이의 난수 만들기
		// (int)(Math.ramdon()*(b-a+1)) + a
		
		for(int i=1; i<=100; i++) {
			com = (int)(Math.random()*26)+65; //65~90사이의 난수
			System.out.print((char)com + " ");
			
			if(i%10 == 0) System.out.println();
			if(i=='A') count++;
		}
		System.out.println();
		System.out.println("A의 개수 = "+count);
	}
}
