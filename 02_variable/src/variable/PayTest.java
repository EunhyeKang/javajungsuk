package variable;

import java.text.DecimalFormat;

public class PayTest {
	public static void main(String[] args) {

		String name = "L";
		int basePay = 2500000;
		int tax = (int)(basePay * 0.033);
		int salary = basePay - tax;

		DecimalFormat df = new DecimalFormat();
		System.out.println("***"+name+"�� ���� ***");
		System.out.println("�⺻�� : "+df.format(basePay)+"��");
		System.out.println("���� : "+df.format(tax)+"��");
		System.out.println("���� : "+df.format(salary)+"��");
		System.out.println();

		System.out.printf("*** %s�� ���� ***%n",name);
		System.out.printf("�⺻�� : %d��%n",basePay);
		System.out.printf("���� : %d��%n", tax);
		System.out.printf("���� : %d��%n", salary);
		
	}
}

//�̸��� L (name)�� ����� �⺻��(basePay)�� 2500000�϶�, 3.3% ����(tax)�� ����(salary)�� ���.

//���� = �⺻�� * 3.3%(0.033)
//���� = �⺻�� - ����

//[������]
//		
//		