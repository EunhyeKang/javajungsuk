
public class quiz4_11 {
	public static void main(String[] args) {
		//Fibonnaci수열의 시작의 첫 두 숫자를 1,1로 한다.
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		
		System.out.print(num1+","+num2);
		
		for(int i=0; i<8; i++) {
			num3 = num1 + num2;
			num2 += i;
			
			
			
			System.out.print(","+num3);
		}
	}
}
