package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		set.add("호랑이");
		set.add("ㄱㅣ린");
		set.add("원숭이");
		set.add("토끼");
		set.add("멍멍이");
		set.add("뭉뭉이");
		
		
		
		Iterator<String> it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}
}
