package oop.method7;

public class Test01 {
	public static void main(String[] args) {
		
		Score a =new Score();
		Score b = new Score();
		Score c = new Score();
		
		a.setup("피카츄",50,70);
		b.setup("꼬부기",60,59);
		c.setup("파이리",35,100);
		
		a.output();
		b.output();
		c.output();
		
		
		if(a.getAvg() < b.getAvg()) {
			System.out.println("피카츄가 더 잘한다.");
		}
			
	}
}
