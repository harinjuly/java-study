package api1.string2;

public class Test03 {
	public static void main(String[] args) {
		//StringBuilder클래스사용
		
		StringBuilder sb1 = new StringBuilder();
		System.out.println(sb1);
		System.out.println(sb1.capacity()); // 크기 출력
		
		
		
		
		//객체 생성시 정수형태로 버퍼 크기 지정
		StringBuilder sb2 = new StringBuilder(10);
		System.out.println(sb2);
		System.out.println(sb2.capacity());
		
		
		//객체 생성 시 문자열 바로 입력
		StringBuilder sb3 = new StringBuilder("안녕하세요");
		System.out.println(sb3);
		System.out.println(sb3.capacity()); // 21
		
		sb3.append(" 반갑습니다.");
		System.out.println(sb3);
		
		sb3.insert(0, "여러분 ");
		System.out.println(sb3);
		
		sb3.delete(4, 10);
		System.out.println(sb3);
		
	}
}
