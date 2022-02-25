package com.simple.collection;

import java.util.ArrayList;

public class CollectionEx {

	public static void main(String[] args) {
		
		// ArrayList 동적 배열 : 크기가 유동적
		// list를 순서대로 출력해준다.
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("바나나"); // add, apend, insert
		list.add("샤인머스캣");
		list.add("복숭아");
		System.out.println(list);
		list.add("12345");
		System.out.println(list);
		
		// 0,을"" 앞에 붙이면 다 무시하고 맨 앞으로 간다.
		list.add(0,"딸기"); 
		System.out.println(list);
		
		// 리스트의 개수가 숫자로 출력
		System.out.println(list.size());
		
		System.out.println(list.get(2)); //0으로 시작했을때 0, 1, 2 자리의 list 호출
		
		// 수정
		//list.set(index, element) // 인덱스는 항상 순서, 엘리멘츠는 변경할 값
		list.set(2, "포도"); // 2 자리를 포도로 변경
		System.out.println(list);
		
		// 삭제
		//list.remove(index)
		list.remove(2); // 2 자리를 삭제
		System.out.println(list);
		System.out.println(list.size());
		
		// 조회(검색)
		for(String i : list) {
			System.out.println(i + ", ");
			if(i.equals("복숭아")) {
				System.out.println("복숭아 있음");
				break;
			}
		}
		// 추가(생성), 삭제, 조회(검색), 수정
		
		System.out.println(list.contains("바나나"));
		// "@@"가 있으면 true, 없으면 false
		
		
		
		
		
		
	}
	
}
