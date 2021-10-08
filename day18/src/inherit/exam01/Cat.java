package inherit.exam01;

public class Cat extends Animal {

		private int clean; // 청결도 (0~100)
	
		//생성자부
		
		public Cat() {}
						
		public Cat(String type, String color, String state, int clean) {
			super(type, color, state);
			this.clean = clean;
			}
			
		
		//메소드부
		
	
		
		public void climb() {
			System.out.println("올라가다");
		}
		
		public void grumming() {
			System.out.println("털 손질");
		}
		
		public void speak() {
			 System.out.println("야옹");
	}
		
		
}
