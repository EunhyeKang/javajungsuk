package zoo;

public class Safari extends Zoo{
	public static void main(String[] args) {
		
		Zoo z = new Zoo();
		
		z.tiger();
//		z.giraffe();--error  �� ? ? 
//		z.elephant();
//		z.lion();
		

		
//		Test�� TestMain �����ϱ�. 
		
		
		Safari s = new Safari();
		s.tiger();
		s.giraffe();
		
		Zoo zz = new Safari();
		zz.tiger();
		zz.giraffe();
		
	}
}
