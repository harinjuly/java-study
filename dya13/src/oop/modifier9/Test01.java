package oop.modifier9;

public class Test01 {

	
	//접근제한 = 퍼블릭
	//정적 메소드(고정)
	//반환형 : void
	//이름: main
	//매개변수 : String 배열
	//JVM이 실행할 수 있도록 공개 및 객체와 상관없이 고정, 결과 반환X, 실행시 문자열 여러개를 넣어서 실행 가능한 이름이 main인 메소드
	
	public static void main(String[] args) {
		
		System.out.println(Iphone.getCompany());
	}
}
