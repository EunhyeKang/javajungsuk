package inheritance;

import java.util.Scanner;

public class SuperTest {
	protected double weight, height;
	
	
	public SuperTest(){
//		this(0,0);
		System.out.println("SuperTest 기본생성자 - 부모");
	}
	
	public SuperTest(double weight, double height){
		System.out.println("SuperTest 생성자 - 부모");
		this.weight = weight;
		this.height = height;
	}
	
	public void disp() {
		System.out.println("몸무게 = " + weight);
		System.out.println("키 = " + height);
	}
	
	
}
