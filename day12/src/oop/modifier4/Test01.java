package oop.modifier4;

public class Test01 {
	public static void main(String[] args) {
		
		Account a = new Account("11011350", "유재석",100000000, 2.2);
		Account b = new Account("11011355", "강호동", 50000000, 2.1);
		Account c = new Account("11011358", "신동엽", 30000000,2.5);
		
		a.output();
		b.output();
		c.output();
		
		
		//예금
		System.out.println("유재석 5천만원 예금 후 잔액: " + a.deposit(50000000) + "원");
		System.out.println("강호동 2천만원 예금 후 잔액: " + b.deposit(20000000)+"원");
				
		//출금
		System.out.println("신동엽 1천만원 출금 후 잔액: "+ c.withdraw(10000000)+ "원");
		
		
	}
}
