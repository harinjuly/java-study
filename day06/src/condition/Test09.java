package condition;
import java.lang.*;
import java.util.Scanner;
public class Test09 {
	public static void main (String [] args) {
		
		// 사용자에게 여행가고싶은 달 1~12사이에서 입력하도록 하고 , 계절별 할인율을 구하여 출력
		// 봄 (3,4,5) 모든 상품에 30% 할인
		// 여름 (6,7,8) 할인없음
		// 가을 (9.10.11) 10%
		// 겨울 (12,1,2) 20%
		// 1 2 / 3 4 5 / 6 7 8 / 9 10 11 / 12		
		
		Scanner sc = new Scanner(System.in);
		
		//사용자가 입력
		System.out.println("여행 갈 월을 입력하세요.");
		int month = sc.nextInt();
		System.out.println("여행갈 인원수를 입력하세요.");
		int people = sc.nextInt();
		System.out.println("여행기간을 입력하세요.");
		int day = sc.nextInt();
		sc.close();
	
		int spring = 30, summer = 0, fall = 10, winter=20;
		int pricePerPerson = 100000;
		
		
		
		//계산
		int sale;
		
		if (month >= 3 && month <= 5) {
			sale = spring;
		} else if (month >= 6 && month <= 8) {
			sale = summer;
		} else if (month >= 9 && month <= 11) {
			sale = fall;
		} else {
			sale = winter;
		}
		
		System.out.println("할인율" + sale + "%");
		
		/*여행 기간과 인원수를 입력받아서 여행 예상 경비를 계산하여 출력
		1인당 하루 경비는 10만원으로 가정*/
		
		//금액 계산
		int totalPrice = people * day * pricePerPerson;
		System.out.println("총 금액"+totalPrice);
				
		//할인 적용
		
		int discountPrice = totalPrice * sale / 100; //정수끼리의 연산이므로 결과도 정수
		
		System.out.println("할인금액" + discountPrice);
		
		
		int resultPrice = totalPrice-discountPrice;
		System.out.println("최종금액"+resultPrice);
	}
}


