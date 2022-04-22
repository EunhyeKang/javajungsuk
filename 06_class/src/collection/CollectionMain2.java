package collection;

import java.util.ArrayList;

public class CollectionMain2 {

	public static void main(String[] args) {
		//배열과 비슷한 Collection이 있다.
		ArrayList <String> list = new ArrayList<String>(); // 중복허용, 순서
		
//		list.add(1);
//		list.add(23.6);
		list.add("3.3");
		list.add("사자");
		list.add("기린");
		list.add("호랑이");
		list.add("코끼리");
		
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("-------------");
		
		for(String s : list) {
			System.out.println(s);
		}
		
		
	
		
	}
}
