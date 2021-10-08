package collection1;

import java.util.ArrayList;
import java.util.List;

public class Test05 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("홍길동");    // 맨 끝에 객체 추가
		list.add(1,"김길동");    // 주어진 인덱스에 객체 추가
		String str = list.get(1);	 // 인덱스로 객체 검색
		System.out.println(list);  //list 내에 객체 표시.
			// = [홍길동,김길동]
		System.out.println(str);
			// = 김길동

		list.remove(0);   //인덱스 내에 객체 삭제.
		list.remove("김길동");    //인덱스 내에 데이터 삭제.
		System.out.println(list);
			// = []   // 출력되지 않음.
	}

}
