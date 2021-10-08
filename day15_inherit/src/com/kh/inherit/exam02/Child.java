package com.kh.inherit.exam02;
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
		
		// 자식 클래스 내부 -> 부모 클래스 멤버 접근
		
		p_var2 = "Hello";
		System.out.println(p_var2);
		p_method01();
		p_method02(); 
		
	}
	
}
