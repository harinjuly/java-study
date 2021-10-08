package array;

public class Test07 {
	public static void main (String[] args) {
		
		//왼쪽으로 한 칸 이동하도록 구현 shift
		
		
		//1. 테이터를 배열에 저장
		int[] data =new int[] {30,50,20,10,40};
		
		
		// 2.데이터 회전
		int temp = data[0];
		
		for(int i =0; i<data.length-1; i++) {
			data[i] = data[i+1];
		}
		data[data.length-1]= temp;
		
		/*data[0] = data[1];
		data[1] = data[2];
		data[2] = data[3];
		data[3] = data[4];
		data[4] = temp; */
		//가장 좌측 데이터 임시변수 저장
		//반복문 사용.
		
				
		for (int i =4; i>=1; i--) {
			data[i]=data[i-1];
			System.out.println(data[i]);
				}
		
		
	 /*	data[0] =temp;
		for(int i =0; i<data.length; i++) {
		System.out.println(data[i]); } */
	
		
		}
}
