package api1.string1;

public class Test01 {

	public static void main(String[] args) {

		String str = "Hello!";
		System.out.println(str);
		System.out.println(System.identityHashCode(str)); //str 객체의 주소 출력
		
		str = "안녕하세요!";
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		
		str = str +" 반갑습니다.";
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		
	}

}
