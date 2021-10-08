package com.kh.inherit.exam04;

public class Run {

	///super. super()
	
	public static void main(String[] args) {
		System.out.println("부모 객체 참조변수 super. 사용");
		
		Child ch = new Child();
		ch.c_method01();
				
		
		
		System.out.println();
		//자식->부모->자식 순으로 실행됨.
		Child ch2 = new Child();
		System.out.println(ch2);
		
	
		//상속과 생성자2
		//매개 변수가 있는 생성자 사용
		Child ch3 = new Child("Hello");
		System.out.println(ch3);
		Child ch4= new Child("Hello","졸리다","으어어");
		System.out.println(ch4);
		
	}
}
