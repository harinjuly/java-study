package com.kh.inherit.exam03;

public class Run {

	//상속
	
	
	public static void main(String[] args) {
		System.out.println("부모 클래스로 객체 생성 및 사용");
		Parents pa = new Parents();
		pa.p_method01();
		pa.p_method02();
	
		
		System.out.println();
		Child ch = new Child();
		ch.c_method01();
		ch.p_method01();
		ch.p_method02();
		
		System.out.println("toString():" + pa.toString());
		System.out.println("toString() 객체 : " + pa);
		System.out.println("toString():" + ch.toString());
		System.out.println("toString() 객체 : " + ch);
		
	
	}
}
