package oop.method2;

public class Menu {
	
	
	//행사 상품의 경우 10% 할인된 가격으로 출력
	
	String menu;
	String group;
	int price;
	boolean event;
	
	//초기화를 메소드로
	
	void setup(String a, String b, int c, boolean d) {
		this.menu =a;
		this.group=b;
		this.price=c;
		this.event=d;
	}
	
	
	//출력
	
	void output() {
		System.out.println(this.menu);
		System.out.println(this.group);
		
		if(this.event) {
			int discount = this.price*90/100;
			System.out.println("판매가격: " +discount+"원(정가:"+this.price+"원)");
		}
		else {
		System.out.println(this.price);
		}
		System.out.println(this.event);
	
		if(this.event) {
			System.out.println("**할인 행사중**");
		}
	
	
		
	}
		
}
