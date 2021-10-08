package day05;
import java.lang.*;
public class Test21 {
	public static void main (String[] args) {
		// 음료 가격 (변동 가능)
		int americano = 1500;
		int cafeLatte = 2500;
		// 음료 수량 (변동 가능)
		int americanoCount = 20;
		int cafeLatteCount = 11;
		
		int americanoEvent = 5;
		int cafeLatteEvent = 3;
		
		int cafeCount = americanoCount+cafeLatteCount;
		//개별 음료 수량에 따른 가격
		int amricanoPrice = americano * americanoCount;
		int cafeLattePrice = cafeLatte * cafeLatteCount;
		System.out.println("----------------");
		System.out.println("           영  수  증          ");
		System.out.println("----------------");
		System.out.println("아메리카노 :   " + americanoCount + "잔");
		System.out.println("카페라떼 :   " + cafeLatteCount + "잔");
		System.out.println("주문수량 :   " + (cafeCount)+"잔");
		
		// 서비스 적용 : 아메리카노 5+1 ; 카페라떼 3+1
		int aFreeCount = americanoCount/ + (americanoEvent +1);
		int cFreeCount = cafeLatteCount/ +(cafeLatteEvent+1) ;
		int totalFreeCount = aFreeCount+cFreeCount;
		
		System.out.println("----------------");
		System.out.println("       -  서  비  스  -       ");
		System.out.println("Free아메리카노 :  " + aFreeCount + " 잔");
		System.out.println("Free카페라떼 :  " + cFreeCount + " 잔");
		System.out.println("서비스합계 :  " + totalFreeCount + "잔");
		
		// 서비스 제외 가격 아메리카노-서비스값 = 총가격이 나오게 하기
		int AtotalPrice = (americanoCount - aFreeCount) * americano;
		int CtotalPrice = (cafeLatteCount - cFreeCount) * cafeLatte;
		
		// 서비스포함 개별 아메 가격 System.out.println(AtotalPrice);
		// 서비스포함 개별 라떼 가격 System.out.println(CtotalPrice);
		
		int Total = AtotalPrice + CtotalPrice;
		
		System.out.println("----------------");
		System.out.println("총 금액 : " + Total + " 원");
		System.out.println("----------------");
	}
}
