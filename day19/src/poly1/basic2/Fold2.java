package poly1.basic2;

public class Fold2 extends Phone {
	
	
	public Fold2() {
	}

	public Fold2(String making, String serial, String telecom, String num, String color) {
		super(making, serial, telecom, num, color);
	}

	@Override
	public void pic() {
		System.out.println("사진 - 1200만 화소");
	}

	public void display() {
		System.out.println("화면 접기");
	}
}
