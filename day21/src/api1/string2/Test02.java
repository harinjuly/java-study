package api1.string2;

public class Test02 {

	public static void main(String[] args) {
		// StringBuffer 클래스 메소드 사용
		
		StringBuffer sb = new StringBuffer("안녕하세요"); //객체 생성 시 문자열 바로 입력
		
		//1. 객체에 데이터 추가 - .append()
		// - 기존 객체 정보
		System.out.println("sb객체 주소 :  " + sb.hashCode());
		System.out.println("sb객체 크기 :  " +sb.capacity());
		System.out.println("sb글자 개수 :  " +sb.length());
		
		
		// - 문자열 추가
		sb.append(" 반갑습니다.");
		System.out.println(sb);     //안녕하세요 반갑습니다.
		System.out.println("sb객체 주소 :  " + sb.hashCode());
		System.out.println("sb객체 크기 :  " +sb.capacity());
		System.out.println("sb글자 개수 :  " +sb.length());
	
		// -문자열 추가 - 버퍼에 남는 공간 크기 초과했을 때. 
		sb.append(" 모두모두 열공하세요~!!");
		System.out.println(sb);
		System.out.println("sb객체 주소 :  " + sb.hashCode());
		System.out.println("sb객체 크기 :  " +sb.capacity());   // 44 - 버퍼크기 자동으로 조정됨.
		System.out.println("sb글자 개수 :  " +sb.length()); // 26
	
		
		// 2. 객체에 값 삽입 - .insert()
		sb.insert(0, "여러분");
		System.out.println(sb);
		
		
		//3. 객체의 데이터 삭제 
		sb.delete(4, 10);
		System.out.println(sb);
		
		
		
		
	}
}
