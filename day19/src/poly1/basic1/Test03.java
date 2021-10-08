package poly1.basic1;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Animal ani;
		System.out.println("1.고양이");
		System.out.println("2.강아지");
		int select = sc.nextInt();
		
		switch(select) {
		case 1 :
			ani = new Cat();
			
			break;
		case 2 :
			ani = new Dog();
			
			break;
		default : 
			ani = new Animal();
		}
		ani.eat();
		ani.speak();
	
	
	}

}
