package array;
import java.lang.*;
public class Test03 {
	public static void main (String[] args) {
		
		//다음 데이터를 보관할 수 있는 배열을 만들고 저장 후 출력
	
		String[] data = new String[5];
	
		data[0] = "자바";
		data[1] = "파이썬";
		data[2] = "안드로이드";
		data[3] = "루비";
		data[4] = "자바스크립트";
		
		System.out.println(data[0]);
		System.out.println(data[1]);
		System.out.println(data[2]);
		System.out.println(data[3]);
		System.out.println(data[4]);
		
		
		double[] number = new double[5];
		
		number[0] = 10;
		number[1] = 12;
		number[2] = 13.5;
		number[3] = 17;
		number[4] = 20;
		
		System.out.println(number[0]);
		System.out.println(number[1]);
		System.out.println(number[2]);
		System.out.println(number[3]);
		System.out.println(number[4]);
		
	}
}
