package com.java.re;

class Shape{
	String color = "black";
	void draw() {
		System.out.printf("shapeclass - %s",color);
	}
}
class Point{
	int x,y;
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	Point(){
		this(0,0);
	}
	String getXY(){
		return "("+x+")"+ "("+y+")";
	}
}

class Circle extends Shape{
	Point center;
	int r;
	
	Circle(Point center,int r){
		this.center=center;
		this.r = r;
	}
	Circle(){
		this(new Point(0,0),100);
	}
	void draw() {
		System.out.printf("circle - (%d,%d),%d,%s ",center.x,center.y,r,color);
	}
	
}
class Triangle extends Shape{
	Point [] p = new Point [3];
	
	Triangle(Point[] p) {
		this.p = p;
		
	}
	void draw() {
		System.out.printf("triangle - %s,%s,%s,%s ",p[0].getXY(),p[1].getXY(),p[2].getXY(),color);
	}
}
public class DrawShape {
	public static void main(String[] args) {
		Point [] p = {new Point(1,1),new Point(2,2),new Point(3,3)};
		Circle c=new Circle(new Point(50,50),20);
		c.draw();
		
		Triangle t = new Triangle(p);
		t.draw();
	}
	
}
