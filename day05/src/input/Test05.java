package input;
import java.util.*;
public class Test05 {
	public static void main (String [] args ) {
		
		Scanner sc = new Scanner(System.in);
		
		//한시간 이용요금
		int pricePerHour = 600;
	
		//시작시간 ??
		System.out.println("시작시간을 입력하세요.");
			int in = sc.nextInt();
		System.out.println("종료시간을 입력하세요.");
			int out = sc.nextInt();
			
			
		//계산
		int inHour = in / 100; 
		int inMin = in % 100;
		
		//int inTime = inHour * 60 + inMin;
	
		int outHour = out / 100;
		int outMin = out % 100;
		
		//int outTime = outHour * 60 + outMin;
	
		sc.close();
		
		
		
		
	//int playTime = outTime - inTime;
	//	System.out.println("총 사용시간 : " + playTime);
		
		//int pricePerMin = pricePerHour / 60;
		//int price = playTime * pricePerMin;
		
	//	int hour = playTime / 60;
		//int min = playTime % 60;
	
		// System.out.println("이용가격 :" + price);
	}
}
