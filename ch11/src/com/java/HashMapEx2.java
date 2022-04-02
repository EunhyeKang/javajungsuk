package com.java;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx2 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("김자바",new Integer(90));
		map.put("김자바",new Integer(100));
		map.put("이자바",new Integer(100));
		map.put("강자바",new Integer(80));
		map.put("안자바",new Integer(90));
		
		Set set = map.entrySet();
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println(""+e.getKey() + e.getValue());
			
		}
		set = map.keySet();
		System.out.println(set);
		
		
		Collection values = map.values();
//		System.out.println(values);
		it = values.iterator();
		
		int total = 0;
		
		while(it.hasNext()) {
			
//			Integer i = (Integer)it.next();
//			total += i.intValue();
			
			int i = (int)it.next();
			total += i;
			
		}
		
		System.out.println("total : " +total);
		System.out.println("avg : " + (float)total/set.size());
		System.out.println("max score : " + Collections.max(values));
		System.out.println("min score : " + Collections.min(values));
		
	}
}
