package variable;

public class VariableTest2 {
	//�ʵ�
	int a;
	static int b;
	
	public static void main(String[] args) {
		int a = 10; //��������
		System.out.println("�������� = " + a);
	
		
		VariableTest2 vt = new VariableTest2();
	
		System.out.println("�������� b = " + b);
		System.out.println("�������� b = " + vt.b);
		System.out.println("�������� b = " + VariableTest2.b);
		System.out.println("�������� a = " + vt.a);
	
	
	
	}
	
	
}
