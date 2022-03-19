import java.util.Scanner;

public class FlowEx25 {
	public static void main(String[] args) {
		System.out.print("숫자를 입력하세요 >> ");
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		int num= Integer.parseInt(input);
		int sum=0;
		
		/*
		for(int i=0; i<input.length();i++) {
			//input.charAt(i);
			System.out.println(input.charAt(i));
			sum += (int)(input.charAt(i)); //문자는 숫자로안됨 
		}*/
		while(num!=0) {
			
			sum += num%10;
			num /=10;
		}
		
		
		System.out.println("각 자리수의 합: "+sum);
	}
}
