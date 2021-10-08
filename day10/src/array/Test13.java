package array;

public class Test13 {
	public static void main(String[] args) {
		
		//2차원 배열의 생성 = 표의 형태로 이해 = 줄/칸의 개념,
		
		
		//1. 생성 후 초기화 하는 방법
		int[][] score = new int[5][3];
	
		
		//크기를 변수화 시켜 저장해서 사용
		// int row =5;
		// int col =3;
		
		System.out.println(score[0][1]);
	
	
			for(int k =0; k<score.length; k++) {
				for(int i = 0; i<score[k].length; i++) {
					System.out.print(score[k][i]);
					System.out.print("\t");
				}
				System.out.println();
				
			}
	
	
	
	}
	
}
