package collection3;

import java.util.HashSet;
import java.util.Iterator;

public class Test01 {

	public static void main(String[] args) {
		//HashSet
		
		HashSet<Integer> set = new HashSet<>();
		
		//set에 데이터 추가
		set.add(10);
		set.add(20);
		set.add(5);
		set.add(15);
		//중복요소 저장 안됨
		set.add(10);
		System.out.println(set);
		//순서가 없어서 삽입도 없다
		
		//set의 데이터 확인
		// set은 list와 달리 .get() 사용 불가능 -> 인덱스가 없어서.
		//방법1. 확장 반복문 사용
		//방법2. Iterator를 이용해서.
		
		//방법1. 확장(향상된 for문)
		for(Integer num : set) {
			System.out.println("향상된 for문 출력: " + num);
		}
		
		//방법2. Iterator
		//전체 객체를 대상으로 한번씩 반복해서 가져오는 반복자
		// .hasNext() : 앞에서부터 객체가 있는지 검사 - 있으면 true, 없으면 false
		// .next() : 앞에서부터 하나식 객체 가져오기
		Iterator<Integer> it = set.iterator();     
		while(it.hasNext()) {
			System.out.println("Iterator 출력 : " + it.next());
		}
		
		//	Set 데이터 삭제
		set.remove(5);
		System.out.println(set);
		
		
		//	Set 데이터 초기화
		set.clear();
		System.out.println(set);
		
	}

}
