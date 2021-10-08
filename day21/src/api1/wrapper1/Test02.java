package api1.wrapper1;

public class Test02 {

	public static void main(String[] args) {
		// 문자열 처리
		
		//1. 문자열 -> 기본자료형 변환
		int num1 = Integer.parseInt("256");
		System.out.println(num1);
		
		
		double num2 = Double.parseDouble("3.5");
		System.out.println(num2);

		
		//단일문자는 charAt() 메소드로 추출
		char ch = "abcd".charAt(0);
		System.out.println(ch);
		
		//2. 기본자료형 -> 문자열 변환
		String str1= Integer.valueOf(123).toString();
		System.out.println(str1);
		
		String str2=Boolean.valueOf(true).toString();
		System.out.println(str2);
		
		String str3=Character.valueOf('j').toString();
		System.out.println(str3);
		
		// String 클래스를 이용한 기본 자료형 -> 문자열 변환
		String str4 = String.valueOf(45.6);
		System.out.println(str4);
		
	}

}
