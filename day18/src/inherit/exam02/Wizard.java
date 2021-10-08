package inherit.exam02;

public class Wizard extends Figure {
			
			private String weapon;
			
			
			//생성자부
			
			public Wizard() {
			}
			
			
			public Wizard(int level, int power, int defense, int hp, int mp) {
				super(level,power,defense,hp,mp);
				this.weapon = weapon;
				level = 1;
				}
			
			//메소드부
					
			
			public void getWeapon() {
				System.out.println("공격타입: 마법(원거리)");
			}
			
			//공격방어체력마나 각자 다른 값으로 초기화..!!

			public void getShow() {
				System.out.println("힘: " + 10);
				System.out.println("방어: " + 50);
				System.out.println("HP: " + 100);
				System.out.println("MP: " + 200);
			}
		
		
		
	}

