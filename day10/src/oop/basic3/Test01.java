package oop.basic3;

public class Test01 {
	public static void main(String[] args) {
		
		
		Mart a = new Mart();
		Mart b = new Mart();
		Mart c = new Mart();
		
		a.code ="A00001";
		a.name = "참이슬";
		a.group ="주류";
		a.price=1200;
		
		b.code ="A00002";
		b.name = "처음처럼";
		b.group ="주류";
		b.price=1300;
		
		c.code ="B00001";
		c.name = "고무장갑";
		c.group ="생필품";
		c.price=2000;
		
		
		
		System.out.print(a.code+"\t");
		System.out.print(a.name+"\t");
		System.out.print(a.group+"\t");
		System.out.print(a.price+"\t");
		System.out.println();
		
		System.out.print(b.code+"\t");
		System.out.print(b.name+"\t");
		System.out.print(b.group+"\t");
		System.out.print(b.price+"\t");
		System.out.println();
		
		System.out.print(c.code+"\t");
		System.out.print(c.name+"\t");
		System.out.print(c.group);
		System.out.print(c.price+"\t");
		System.out.println();
		
		
	
	
	}
}
