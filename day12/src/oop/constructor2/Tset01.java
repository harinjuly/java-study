package oop.constructor2;

public class Tset01 {
	public static void main(String[] args) {
		
		Game a = new Game("테스터1", "마법사");
		Game b = new Game("테스터2", "전사", 5, 200);
		Game c = new Game("운영자","마법사",999, 999999);
		
		
		a.output();
		b.output();
		c.output();
		
	}
}
