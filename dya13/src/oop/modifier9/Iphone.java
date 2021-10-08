package oop.modifier9;

public class Iphone {

	//변수: 멤버변수 , 정적 변수
	// 멤버변수는 객체마다 다를 수 있는 정보
	// 정적변수는 모든 객체가 동일해야 하는 정보
	
	//static = 정적 (고정)
	
	private int price;
	private String color;
	
	private static String company = "apple";
	//제조사가 변한다면? 다 똑같이 변하면= 정적변수

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static String getCompany() {
		return company;
	}

	public static void setCompany(String company) {
		Iphone.company = company;
	}

	
	
}
