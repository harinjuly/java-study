package poly3.inter1;

public class Test03 {

	public static void main(String[] args) {
		
		//인터페이스를 참조변수로는 사용 가능
		// - 구현 객체의 주소를 담을 수 있음(다형성)
		Bluetooth bt = new Galaxy20();
		
		
		bt.on();
		bt.search();
		Bluetooth.pairing();
		bt.connect();
		bt.of();
		
		//인터페이스에 구현되어 있지 않은 멤버는 접근 불가
		
		((Galaxy20)bt).samsungPay();
		
		
	}

}
