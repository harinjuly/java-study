package inherit.exam02;

public class Knight extends Figure{
				
		private String weapon;
		
		//생성자부

		public Knight () {
			
		}
		
		public Knight(int level, int power, int defense, int hp, int mp, String weapon) {
			super(level, power, defense, hp, mp);
			this.weapon = weapon;
			level = 1;
		}
		
		//메소드부
		
		
		public void getWeapon() {
			System.out.println("공격타입: 검(근거리)");
		}
		
		public void getShow() {
			System.out.println("힘: " + 50);
			System.out.println("방어: " + 10);
			System.out.println("HP: " + 200);
			System.out.println("MP: " + 100);
			
		}
		
		@Override
		public int getLevel(int level) {
			System.out.println("레벨: " + level);
			return level;
		}
		

		
		
		
}
