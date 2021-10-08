package oop.modifier4;

public class Account {

	
	private final String number;
	private String name;
	private long money;
	private final double interast;
	
		
	public Account (String number, String name, long money, double interast) {
		this.number = number;
		this.setName (name);
		this.setMoney(money);
		this.interast =interast;
	}
	
	public Account (String number, String name, double interast) {
		this.number = number;
		this.setName(name);
		this.interast = interast;
	}

	
	
	public void setName(String name) {
		this.name = name;
	}

	

	public void setMoney(long money) {
		if(money < 0) return;
		this.money = money;
	}

	
	public String getName() {
		return name;
	}

	public long getMoney() {
		return money;
	}
	
	public String getNumber() {
		return number;
	}

	public double getInterast() {
		return interast;
	}
	
	
	public void output (){
		System.out.println("고유번호: " + getNumber());
		System.out.println("예금주: " + getName());
		System.out.println("예금액: " + getMoney()+"원");
		System.out.println("이자율: " + getInterast() +"%");
	}
	
	
	//예출금 기능 만들기
	
	
	public long deposit(long money) {
				long deposit = this.money;
				deposit += money;
				return deposit;
					}
	
	public long withdraw(long money) {
		long withdraw= this.money;
		withdraw -= money;
		return withdraw;
	}

	
	

}
