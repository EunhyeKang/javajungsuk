package chapter02;

public class PrintfEx2 {
	public static void main(String[] args) {
		String url="www.codechobo.com";
		float f1 = .10f;
		float f2 = 1e1f;
		float f3 = 3.14e3f;
		double d = 1.23456789;
		
		System.out.printf("[%.8s]%n", url); // 문자열 출력할 때 왼쪽에서 8글자만 출력
		
		System.out.printf("d=%f%n",d);
		System.out.printf("d=%14.10f%n",d); // 전체 14자리 중 소수점 아래 10자리
		System.out.printf("d=%14.5f%n",d); // 전체 14자리 중 소수점 아래 10자리
		System.out.printf("d=%14.14f%n",d); // 전체 14자리 중 소수점 아래 10자리
		//정수의 빈자리는 공백으로 채우고,  소수점 아래의 빈자리는 0으로 채운다.
		
		
		
	}
}
