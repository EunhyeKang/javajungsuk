package array_1;

import java.util.Arrays;
import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {
		
		System.out.print("돈 입력 : ");
		int input = new Scanner(System.in).nextInt();
		
		//금액만큼 로또번호 생성
		for(int k=0; k<(input/1000); k++) {
			
			
			//로또생성
			int [] lotto = new int[6];
			for(int i=0; i<lotto.length; i++) {
				lotto[i] = (int)(Math.random()*45)+1; // 1~45사이의 난수 발생
				//중복체크
				for(int j=0; j<i; j++) {
						if(lotto[i]==lotto[j]) { i--; break;}
				}//for j
			}//for i
			
			// 정렬 - 오름차순  //static메서드이기때문에 바로호출해서 사용 가능
			Arrays.sort(lotto);
			
			//출력
			for(int data : lotto)
				System.out.print(String.format("%5d", data));
			System.out.println();
			
		
			
			if(k%5==4)System.out.println();
		}
			
		
	}
}
