package _abstract;

import java.util.Scanner;

abstract class ShapeTest{
	protected double area;
	
	protected Scanner scan = new Scanner(System.in);
	
	public ShapeTest() {
		System.out.println("ShapeTest기본생성자");
	}
	
	public abstract void calcArea();  // 자식클래스에서 구현해라. 자식클래스에서 구현안하면 에러뜸.
	
	public abstract void dispArea();
	
}
class SamTest extends ShapeTest {
	protected int base, height;
	public SamTest() {
		System.out.println("SamTest 기본생성자");
		System.out.println("밑변 : ");
		base = scan.nextInt();
		System.out.println("높이 : ");
		height = scan.nextInt();
		
	}
	@Override
	public void calcArea() {
		area = base * height / 2.0;
	}
	@Override
	public void dispArea() {
		System.out.println("삼각형 넓이 = "+area+ "cm²\n");
	}
}


class SaTest extends ShapeTest {
	protected int width, height;
	public SaTest() {
		System.out.println("SaTest 기본생성자");
		System.out.println("너비 : ");
		width = scan.nextInt();
		System.out.println("높이 : ");
		height = scan.nextInt();
	}
	@Override
	public void calcArea() {
		area = width * height;
	}
	@Override
	public void dispArea() {
		System.out.println("사각형 넓이 = "+area + "cm²\n");
	}
}



class SadariTest extends ShapeTest {
	protected int top, bottom, height;
	public SadariTest() {
		System.out.println("SadariTest 기본생성자");
		System.out.println("윗변 : ");
		top = scan.nextInt();
		System.out.println("밑변 : ");
		bottom = scan.nextInt();
		System.out.println("높이 : ");
		height = scan.nextInt();
	}
	@Override
	public void calcArea() {
		area = (top + bottom)*height/ 2.0;
	}
	@Override
	public void dispArea() {
		System.out.println("사다리꼴 넓이 = "+area+ "cm²\n");
	}
}




public class ShapeMain {
	public static void main(String[] args) {
		
	
		//결합도 낮추기 - 다형성
		
		
		ShapeTest shape;
		shape = new SamTest(); //부모 = 자식
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		
		shape = new SaTest(); // 부모 = 자식
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		
		shape = new SadariTest(); //부모 = 자식
		shape.calcArea();
		shape.dispArea();
		System.out.println();
		
		
	}
}




