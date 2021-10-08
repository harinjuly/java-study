package oop.method5;

public class Phone {

	
	// 통신사는 SKT, LGT, KT 이외 차단
	// 전화번호는 11자리만 가능
	// 판매가는 음수 불가능. 
	
	String name;
	String agency;
	String number;
	int pay;
	
	
	//멤버 메소드
	
	//-일반메소드
	
	void setup(String name, String agency, String number, int pay)
		{
		this.setName(name);
		this.setAgency (agency);
		this.setNumber (number);
		this.setPay (pay);
	}
	
	void output() {
		
		System.out.println(name);
		System.out.println(agency);
		System.out.println(number);
		System.out.println(pay);
		
	}
	// - 세터 메소드 (변수와 1:1매칭)
		void setName(String name) {
			this.name = name;
		}
		
		void setAgency(String agency) {
			if(agency.equals("SKT") || agency.equals("KT") || agency.equals("LGT")) {
			 this.agency = agency;
		}
			}
	
		void setNumber(String number) {
			if(number.length() == 11) {
				this.number=number;
			}
		}
		
		void setPay(int pay) {
			if(pay>=0) {
				this.pay=pay;
			}
			
			//조건이 복잡할 수록
			if(pay <0) {
				return; //메소드를 중지시키는 명령
			}
			this.pay = pay;
		}
	
}
