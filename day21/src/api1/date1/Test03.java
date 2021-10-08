package api1.date1;

import java.util.Calendar;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		Calendar dday = Calendar.getInstance();
		
		Scanner sc = new Scanner(System.in);
				
		//현재 날짜
		System.out.println(today.getTime());
				
		System.out.print("D-Day [년도] 입력: ");
		int year = sc.nextInt();
		System.out.print("D-Day [월] 입력: ");
		int month = sc.nextInt();
		System.out.print("D-Day [일] 입력: ");
		int date = sc.nextInt();
		
		
		dday.set(year, month-1, date);
		
		
		System.out.print("오늘 날짜: ");
		System.out.println(today.get(Calendar.YEAR)+"년" +
		(today.get(Calendar.MONTH)+1)+"월"
		+ today.get(Calendar.DATE)+"일");
		
		System.out.print("D-Day 날짜: ");
		System.out.println(year + "년" + month + "월" + date +"일");
			
		long day = today.getTimeInMillis() / 86400000;
		long tday = dday.getTimeInMillis() / 86400000;
		long count = tday - day;
				
		if(count == 0) {
			System.out.println("D-Day 입니다.");
		} else if(count < 0) {
			System.out.println(Math.abs(count) + "일 지났습니다.");
		} else {
			System.out.println(count + "일 남았습니다.");
		}
	}

}
