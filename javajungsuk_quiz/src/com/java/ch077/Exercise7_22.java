package com.java.ch077;

abstract class Shape{
	Point p;
	
	Shape(){
		this(new Point(0,0));
	}
	Shape(Point p){
		this.p = p;
	}
	
	abstract double calcArea();//도형의 면적 계산 반환
	
	Point getPosition() {
		return p;
	}
	
	void setPosition(Point p) {
		this.p = p;
	}
}

class Point{
	int x;
	int y;
	
	Point(){
		this(0,0);
	}
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public String toString(){
		return "["+x+","+"y"+"]";
	}
}

class Circle extends Shape{
	double r; //반지름
	
	Circle(double r){
		this(new Point(0,0),r);
	}
	
	Circle(Point p, double r){
		super(p);
		this.r = r;
	}
	
	@Override
	double calcArea() {
		return Math.PI*r*r;
	}
	
}

class Rectangle extends Shape{
	double width, height;
	
	Rectangle(double width, double height){
		this(new Point(0,0), width, height);
	}
	
	Rectangle(Point p, double width, double height){
		super(p);
		this.width = width;
		this.height = height;
		
	}
	@Override
	double calcArea() {
		return width*height;
	}
	
	boolean isSquare() {
		
		//유효성검사**
		return width == height && width*height!=0;
	}
	
}

public class Exercise7_22 {
	
	
	
	public static void main(String[] args) {
		
		Shape [] arr = {new Circle(5.0), new Rectangle(3,4), new Circle(1)};
		System.out.println("면적의 합:"+sumArea(arr));
	}

	private static double sumArea(Shape[] arr) {
		double sum=0;;	
		for(int i=0; i<arr.length; i++) {
				sum += arr[i].calcArea();
			}
		return sum;
	}
}
