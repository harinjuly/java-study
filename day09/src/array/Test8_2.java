package array;

public class Test8_2 {
	public static void main (String[] args) {
		//배열의 데이터 스위칭 /스왑 = 위치 바꾸는 작업
		
		
		//목표: a와 b에 들어있는 데이터를 바꾸어 출력
		// 자바에서는 맞교환이 불가능. 그러므로 임시변수 만들기.

		//준비
		int[] data =new int[] {30,50,20,10,40};
		
		
		//계산
		
		int temp = data[0];
		data[0] = data[3];
		data[3] = temp;
		
		//출력
				
		
		for(int i=0; i<data.length; i++) {
			System.out.print(data[i]);
			System.out.print("\t");
		}
			System.out.println();
		
		
		
		
		
	}
}
