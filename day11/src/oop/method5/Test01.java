package oop.method5;

public class Test01 {
	public static void main(String[] args) {
	
		Phone p1=new Phone();
		Phone p2=new Phone();
		Phone p3=new Phone();
		
		p1.setup("갤럭시폴드2", "SKT", "01012345678", 2500000);
		p2.setup("아이폰12", "LGT", "01022224444", 1800000);
		p3.setup("V60", "KT", "01077778888", 1500000);
			
		p3.setPay(-150000); //차단
		
		
		p1.output();
		p2.output();
		p3.output();
		
		
		
	}
}
