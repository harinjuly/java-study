package collection1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Test01 {

	public static void main(String[] args) {
		//collection
		
		//식당 예약 목록
		//List : 순서를 유지하고 저장, 중복 저장 가능
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("최우식");
		list.add("수지");
		list.add("박소담");
		list.add("제니");
		list.add("최우식");
		list.add("공유");
		
		// 데이터 개수 확인
		System.out.println(list.size());
		//전체 데이터출력
		System.out.println(list);
		
		//나라 이름 목록
		//set : 순서를 유지하지 않고 저장, 중복 저장 불가
		
		HashSet<String> set = new HashSet<>();
		
		set.add("한국");
		set.add("영국");
		set.add("미국");
		set.add("한국");
		set.add("러시아");
		set.add("헝가리");
		
		System.out.println(set.size());
		System.out.println(set);
		
		//도서 목록
		//map : key(도서번호)와 value(도서명) 쌍으로 저장, key는 중복 불가
		//key는 set방식 , value는 list방식으로 저장됨
		
		HashMap<Integer,String> map = new HashMap<>();
		//제네릭은 객체타입만 가능 -> 기본 자료형 지정 시 Wrapper클래스를 사용해야 함.

		//데이터 추가
		map.put(1000, "자바의 정석");
		map.put(1001, "오라클 일주일 정복기");
		map.put(3001, "그 사람이 사는 법");
		map.put(2001, "참 쉬운 HTML");
		map.put(1002, "자바의 정석");
		map.put(2001,"참 쉬운 CSS");
		
		System.out.println(map.size());
		System.out.println(map);
		
		
	}

}
