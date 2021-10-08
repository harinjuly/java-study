package array;

public class Test10 {
	public static void main(String[] args) {
		
		//최소 최대값 찾기
		//정렬(sort) 구현을 위한 필수 개념

		
		//1. 데이터 준비
		int[] data = new int[] {30, 50, 20, 10, 40};
		
		
		//2. 최소값 탐색
		//가장 앞이 최소값이라 가정
		int index = 0;
		int min = data[0];
		
		//두번째부터 위에서 정한 데이터와 비교.
		for(int i=1; i<data.length; i++) {
			System.out.println("min="+min+"data[i]"+data[i]);
			
			if(min>data[i]) {
				min=data[i];
				index=i;
			}
			
		}
		System.out.println("제일작은값"+min);
		System.out.println("제일작은값 위치"+index);
		
		//3. 출력
		
		
		
		
	}
}
