package loop2;

public class Test05 {
	public static void main (String[] args) {
		
		// 달팽이가 낮에는 3cm 올라가고 밤에는 자느라 2.5cm 내려온다.
		// 나무의 높이가 15cm라고 할 때 달팽이가 나무에 올라가려면 며칠이 걸리는지 계산하여 출력.
		
		//계산식?
		
		//무한반복
		
		
		double tree = 0;//달팽이 위치
		int date = 0;
		
		while (true)
		{
			tree+=3; //올라가는 코드
			System.out.println("올라간거리" + tree);
			
			date++;
			
			if (tree >=15) {
				break;
			}
			
			tree-=2.5; //내려가는 코드
			System.out.println("내려간거리" + tree);
			//tree += roed;

			
		}
			System.out.println("총"+date+"일");
	}
}
