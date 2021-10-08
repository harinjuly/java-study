package array;

public class Test12 {
		public static void main (String[] args) {
			
			//버블 정렬?
			
			int[] data = new int[] {30, 50, 20, 10, 40};
			
				int index = 0;
			
				
				// 통합 반복문
				
				for(int k=1; k< data.length; k++) {
					for(int i =data.length-1; i>=k; i--) {
						if(data[i-1]>data[i]) {
							int temp = data[i-1];
							data[i-1] = data[i];
							data[i] = temp;
					}
				}
				}
				
				
				
			//	3. 출력
				for(int i=0; i<data.length; i++) {
					System.out.println(data[i]);
					
									
				}
			
			
			

		
			
			
			
			
			
			
			
			
			
			
		}
}
