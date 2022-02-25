package com.simple.collection;

import java.util.HashMap;
import java.util.Map;

public class CollectionEx02 {

	public static void main(String[] args) {
		
		// ArrayList 동적 배열: 크기가 유동적	
				
		HashMap<String, String> list =  new HashMap<String, String>();
		list.put("2","Two"); // add=apend, insert
		list.put("1","One");
		System.out.println(list);
		list.put("4","Four");
		list.put("5","Five");
		list.put("3","Three");
		System.out.println(list);
		list.put("666","Six");
		list.put("66","Sixs");
		System.out.println(list);
		System.out.println(list.size());
		
		System.out.println(list.get("66"));
		
		for(Map.Entry m : list.entrySet()) {
			System.out.println(m.getKey() +"==>"+ m.getValue());
		}
		System.out.println("----------------------");			
	}

}
