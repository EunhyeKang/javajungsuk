
public class OperatorEx15 {
	public static void main(String[] args) {
		char lowerCase = 'a';
		char upperCase = (char)(lowerCase - 32);
		System.out.println(upperCase);
		System.out.println();
		
		
		
		for(int i=0; i<26; i++) {
			System.out.println((char)(lowerCase - 32));
			lowerCase ++;
		}
	}
}
