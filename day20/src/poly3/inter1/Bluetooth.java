package poly3.inter1;

// 블루투스 인터페이스
public interface Bluetooth {
	
	//상수형 필드
	// - 인터페이스에서 정해놓은 값을 고정으로 사용하도록 강제
	//묵시적으로 public static final 로 선언됨.
	String FREQUENCY = "2.402~2.480GHz"; //주파수// 상수는 대문자로
		
	//추상 메소드
	// - 몸체가 없는 메소드(미완성 메소드)
	//구현할 때 반드시 재정의(오버라이딩)
	/*public abstract*/ void on();
	void of();
	void search();
	
	
	//정적 메소드
	//인터페이스에서 제공해주는 고정된 기능 구현할 때 사용
	//객체가 없어도 인터페이스만으로 호출가능
	static void pairing() {
		System.out.println("페어링 중입니다.");
	}
		
	//디폴트 메소드
	//오버라이딩 가능
	default void connect() {     //연결
		System.out.println("블루투스 연결 성공");
	}
	
	
}
