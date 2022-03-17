
public class ArrayEx5 {
	//for문 이용 배열저장된값 모두 더한결과를 배열의 개수로 나누어서 평균 구하기
	
	public static void main(String[] args) {
		
		int sum=0;
		float average = 0f;
		
		int [] score = {100,88,100,100,90};
		
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		
		average = sum / (float)score.length;
		System.out.println("총점 "+sum+"입니다");
		System.out.println("평균은 "+average+"입니다");
	}
}
