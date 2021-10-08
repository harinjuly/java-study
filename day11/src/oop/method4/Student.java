package oop.method4;

public class Student {
	String name;
	int age;
	
	
	void setup(String name, int age) {
		this.name = name;
		this.age= age;
		
	}
	
	void output() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	
	// 메소드의 다양성을 추구한다
	//setter 메소드 = 필터링 가능.
	// set+변수명 작명.
	
	void setName(String name) {
		this.name = name;
	}
	
	void setAge(int age) {
		if(age>0) {
		this.age=age;
	}
		}
	
}
