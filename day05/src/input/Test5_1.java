package input;
import java.util.*;
public class Test5_1 {
	public static void main (String [] args ) {
		
		Scanner sc = new Scanner(System.in);
		
		//한시간 이용요금
		int pricePerHour = 600;
		
		//사용자에게 시작시간과 종료시간을 입력받아 이용요금을 계산하여 출력
		
		//시작시간 ??
		int inHour = sc.nextInt(), inMin = sc.nextInt();
		int inTime = inHour * 60 + inMin;
		
		//System.out.println(inTime);
		
		//종료시간
		int outHour = sc.nextInt(), outMin = sc.nextInt();
		int outTime = outHour * 60 + outMin;
		
		//System.out.println(outTime);
		
		sc.close();
		
		int playTime = outTime - inTime;
		System.out.println(playTime);
		
		int pricePerMin = pricePerHour / 60;
		int price = playTime * pricePerMin;
		
		int hour = playTime / 60;
		int min = playTime % 60;
	
		System.out.println(price);
	}
}
