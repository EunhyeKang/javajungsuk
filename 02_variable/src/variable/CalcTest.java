package variable;

import java.text.DecimalFormat;

public class CalcTest {
	public static void main(String[] args) {
		int x = 320;
		int y = 258;
		int sum = x+y;
		int sub = x-y;
		int mul = x*y;
		double div = (double)x/y;
		
		DecimalFormat df = new DecimalFormat();
		
		
		System.out.println(x+" + "+y+" = " + sum);
		System.out.println(x+" - "+y+" = " + sub);
		System.out.println(x+" * "+y+" = " + df.format(mul));
		System.out.println(x+" / "+y+" = " + div);
		System.out.printf(x+" / "+y+" = %.2f", div);
	
	}
			
	
	
//	[����] 320,258�� ��(sum) ��(sub) ��(mul) ��(div)�� ���Ͻÿ�
}
