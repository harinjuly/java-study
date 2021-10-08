package com.kh.inherit.exam02_2;

import com.kh.inherit.exam02.Child;

public class Run {
	public static void main (String[] args) {
		
		System.out.println();
		Child ch = new Child();
		
		ch.c_method01();
		
		
		//자식 객체를 이용해 부모 객체 접근
		
		// ch.p_var1 = "hello"; //private 접근 제한자 오류 발생
		//ch.p_var2 = "Hello"; // protected 접근 제한자 = 정상 접근 가능.
		//System.out.println(ch.p_var2);
		ch.p_method01();
		//ch.p_method02(); //protected
		
	}
}
