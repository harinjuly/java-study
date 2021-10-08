package inherit.exam02;

import java.util.Scanner;

public class MainMenu {

		private String name;
						
		Scanner sc = new Scanner(System.in);
		Wizard wi = new Wizard();
		Knight kn = new Knight();
		
		
		
		public void Menu() {
			System.out.println("1. 캐릭터 생성하기");
			System.out.println("2. 캐릭터 정보보기");
			// 정보보기를 누르면 캐릭터의 정보가 출력. 생성이 안되었으면 생성 후 확인 해주세요 출력
			System.out.println("9. 종료");
			System.out.println("메뉴번호를 입력하세요 :  ");
			int select = sc.nextInt();
			switch(select) {
			case 1: 	charMenu();
				break;
			case 2 : charList();
				break;
			case 9 :
				return;
				
			}
		}
		
		public void charMenu() {
			System.out.println("이름 입력하기:  ");
			name = sc.next();
			//닉네임이 2글자 이상일 경우 직업선택으로.
			
			while(name.length()>=2) {
				jopSelect();
				return;
			}
			System.out.println("두글자 이상 입력");
			charMenu();
			return;
			}
			 
		
		
		public void jopSelect () {
			System.out.println("직업을 선택하세요.");
			System.out.println("1. 마법사");
			System.out.println("2. 전사");
			System.out.println("9. 메인메뉴로");
			int select = sc.nextInt();
			switch(select) {
			
			case 1:
				System.out.println("이름:  " + name);
				wi.getLevel();
				wi.getShow();
				wi.getWeapon();
				break;
			case 2:
				System.out.println("이름:  " + name);
				kn.getLevel();
				kn.getShow();
				kn.getWeapon();
				break;
			case 9:
				Menu();
				return;
			}
		}
		
		public void charList() {
			//캐릭터를 생성했을 경우는 캐릭터 정보를 출력.
			
			
			//캐릭터가 없을 경우.
			System.out.println("캐릭터를 생성 후 확인해주세요.");
			// 한 다음에 다시 메인 화면으로 돌아가기.
		}
		
		
	

	}


