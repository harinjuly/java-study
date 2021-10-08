package poly1.basic2;

public class Phone {

	//부모 클래스
	
	private String making;
	private String serial;
	private String telecom;
	private String num;
	private String color;
	
	
	
	public Phone() {}
	
	public Phone(String making, String serial, String telecom, String num, String color) {
		this.making=making;
		this.serial= serial;
		this.telecom=telecom;
		this.num=num;
		this.color=color;
	}
	
	public void call() {
		System.out.println("전화");
	}
	
	public void msg() {
		System.out.println("문자메시지");
	}

	public void pic() {
		System.out.println("사진 찍기");
	}


	public String getMaking() {
		return making;
	}

	public String getSerial() {
		return serial;
	}

	public String getTelecom() {
		return telecom;
	}

	public String getNum() {
		return num;
	}

	public String getColor() {
		return color;
	}
	
	
	
	
}
