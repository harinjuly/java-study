package array;

public class Test11 {
	public static void main(String[] args) {
		
		
		/* 다음 내용을 구현하세요.

		배열을 준비하고 다음 데이터를 저장하세요
		[ 38점, 45점, 62점, 70점, 55점, 85점, 92점, 40점, 30점, 55점 ]
		이 중에서 가장 높은 점수를 찾아서 위치까지 출력
		*/
		
		
		int[] data = new int[] {38,45,62,70,55,85,92,40,30,55};
		
		int max = data[0];
		int index = 0;
		
		for (int i =1; i<data.length; i++) {
			if (max < data[i]) {
				max = data[i];
				index = i;
						}
		 					}
			System.out.println("가장 높은 점수: " + max);
			System.out.println("높은 점수의 위치: " + index);
			
			
			// 오름차순
			for (int i=0; i<data.length; i++) {
				int min = data[i];
					for(int j=1+i; j<data.length; j++) {
							if(data[i] >data[j]) {
								min = data[i];
								data[i] = data[j];
								data[j] = min;
																
							}
					}
					System.out.print(data[i]);
					System.out.print("\t");
					
				}
			}
				
			
	
}

