package modifier5;

public class Calculator {

		private int first, second; //멤버 변수


		//생성자
		
		public Calculator(int first, int second) {
			this.setFirst(first);
			this.setSecond(second);
		}
				
		
		//가상의 getter 메소드
		
		public int getPlus() {
			return this.first + this.second;
		}
		public int getMinus() {
			return this.first - this.second;
		}
		
		
		
		
		//세터,게터 : 멤버 메소드
		
		public int getFirst() {
			return first;
		}
		
		public void setFirst(int first) {
			this.first = first;
		}

		public int getSecond() {
			return second;
		}

		public void setSecond(int second) {
			this.second = second;
		}
		
		
		
		
		
		
	}
