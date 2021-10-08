package array;

public class Test15 {
	public static void main(String[] args) {
		
		String[][] text=new String[][] {
			{"자바","JSP","Spring"},
			{"Python","Django","Pandas"}
		};
		
//		text[0][0]="자바";
//		text[0][1]="JSP";
//		text[0][2]="Spring";
//		text[1][0]="Python";
//		text[1][1]="DJango";
//		text[1][2]="Pandas";
				
//		System.out.println(text[0][2]);
		
		for(int k=0; k<text.length; k++) {
			for(int i =0; i<text[k].length; i++) {
			System.out.print(text[k][i]);
			System.out.print("\t");		
			}
			}
		System.out.println();
		
	}
}
