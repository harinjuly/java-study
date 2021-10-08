package oop.method7;

public class Score {

		private String name;
		private int sub1;
		private int sub2;
		
		
		void setup(String name, int sub1, int sub2) {
			this.setName(name);
			this.setSub1(sub1);
			this.setSub2(sub2);
		}
		
		void output () {
			
			System.out.println(this.getName());
			System.out.println(this.getSub1());
			System.out.println(this.getSub2());
			System.out.println(this.getSum());
			System.out.println(this.getAvg());
		}
		
		
		
		void setName(String name) {
			this.name=name;
		}
		
		void setSub1(int sub1) {
			if(sub1 >=0 && sub1 <=100) {
			this.sub1=sub1;
		}
			}
		
		void setSub2(int sub2) {
			if(sub2>=0 && sub2 <=100) {
			this.sub2=sub2;
		}
			}
		
				
		
		
		String getName() {
			return this.name;
		}
		
		int getSub1() {
			return this.sub1;
		}
		
		int getSub2() {
			return this.sub2;
		}
		
		//가상의 변수를 가정
		
		int getSum() {
			return this.sub1 + this.sub2;
		}
		
		double getAvg() {
			return this.getSum() /2.0;
		}
		
				
		
}
