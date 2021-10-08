package collection2;

import java.util.ArrayList;
import java.util.List;

public class Test01 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		
		//리스트 객체 추가 : .add(객체)
		list.add(new Student("홍길동", 20));
		list.add(new Student("김길동", 30));
		list.add(new Student("춘향이", 23));
		
		//리스트 내 객체의 멤버 사용 : .get(index).멤버
		System.out.println(list.get(0).getName());
		System.out.println(list.get(0).getAge());
		
		for(int i =0; i<list.size(); i++) {
			System.out.println("이름은 " + list.get(i).getName()+"이고, 나이는"+ list.get(i).getAge());
		}
		
		//리스트 객체 삽입 : .add(인덱스,객체)
		
		//리스트 객체 수정: .set
		list.get(1).setAge(28);
		list.set(1, new Student("사또",30));
		System.out.println(list);
		
		
		//리스트 객체 삭제 : .remove(인덱스) 
		list.remove(2);
		System.out.println(list);
		
		//리스트 객체 삭제 : .remove(객체) - 객체의 식별값을 이요해서 비교
		list.remove(new Student("사또",30)); //삭제 안됨
				
		
		//리스트 내 모든 객체 삭제 : .clear()
		list.clear();
		System.out.println(list);
		
	}
}
