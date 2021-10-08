package array;

public class Test11_1 {
	public static void main(String[] args) {
		
		
		
		int[] score = new int[] {38,45,62,70,55,85,92,40,30,55};
		
	//	2. 배열의 가장 작은 수를 맨 앞에 배치 = 작은 수의 위치
		
		int index = 0;
		for(int i = 1; i<score.length; i++) {
				if(score[index]>score[i]) {
					index=1;
				}
				}
		
		
		int temp = score[0];
		score[0] = score[index];
		score[index] = temp;
		
		
		index=1;
		for(int i=2; i<score.length; i++) {
			if(score[index]>score[i]) {
				index=i;
			}
		}
		
		index=2;
		for(int i =3; i <score.length; i++) {
			if(score[index]>score[i]) {
				index=i;
			}
		}
		
		temp=score[2];
		score[2]=score[index];
		score[index] =temp;
			
	}
}
