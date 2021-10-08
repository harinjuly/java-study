package poly2.abst3;

public class Silver extends Member{

	
	public Silver(String name, String grade, int point) {
		super(name, grade , point);
	}
	
	@Override
	public double getInterest() {
			return getPoint() * 0.02;
		}
	

}
