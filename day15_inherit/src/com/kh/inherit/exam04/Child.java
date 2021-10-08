package com.kh.inherit.exam04;
//자식 클래스
								//클래스를 상속받음.
public class Child extends Parents {

	//필드부
	private String c_var1;
		
	//생성자부
	public Child() {
		System.out.println("자식 객체 생성1");
	}
	
	
	//매개변수 있는 생성자
	public Child(String c_var1) {
		this.c_var1 = c_var1;
		System.out.println("자식 객체 생성2");
	}
	
	//매개변수 있는 생성자 2 - 부모클래스 멤버필드도 초기화하는 생성자
	public Child(String c_var1, String p_var1, String p_var2) {
//		this.c_var1 = c_var1;
//		setP_var1(p_var1);
//		setP_var2(p_var2);
		super(p_var1, p_var2); //super() 메소드는 항상 생성자 코드의 위에 위치
		this.c_var1 = c_var1;
		System.out.println("자식 객체 생성3");
		
	}
	
	//메소드부
	public void c_method01() {
		System.out.println("자식 메소드1");
		System.out.println("p_method02 호출: ");
		super.p_method02();
	}
	
	@Override
	public void p_method02() {
		System.out.println("자식 클래스에서 재정의됨");
	}

	//객체
	@Override
	public String toString() {
		return "Child [c_var1=" + c_var1 + "]  " + super.toString();
	}
}