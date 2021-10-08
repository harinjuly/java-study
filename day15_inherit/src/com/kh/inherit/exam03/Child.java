package com.kh.inherit.exam03;
//자식 클래스
								//클래스를 상속받음.
public class Child extends Parents {

	//필드부
	private String c_var1;
		
	//생성자부
	public Child() {
		System.out.println("자식 객체 생성");
	}
	
	//메소드부
	public void c_method01() {
		System.out.println("자식 메소드1");
	}
	
	@Override
	public void p_method02() {
		System.out.println("자식 클래스에서 재정의됨");
	}

	//객체
	@Override
	public String toString() {
		return "Child [c_var1=" + c_var1 + "]";
	}
}