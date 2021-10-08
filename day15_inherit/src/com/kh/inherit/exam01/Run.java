package com.kh.inherit.exam01;

public class Run {

	//상속
	
	
	public static void main(String[] args) {
		System.out.println("부모 클래스로 객체 생성 및 사용");
		Parents pa = new Parents();
		pa.p_method01();
		pa.p_method02();
		//모든 클래스는 Objext 클래스 멤버 사용 가능
		System.out.println(pa.toString());
		
		
		System.out.println();
		Child ch = new Child();
		
}
	
}
