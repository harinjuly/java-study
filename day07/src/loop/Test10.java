package loop;
import java.lang.*;
public class Test10 {
	public static void main (String[] args ) {
		
		/*
		 * 고대 그리스에서 아주 현명한 노인이 살고 있었습니다 왕이 소문을 듣고 찾아가서 "원하는게 있으면 주겠다" 고 했더니 노인이 다음과 같이
		 * 말합니다. "저는 많이 바라지 않습니다. 첫날 1원만 주시고, 둘째날부터는 전날보다 두 배만 더 주시면 됩니다."
		 * 
		 * 1.30일동안 매일매일 노인이 받게되는 돈을 일자별로 출력 2.30일동안 노인이 받게되는 돈의 총 액수를 출력 3.40일로 기간을 바꾸면
		 * 노인이 받는 돈이 총 얼마인지 구하여 출력 4.나라 예산이 1조원 있다고 했을 때, 3번의 경우 노인에게 돈을 줄 수 있는지 판정하여 출력
		 */

		// 1. 30일동안 일자별로 받게되는 돈

		long money = 1L;
		long total = 0L;
		
		for (int i = 1; i <= 30; i++) {
			System.out.println(i + "일에 받는 금액 : " + money + "원");
			total += money;
			money *= 2;
			// money = money * 2;
						
		}

		// 2. 30일 총 액수 출력

		System.out.println("----------------------------------");
		System.out.println("30일 수령금: " + total + "원");

		// 3. 40일 동안 받는 금액은?

		long fortyPay = 1;
		long payTotal = 0;

		for (int i = 1; i < 41; i++) {
			fortyPay = fortyPay * 2;
			payTotal = payTotal + fortyPay;

		}
		System.out.println("40일 수령금: " + payTotal + "원");

		// 4. 예산 1조원일 때 3번의 경우 돈 지급 가능 여부

		if (payTotal > 1000000000000L) {
			System.out.println("노인에게 돈을 지급할 수 없다.");
		} else {
			System.out.println("노인에게 돈을 지급할 수 있다.");

		}
	}
}

