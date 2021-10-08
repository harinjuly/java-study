package com.kh.inherit.exam05;
//자식 클래스
								//클래스를 상속받음.
public class Child extends Parents {

	//필드부
	private String c_var1; //인스턴스 변수
	private static String c_var2; //클래스 변수
	
	//생성자부
	public Child() {
		System.out.println("자식 객체 생성1");
	}
		
	//메소드부
	public void c_method01() {
		System.out.println("자식 메소드1");
	}
	
	//정적(static) 메소드 : 객체를 생성하지 않고 사용가능한 메소드
	public static void c_method02() {
		System.out.println("자식 메소드2");
	}
		
// 오버라이딩: 부모 클래스에서 final 으로 선언된 경우 오버라이딩 불가능
//	public void p_method02() {
//		System.out.println("자식 메소드에서 재정의");
//	}
	

	//객체
	@Override
	public String toString() {
		return "Child [c_var1=" + c_var1 + "]  " + super.toString();
	}

	
		

	public String getC_var1() {
		return c_var1;
	}


	public void setC_var1(String c_var1) {
		this.c_var1 = c_var1;
	}


	public static String getC_var2() {
		return c_var2;
	}


	public static void setC_var2(String c_var2) {
		Child.c_var2 = c_var2;
	}
		
	
	
	
	
}