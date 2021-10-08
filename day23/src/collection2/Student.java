package collection2;

public class Student implements Comparable<Student> {
// 학생 클래스
	
	//필드부
		private String name;// 학생 이름
		private int age;// 학생 나이
	
	//생성자부
		
		public Student() {}
		public Student(String name, int age) {
			this.name=name;
			this.age=age;
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
				
		@Override
			public boolean equals(Object obj) {
			//기존 object객체의 equals를 오버라이딩하려면 매개변수 타입까지 동일해야함.
			
			//객체 주소가 같으면 true 반환
			if(this == obj) {
					return true;
			}
			//비교할 객체가 null이면 false 반환
			if(obj == null) {
					return false;
			}
			
			//비교할 객체의 클래스 이름이 다르면 false 반환
			if(getClass() != obj.getClass()) {
				return false;
			}
			//현재 객체의 데이터와 비교할 객체의 데이터를 하나씩 모두 비교해서 다르면 false 반환
			//현재 클래스 타입으로 다운케스팅해야한다.
			Student other = (Student)obj; // 다운케스팅만들어서 담아주기
			// name은 문자열(String)객체이기 때문에 null인지 먼저 비교해야함.
			if(this.name == null && other.name !=null) {
				return false;
			}else if(!this.name.equals((other.name))){
				return false;
			}
			if(this.age !=other.age) {
				return false;
			}
			//위 검사 조건들에서 반환되지 않았으면 최종적으로 true 반환
			return true;
			}
			
		
		@Override
		public String toString() {
			return "이름= " + name + "/ 나이= " + age;
		}
		
		
		@Override
		public int compareTo(Student o) {
			// sort에서 compareTo 반환값이 1이면 데이터를 바꾸고, 0이나  -1이면 안바꿈
			
			//이름(문자열) 기준
			return this.name.compareTo(o.name);
			
			//나이 (정수, 실수, 단일문자) 기준
		//	return this.age - o.age;
		
			
			}
			
		
	
}
