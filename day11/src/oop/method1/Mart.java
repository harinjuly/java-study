package oop.method1;

public class Mart {
	//멤버 변수 (필드)
	 String code;
	 String name;
	 String group;
	 int price;
	 
	 
	 //멤버 메소드 = 객체에서 사용한 코드 저장(기능)
	 
	 //출력코드
	 //this = 객체자신을 의미.
	 void output() {
		 	System.out.print(this.code+"\t");
			System.out.print(this.name+"\t");
			System.out.print(this.group+"\t");
			System.out.print(this.price+"\t");
			System.out.println();
	 }	
		
	
	//초기화 코드
	//= 매개변수
	void setup(String w, String x, String y, int z) {
		this.code =w;
		this.name = x;
		this.group =y;
		this.price=z;
	}
			
			
	 
}
