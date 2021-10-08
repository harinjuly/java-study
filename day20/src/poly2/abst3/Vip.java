package poly2.abst3;

public class Vip extends Member{

	public Vip(String name, String grade, int point) {
		super(name, grade , point);
		}

	@Override
	public double getInterest() {
		return getPoint() * 0.05;
	}
}
