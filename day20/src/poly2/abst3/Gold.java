package poly2.abst3;

public class Gold extends Member {

	public Gold(String name, String grade, int point) {
		super(name, grade, point);
		}

	@Override
	public double getInterest() {
		return getPoint()*0.03;
	}
}
