package api1.date1;

import java.util.Calendar;

public class Test02 {

	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		
		System.out.println(today.getTime());
		
		//. get() 메소드로 원하는 값만 가져올 수 있음
		System.out.println(today.get(Calendar.YEAR)+"년");
		System.out.println(today.get(Calendar.MONTH )+1+"월");
		System.out.println(today.get(Calendar.DATE)+"일");
	
		// .set() 메소드로 원하는 값으로 설정가능
		today.set(2000, 5, 20);
		System.out.println(today.getTime());
		
	}

}
