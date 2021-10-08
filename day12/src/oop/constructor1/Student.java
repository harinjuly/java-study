package oop.constructor1;

public class Student {

	private String name;
	private int score;
	
	public 	Student(String name, int score) {
		this.name=name;
		this.score= score;
	}
	public Student(String name) {
		this.name=name;
	}
	// 생성자 오버로딩. =여러개 선택지
	
	
	public void output() {
		System.out.println(this.name);
		System.out.println(this.score);
	}
}
