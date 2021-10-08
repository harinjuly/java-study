package file2;

import java.io.Serializable;

//직렬화를 위해서 Serializable 인터페이스 구현하기

public class Student implements Serializable{
	
		//직렬화시 사용되는 객체의 고유 번호 (직렬화 인터페이스 구현시 안쓰면 경고)
		// - 선언안해도 JVM이 임의의 번호를 붙여서 자동으로 생성하나, 직접 선언을 권장
		private static final long serialVersionUID = 1L;
		//필드부
		private String name;
		private int age;
		// 직렬화에서 제외하고 싶은 필드의 경우 transient 키워드를 붙여줌.
		private transient  String tel;
		
	//생성자부
	
		public Student() {}
		public Student(String name, int age, String tel) {
			this.name=name;
			this.age=age;
			this.tel=tel;
		}
		
		//메소드부
		
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getTel() {
			return tel;
		}
		public void setTel(String tel) {
			this.tel = tel;
		}
		
		@Override
		public String toString() {
			return "Student [이름: " + name + ", 나이: " + age + ", 전화번호: " + tel + "]";
		}
		
	

		

}
