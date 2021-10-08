package collection1;

import java.util.ArrayList;

public class Test03 {

	public static void main(String[] args) {
		// List 사용 - 식당 예약 목록 관리 
		
		ArrayList<String> list = new ArrayList<>();

		// 예약이 들어옴
		// -> 리스트에 데이터 추가 .add() ->리스트의 가장 마지막 위치에 추가
		list.add("최우식");
		list.add("배수지");
		list.add("박소담");
		
		//예약된 인원 확인
		System.out.println("현재 예약 인원 수 : " + list.size());
		
		//고객 목록 확인
		System.out.println("고객 목록 : " + list);
		

		//목록 확인 2
		for(String str : list) {
				System.out.println(str);
		}
		
		// 최우식과 배수지 사이에 제니가 예약
		list.add(1,"제니");

		System.out.println(list);
		
		//수지가 예약자명을 공유로 변경.
		// 리스트 내 데이터 수정 : .set(index, 데이터) 메소드
		list.set(2, "공유");
		
		System.out.println(list);
		
		// 예약 확인
		// 리스트 내 특정 데이터의 존재 여부 검사 : .contains(데이터)
		
		System.out.println(list.contains("공유"));		// true
		System.out.println(list.contains("소다"));		// false
						
		// 몇 번째로 예약되어있는지 -> .indexOf();
		System.out.println(list.indexOf("공유"));	//2
		System.out.println(list.indexOf("소다"));	//-1 (데이터가 없음)
				
		// 제니가 예약 취소
		// 리스트 내 특정 데이터 삭제 : .remove(인덱스), .remove(데이터)
		list.remove(1);
		System.out.println(list);
		list.add("최우식");
		
		//최우식이 예약  취소
		list.remove("최우식"); // 중복데이터가 있으면 앞에 있는 데이터 하나만 삭제됨.
		System.out.println(list);
		
		
		//재고 부족으로 모든 예약 취소 해야함
		// 리스트 내에 모든 데이터를 삭제 : .clear()
		list.clear();
		System.out.println(list);
		
		
		
		
	}
}
