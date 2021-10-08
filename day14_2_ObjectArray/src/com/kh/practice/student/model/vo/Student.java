package com.kh.practice.student.model.vo;

public class Student {
	//필드부
	private String name;
	private String subject;
	private int score;
	
	//생성자부
	
	public Student() {
		
	} //디폴트 생성자
	
	public Student(String name, String subject, int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;
		
	} //매개변수가 있는 생성자
	
	
	//메소드부
	
	//setter() 메소드 
	public void setName(String name) {
		this.name = name;
				}
	
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	public void setScore(int score) {
		this.score= score;
	}
	
	//getter()
	
	public String getName() {
		return name;
	}
	
	public String getSubject() {
		return subject;
	}
	
	public int getScore() {
		return score;
	} 
	
	public String inform() {
		return "이름: " + name +"/ 과목: " +subject +"/ 점수: " +score;
	}
	
	
	
	
}
