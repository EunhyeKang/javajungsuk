package _for;

public class ForTest2 {
	public static void main(String[] args) {
		int sum=0;
		int mul=1;
		for(int i=1; i<=10; i++) {
			sum +=i;
			mul *=i;
			System.out.println(i+"\t"+sum+"\t"+mul);
		}
		
		
	}
}
