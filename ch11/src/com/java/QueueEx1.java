package com.java;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;
import java.util.Scanner;

public class QueueEx1 {
	static Queue q = new LinkedList(); //Queue는 인터페이스. 큐를 구현한 클래스중 하나가 LinkedList.
	static final int MAX_SIZE = 5;
	
	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		while(true) {
			System.out.println(">>");
			
			try {
				//화면으로부터 라인단위로 입력받는다.
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				
				if("".equals(input)) continue; //빈문자열이면 다시 반복
				
				if(input.equalsIgnoreCase("q")){//q입력시 종료 대소문자 구분안함
					System.exit(0);
				}else if(input.equalsIgnoreCase("help")) {
					System.out.println("help - 도움말을 보여줍니다.");
					System.out.println("q 또는 Q - 프로그램을 종료합니다.");
					System.out.println("history - 최근에 입력한 명령어를 "+MAX_SIZE+"개 보여줍니다.");
					
				}else if(input.equalsIgnoreCase("history")) {
					int i=0;
					//입력받은 명령어를 저장하고,
					save(input);
					
					//LinkedList의 내용을 보여준다.
					LinkedList tmp = (LinkedList)q;
					ListIterator it = tmp.listIterator();
					
					while(it.hasNext()) //읽어올 요소가 남아있는지 확인한다. 있으면 true, 없으면 false를 반환한다.
						System.out.println(++i+"."+it.next());
				}else {
					save(input);
					System.out.println(input);
				}// if (input.equalsIgnoreCase("q")){
			}catch(Exception e) {
				System.out.println("입력 오류입니다.");
				
			}
			
		}//while(true)
		
	}//main()
	
	
	public static void save(String input) {
		//queue에 저장한다.
		if(!"".equals(input)) //공백이 아니면 큐에 저장한다.
			q.offer(input);
		
		//queue의 최대 크기를 넘으면 제일 처음 입력된 것을 삭제한다.
		if(q.size()>MAX_SIZE)
			q.remove();
	}
}
