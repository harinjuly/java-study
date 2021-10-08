package array;
	import java.lang.*;
public class Test05 {
	public static void main (String[] args) {
		
//		우리반 학생들의 사전평가 점수는 다음과 같습니다.
//
//		[ 38점, 45점, 62점, 70점, 55점, 85점, 92점, 40점, 30점, 55점 ]
//

		int[] score = new int[] {38,45,62,70,55,85,92,40,30,55};
		// 개수 System.out.println(score.length);
		
		int sum = 0; 
		double everage = 0;
		int rank =1;
		int count = 0;
		
//		1. 학생들의 점수를 배열을 만들고 저장한 뒤 모두 출력
		System.out.println("1. 학생들의 점수를 모두 출력");
		for (int i =0; i < score.length; i++) {
				System.out.println(score[i]);
			}
		
//		2.재평가자의 점수만 출력(재평가는 40점 미만인 경우에 해당)
		System.out.println("2. 재평가자의 점수만 출력");
		for(int i=0; i<score.length; i++) {
			
		if (score[i] < 40) {
			System.out.println(score[i] +"점: 재평가자");
		}
	}
		
//		3. 통과자의 점수만 출력
		
		System.out.println("3. 통과자의 점수만 출력");
		
		for (int i =0; i<score.length; i++) {
			if (score[i] >= 40) {
				count++;
				System.out.println(score[i]+"점: 통과");
			}
		
		}
	
		
//		4. 모든 학생의 점수 평균을 구하여 출력
	
		for (int i=0; i<score.length; i++) {
		sum += score[i];
		everage = (double)sum / score.length;
		}
		System.out.println("4.모든 학생의 점수 평균을 구하여 출력");
		System.out.println(everage);
		
		
//		5.통과한 학생의 인원수를 세어 출력 
		
		 for (int i = 0; i < score.length; i++) {
	            if (score[i] > 45) {
	                rank++;
	            }
	        }
	        System.out.println("5. 통과한 학생의 인원수를 세어 출력");
	        System.out.println(count + "명");
	        
//			6. 45점인 학생의 등수를 구하여 출력
	        System.out.println("6. 45점인 학생의 등수를 구하여 출력");
	        System.out.println(rank + "등"); 
	        
		


		}
	}


