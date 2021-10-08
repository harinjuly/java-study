package oop.basic2;

public class Test01 {
	public static void main(String[] args) {
		
		Record a = new Record();
		Record b = new Record();
		Record c = new Record();
		
		//초기화
		
		a.name ="김연아";
		a.sort = "피겨스케이팅";
		a.gold ="2";
		a.silver = "0";
		a.bronze ="1";
		
		b.name = "이상화";
		b.sort = "스피드스케이팅";
		b.gold ="1";
		b.silver = "2";
		b.bronze ="1";
		
		c.name = "윤성빈";
		c.sort = "스켈레톤";
		c.gold ="1";
		c.silver = "0";
		c.bronze ="1"; 
		
		
		//출력
		
		System.out.print(a.name+"\t");
		System.out.print(a.sort+"\t");
		System.out.print(a.gold+"\t");
		System.out.print(a.silver +"\t");
		System.out.print(a.bronze+"\t");
		System.out.println();
		
		
		System.out.print(b.name+"\t");
		System.out.print(b.sort+"\t");
		System.out.print(b.gold+"\t");
		System.out.print(b.silver +"\t");
		System.out.print(b.bronze+"\t");
		System.out.println();
		
		System.out.print(c.name+"\t");
		System.out.print(c.sort+"\t\t");
		System.out.print(c.gold+"\t");
		System.out.print(c.silver +"\t");
		System.out.print(c.bronze+"\t");
		System.out.println();
		
	}
}
