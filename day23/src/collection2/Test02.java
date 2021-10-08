package collection2;

import java.util.LinkedList;

public class Test02 {

	public static void main(String[] args) {
		
		
		LinkedList <Student> list = new LinkedList<>();

		list.add(new Student("홍길동",20));
		list.add(new Student("김길동",30));
		list.add(new Student("이길동",25));
		
		System.out.println(list);
		
		//리스트 내 데이터로 찾아서 삭제
		// - 이름이 홍길동인 객체 삭제 : 동일한 이름의 객체가 있는 인덱스를 찾은 후 삭제
		for(int i =0; i<list.size(); i++) {
			if(list.get(i).getName().equals("홍길동")) {		//getName()에 들어간게 홍길동이면 삭제해라
				list.remove(i);
				break;
			}
		}
			System.out.println(list);
		
		//리스트 내 특정 객체 삭제 
		//객체 내부 데이터는 동일하지만 new로 생성되어서 전혀 다른 객체로 인식
			//equals를 override
		Student s = new Student("김길동",30);
		// list.remove(s); - 삭제되지않는다.(오버라이딩 전에)
		list.remove(s); //클래스에서 오버라이딩 하고나서는 삭제됨.
		System.out.println(list);
		
		
		
		
	}

}
