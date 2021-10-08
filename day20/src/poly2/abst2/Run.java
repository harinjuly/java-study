package poly2.abst2;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		Car c = null;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
		System.out.println("## VR 차량 시승 시뮬레이션 프로그램 ## ");
		System.out.println("1. 아반떼");
		System.out.println("2.제네시스");
		System.out.println("3. 그렌저");
		System.out.println("9.그만하기");
		System.out.println("시승할 차 번호를 선택하세요.");
		int select = sc.nextInt();
		
		if (select >0 && select <=3) {
		switch(select) {
		
		case 1 :
			c = new Avante();
			break;
		case 2:
			c = new Genesis();
			break;
		case 3 :
			c = new Grandeur();
			break;
			}
			c.engineStart();
			c.gear();
			c.window();
		}
		else if(select == 9) {
			return;
		} else {
			System.out.println("잘못 입력하셨습니다. 다시 입력하세요.");
			}
		}
		
	}
}
