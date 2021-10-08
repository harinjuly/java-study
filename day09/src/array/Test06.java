package array;

public class Test06 {
	public static void main (String[] args) {
		//배열 위치제어.
		
		int[] data = new int[] {30,50,20,10,40};

		int temp = data[data.length-1];
		
		
		for (int i =4; i>=1; i--) {
			data[i] = data[i-1];
		}
		/*
		 data[4] = data[3]; data[3] =data[2]; data[2]=data[1]; data[1]=data[0];
		 data[0]=temp;
		 */
				
		
		for(int i =0; i<data.length; i++) {
			System.out.print(data[i]);
			System.out.print("\t"); //tab key
		}
			System.out.println();

		
		
	}
}
