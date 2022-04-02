package com.java;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bingo {
	public static void main(String[] args) {
//		Set set = new HashSet();
		Set set = new LinkedHashSet();
		int [][] board = new int [5][5];
		
		for(int i=0; set.size() < 25; i++) {
//			set.add((int)(Math.random()*45)+1+"");
			set.add((int)(Math.random()*45)+1);
			
		}
		
		Iterator it = set.iterator();
		
		for(int i=0; i<board.length; i++) {
			for(int j=0; j<board[i].length; j++) {
//				board[i][j] = Integer.parseInt((String)it.next());
				board[i][j] = (int)it.next(); //Object형태로 가져오기 때문에 형변환 필요.
				System.out.print((board[i][j]<10 ? "  ":" ") + board[i][j]);
			
			}
			System.out.println();
		}
		
		
		
	}
}
