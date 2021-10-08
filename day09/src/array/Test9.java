package array;

public class Test9 {
	public static void main(String[] args) {

		// 준비
		int[] data = new int[] { 30, 50, 20, 10, 40, 80};

		// 처음과 마지막만 교체
		// 처음:+0
		// 마지막:+(data.length-1)
		/*int temp = data[0];
		data[0] = data[data.length-1];
		data[data.length-1]=temp;
		
		temp = data[1];
		data[1] = data[data.length-2];
		data[data.length-2]=temp; */
		
		
		//반복문으로 진행
		for(int i=0; i<data.length/2; i++) {
			int temp = data[i];
			data[i] = data[data.length-(i+1)];
			data[data.length-(i+1)] = temp;
			
		}
		// 출력
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]);
			System.out.print("\t");
		}
			
		
		/*
		 * 계산
		 * 
		 * // 40, 10, 20, 50, 30 형태로 위치 수정하기
		 * 
		 * int temp = data[0]; //data[0] = data[4]; //data[4] = temp;
		 * 
		 * int che = data[1]; //data[1] = data[3]; //data[3] = che;
		 * 
		 * for (int i =0; i<data.length; i++) { data[0] = data[4]; data[4] = temp;
		 * 
		 * System.out.println(data[i]); }
		 * 
		 * 
		 * 
		 * // 출력
		 * 
		 * /* for (int i=0; i<data.length; i++) { System.out.print(data[i]);
		 * System.out.print("\t"); } System.out.println();
		 */

	}
}
