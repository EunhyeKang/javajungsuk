package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
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
		
		System.out.println("객체 소트 - 기준을 나이로 설정했다.");
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
		System.out.println();
		
		
		
		System.out.println("다른정렬기준으로 정렬 - 이름 ");
		System.out.println();
//		Comparator com = new Comparator(Object o1, Object o2) {
//			
//		};   
		
		
		Comparator<PersonDTO> com = new Comparator<PersonDTO>(){

			@Override
			public int compare(PersonDTO p1, PersonDTO p2) {
				
//				if(p1.getName() < p2.getName()) //문자열비교 불가 에러 
				//오름차순
//				return p1.getName().compareTo(p2.getName());
				
				
				//내림차순
				//
				return p1.getName().compareTo(p2.getName()) * -1;
			}
		} ;
		
		
		System.out.println("정렬 전 = " + list);
		Collections.sort(list,com);
		System.out.println("정렬 후 = " + list);
		
		
		
		
		
		
		//인터페이스 익명이너 알아야한다 
		//인터페이스는 추상만 가지고있다. 
		
		
	}
	
}

//aa --> "홍길동",25
//bb --> "네오", 30
//cc --> "프로도",28

