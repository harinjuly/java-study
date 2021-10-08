package com.kh.inherit.exam02;
//부모클래스
public class Parents {
	
	//필드부
	private String p_var1;
	protected String p_var2; //접근제한자 변경
	
	//생성자부
	public Parents() {
		System.out.println("부모 객체 생성");
	}
	
	//메소드부
	public void p_method01() {
		System.out.println("부모 메소드1");
	}
	
	protected void p_method02() {
		System.out.println("부모 메소드2");
	}
	
}
