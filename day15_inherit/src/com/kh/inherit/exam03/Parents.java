package com.kh.inherit.exam03;
//부모클래스
public class Parents {
	
	//필드부
	private String p_var1;
	private String p_var2;
	
	//생성자부
	public Parents() {
		System.out.println("부모 객체 생성");
	}
	
	//메소드부
	public void p_method01() {
		System.out.println("부모 메소드1");
	}
	
	public void p_method02() {
		System.out.println("부모 메소드2");
	}

	@Override
	public String toString() {
		return "Parents [p_var1=" + p_var1 + ", p_var2=" + p_var2 + "]";
	}
	
	
	
}
