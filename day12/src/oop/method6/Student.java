package oop.method6;

public class Student {
	
	
	private String name;
	private int score;
	
	
	void setName(String name) {
		this.name =name;
	}
	
	void setScore (int score) {
		this.score = score;
		
	}
	
	//getter 메소드 준비
	//return (메소드 중지 및 반환)
	String getName() {
		return this.name;
	}
	
	int getScore() {
		return this.score;
	}
	
}
