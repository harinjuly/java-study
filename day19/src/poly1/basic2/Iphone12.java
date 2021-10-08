package poly1.basic2;

public class Iphone12 extends Phone {
	
	public Iphone12() {
	}

	public Iphone12(String making, String serial, String telecom, String num, String color) {
		super(making, serial, telecom, num, color);
	}

	@Override
	public void pic() {
		System.out.println("사진 - 라이다센서");
	}

	public void gesture() {
		System.out.println("제스쳐 인식");
	}
}
