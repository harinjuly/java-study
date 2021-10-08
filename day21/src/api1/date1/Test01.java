package api1.date1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test01 {

	public static void main(String[] args) {
		
		//객체를 생성하면서 시스템으로부터 현재 날짜와 시간 정보를 가져와서 저장
		Date d1= new Date();
		System.out.println(d1);
		
		// 원하는 포맷으로 변환해서 사용
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		System.out.println(sdf.format(d1));
		
		// 객체를 생성하면서 날짜를 지정해서 저장
		// - long형 정수값을 가지고 날짜와 시간을 계산
		// - 1970년 1월 1일 0시 0분 0초부터 밀리초(1/1000) 단위로 경과한 날짜와 시간
		Date d2 = new Date(0L);
		System.out.println(d2);
		
	}

}
