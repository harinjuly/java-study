package condition;
import java.lang.*;
public class Test03 {
	public static void main(String [] args) {
		//그룹조건 : 동시에 실행될 수 없는 상황
		
		long money = 1000000L;
		
		if(money >= 1000000000L) {
			System.out.println("당신은 부자입니다");
		}
		
		else {
			System.out.println("당신은 부자가 아닙니다");
		}
		
	}
}
