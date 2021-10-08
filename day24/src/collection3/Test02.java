package collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Test02 {

	public static void main(String[] args) {
		// HashMap
		
		HashMap<String, String> map = new HashMap<>();

		//map에 데이터 추가 : .put(키, 값)
		map.put("홍길동", "010-1111-1111");
		map.put("김길동", "010-2222-2222");
		map.put("이길동", "010-3333-3333");
		map.put("박길동", "010-4444-4444");
		System.out.println(map);
		
		//중복된 키의 데이터 추가 = 키 사용 불가, 해당키의 값이 변경됨.
		map.put("이길동", "010-5555-5555");
		System.out.println(map);
		
		
		//중복된 값 데이터 추가
		map.put("최길동", "010-4444-4444");
		System.out.println(map);
		
		//Map에 있는 데이터 사용 (키를 이용해서 데이터사용) : .get(키)
		System.out.println(map.get("김길동"));
		
		// 향상된 for문
		for(Map.Entry<String, String> e : map.entrySet()) {
			System.out.println(e.getKey() + "   :   " +e.getValue());
		}
		
		
		// 전체 key를 Set 형태로 반환 : .keySet()
		System.out.println(map.keySet());
		
		// 전체 값을 Collection 형태로 반환 : .values()
		System.out.println("values() 결과");
		System.out.println(map.values());
		
		
		//map 데이터 삭제 : .remove(key)
		map.remove("최길동");
		System.out.println(map);
		
		//map 전체 데이터 초기화 : .clear()
		
		map.clear();
		System.out.println(map);
		
		
		
		
	}
}
