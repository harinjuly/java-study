package loop2;

import java.util.Scanner;

public class Test04 {
	public static void main (String[] args) {
		
		//사용자에게 시간과 분을 입력받아서 더하는 프로그램.
		// 시간에 -1이 입력되면 프로그램을 종료시키며 종료될 때까지 여태까지 입력한 시간의 합계를  출력
		
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
			
		while (true) {
		System.out.println("시와 분을 입력하세요.");
		int hour = sc.nextInt();
				
		if(hour ==-1) {
			break;
		}
		
		int minute = sc.nextInt();
		System.out.println(hour+"시간"+minute+"분");
		
		total+=hour*60+minute;
		}
		sc.close();
		
		System.out.println("총 합계 시간 :" + total/60 + "시간" + total%60 + "분");
	}
}
