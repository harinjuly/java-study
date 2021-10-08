package random;

public class Game {
//상수보관 클래스
	
	public static final int SCISSORS = 0;
	public static final int ROCK = 1;
	public static final int PAPER = 2;

	public static String generate() {
		int choice = (int)(Math.random()*3);
		switch(choice) {
		case SCISSORS : return "가위";
		case ROCK: return "바위";
		case PAPER : return "보";
		default : return null;
		}
	}

}
