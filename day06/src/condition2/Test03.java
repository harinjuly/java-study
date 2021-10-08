package condition2;

import java.util.Scanner;

public class Test03 {
	public static void main (String[] args) {
		
		//사용자가 월을 입력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월을 입력하세요.");
		int month = sc.nextInt();
					
		//입력한 월의 날짜 출력 (ex. 8월은 31일까지 있다)
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(month + "월은 31일까지 있습니다.");
			break;
			
		case 2:
			System.out.println(month + "월은 28일까지 있습니다.");
			break;
		
		case 4: case 6: case 9: case 11:
			System.out.println(month + "월은 30일까지 있습니다.");
			break;
				}
		}
}
