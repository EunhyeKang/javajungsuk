package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PersonSort {
	public static void main(String[] args) {
		
		String [] ar = {"orange","apple","banana","pear","peach","appleemango"};
		
		System.out.println("정렬 전 = ");
		for(String str : ar) {
			System.out.print(str + " ");
		}
		System.out.println();
		
		
		Arrays.sort(ar); //static으로 선언되어있기 때문에 클래스명으로 바로 접근.   
		
		
		System.out.print("정렬 후 = ");
		for(String str : ar) {
			System.out.print(str + " ");
		}
		System.out.println();
		
		System.out.println("객체 소트");
		PersonDTO aa = new PersonDTO("홍길동", 25);
		PersonDTO bb = new PersonDTO("네오", 30);
		PersonDTO cc = new PersonDTO("프로도", 28);
		
		List<PersonDTO> list = new ArrayList();
		list.add(aa);
		list.add(bb);
		list.add(cc);
		System.out.println();
		System.out.print("정렬 전 = " + list );
		
		System.out.println();
		
		Collections.sort(list);  //배열 솔트할땐 Arrays.sort  컬렉션 솔트할땐 Collections.sort()
		
		System.out.println("정렬 후 = " + list );
		
	}
}

//aa --> "홍길동",25
//bb --> "네오", 30
//cc --> "프로도",28

