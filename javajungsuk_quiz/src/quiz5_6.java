
public class quiz5_6 {
	public static void main(String[] args) {
		//큰 금액의 동전을 우선적으로 거슬러줘야한다.
		int [] coinUnit = {500,100,50,10};
		int money = 2680;
		System.out.println("money="+money);
		
		for(int i=0; i<coinUnit.length; i++) {
			System.out.printf("%d원 : %d%n",coinUnit[i],money/coinUnit[i]);
			money = money%coinUnit[i];
		}
	}
}
