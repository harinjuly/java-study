package api1.string2;

public class Test01 {

	public static void main(String[] args) {
		// StringBuffer 클래스 객체 생성
		
		// 참조변수 생성 및 객체 생성
		StringBuffer sb1 = new StringBuffer();    // 16가지 문자 저장공간이 만들어짐
		System.out.println(sb1);       // 아무것도 출력 안됨. - sb1안에 있는 문자열 출력
		System.out.println(sb1.capacity()); // 크기를 알아볼 수 있음 -> sb1객체 버퍼의 크기 (기본 16)

		// 객체 생성 시 정수형태로 버퍼 크기 지정
		StringBuffer sb2 = new StringBuffer(10);
		System.out.println(sb2.capacity()); //10개 저장됨
		
		// 객체 생성 시 저장할 문자열 바로 입력
		StringBuffer sb3 = new StringBuffer("안녕하세요");
		System.out.println(sb3);
		System.out.println(sb3.capacity()); // 21- sb3객체 버퍼의 크기 출력(16+안녕하세요 저장공간이 만들어짐)
		
		
		
	}

}
