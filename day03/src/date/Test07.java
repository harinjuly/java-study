package date;
import java.lang.*;
public class Test07 {
	public static void main (String [] args) {
		
		//준비
		
		int pricePerHour = 600;
		int inHour = 17, inMin = 30;
		int outHour = 19, outMin = 00;
		int inTime = inHour * 60 + inMin;
		int outTime = outHour * 60 + outMin;
		int time = outTime - inTime;
	//	System.out.println(time); 		
		
		int pricePerMin = pricePerHour / 60;
		int price = time * pricePerMin;
		
		int hour = time / 60;
		int min = time%60;
	
		System.out.println(hour);
		System.out.println(min);
		System.out.println (price);
		
		// 1시간에 600원 , 네시간 40분 게임함. 얼마냐? 600*4
			}
}
