import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

public class quiz3_4 {
	
//	사과를 담는데 필요한 바구니의 수를 구하는코드.
//	만약 사과의 수가 123개고 바구니에 10개 사과 담을 수 있다면 13개의 바구니가 필요 
	public static void main(String[] args) {
		
		int numOfApples = 123; //사과의 개
		int sizeOfBucket = 10;//바구니의크기(바구니에 담을 수 있는 사과의 개수) 
		
//													quiz
		//sizeOfBucket으로 나눈 나머지가 0이면 0, 있으면 1 ;
		int numOfBucket = numOfApples/sizeOfBucket + (numOfApples%sizeOfBucket>0 ? 1 : 0 );
				
		System.out.println("필요한 바구니의 수 : "+ numOfBucket);
		
	}
}
