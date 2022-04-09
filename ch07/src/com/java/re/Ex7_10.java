package com.java.re;

public class Ex7_10 {
	public static void main(String[] args) {
		Unit[] group = {new Marine(), new Tank(), new Dropship()};
	
	
		for(int i=0; i<group.length; i++) {
			group[i].move(100,200);
		}
	}
	
}

abstract class Unit{
	int x,y;
	abstract void move(int x, int y);
	void stop() {}
}

class Marine extends Unit{

	@Override
	void move(int x, int y) {
		// TODO Auto-generated method stub
		System.out.println("Marine="+x+","+y);
	}
	
}

