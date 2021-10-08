package generic1;

public class Test01 {

	public static void main(String[] args) {
		//	 제네릭

		Calc c = new Calc();
		System.out.println(c.div(10, 20));
		System.out.println(c.div(1.5, 2.5));
		System.out.println(c.div('e', 'a'));
	}

}
