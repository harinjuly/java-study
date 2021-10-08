package api1.string1;

public class Test02 {

	public static void main(String[] args) {
		//string 객체 생성 방법 2가지
		//1. 문자열 리터럴 사용 : String pool 영역에 객체 생성됨. 
		String str1= "Hello";
		String str2= "Hello";
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
		//2. new 연산자 사용
		String str3 = new String("Hello");
		String str4 = new String("Hello");
		System.out.println(System.identityHashCode(str3));
		System.out.println(System.identityHashCode(str4));
		//Heap 영역에 각각 별도의 객체가 생성됨.
		
	}

}
