import java.util.Scanner;

public class MultiArrEx4 {
	public static void main(String[] args) {
		String[][]	word = {
				{"chair","의자"},
				{"apple","사과"},
				{"integer","정수"},
		};
		
		Scanner scanner = new Scanner(System.in);
		
		
		for(int i=0; i<word.length; i++) {
			
			System.out.printf("Q%d. %s의 뜻은? ",i+1,word[i][0]);
			String answer = scanner.nextLine();
			
			if(answer.equals(word[i][1])) {//if( word[i][j].toString() == answer)
				System.out.println("good job!! \n\n");
			}else {
				System.out.printf("wrong, the answer is %s.%n%n",word[i][1]);
			}

			}
			
	}
}
