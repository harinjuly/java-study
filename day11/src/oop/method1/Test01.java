package oop.method1;

public class Test01 {
	public static void main(String[] args) {
		
		//초기화 및 출력의 단순화
		
		Mart a = new Mart();
		Mart b = new Mart();
		Mart c = new Mart();
		
		a.setup("A00001", "참이슬","주류",1200);
		b.setup("A00002", "처음처럼", "주류", 1300);
		c.setup("B00001","고무장갑","생필품",2000);		
		
		
		a.output();
		b.output();
		c.output();
		
			
	}
}
