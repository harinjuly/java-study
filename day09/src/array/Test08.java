package array;

public class Test08 {
	public static void main (String[] args) {
		//배열의 데이터 스위칭 /스왑 = 위치 바꾸는 작업
		
		
		//목표: a와 b에 들어있는 데이터를 바꾸어 출력
		// 자바에서는 맞교환이 불가능. 그러므로 임시변수 만들기.
		int a=10;
		int b=20;
		
		int temp = a;
		a=b;
		b=temp;
		
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		
		
		
	}
}
