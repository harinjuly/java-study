package inherit.exam03;

import java.util.Scanner;

public class Run {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Wizard w = null;
		Sworder s = null;
		
		while(true) {
		System.out.println("1. 캐릭터 생성");
		System.out.println("2. 캐릭터 정보보기");
		System.out.println("9. 종료");
		int select = sc.nextInt();
		switch(select) {
		case 1:
			System.out.println(" <--- 캐릭터 생성 --->");
			System.out.println("이름을 입력하세요 :  ");
			String name = sc.next();
			System.out.println("직업을 선택하세요. (1. 마법사 / 2. 검사)");
			int job = sc.nextInt();
			
			switch(job) {
			case 1 : 
				w = new Wizard(name, "마법사");
				System.out.println(w);
				w.attack();
				w.defense();
				break;
			case 2 : 
				s = new Sworder(name, "전사");
				System.out.println(s);
				s.attack();
				s.defense();
				break;
			default :
				System.out.println("잘못 입력하셨습니다.");
			}
			break;
		case 2:
			if (w != null) {
			System.out.println(w);
			w.attack();
			w.defense();
			}
			if(s != null) {
			System.out.println(s);
			s.attack();
			s.defense();
			}
			if(s==null && w==null){
				System.out.println("캐릭터를 생성해주세요.");
			} break;
			
		case 9:
			System.out.println("종료");
			return;
		
		
		}
		}
		
					
	
	}
}
