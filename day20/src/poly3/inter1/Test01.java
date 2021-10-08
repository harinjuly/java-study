package poly3.inter1;

public class Test01 {

	public static void main(String[] args) {
		//인터페이스는 객체 생성 불가능
		//Bluetooth bt = new Bluetooth(); // 오류발생
		
		//인터페이스 내 상수값 사용
		// 정적상수 사용 - 클래스명(인터페이스명).상수명;
		System.out.println(Bluetooth.FREQUENCY);
						
		//정적 메소드
		//인터페이스명.메소드명();
		Bluetooth.pairing();
		
		
		
	}

}
