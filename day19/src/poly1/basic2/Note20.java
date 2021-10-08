package poly1.basic2;

public class Note20 extends Phone {
	
	public Note20() {
		}
	
	public Note20(String making,String serial, String telecom,String num, String color) {
		super(making, serial ,telecom,num,color);
			}
	
	@Override
	public void pic () {
		System.out.println("사진 - 100배 확대해서 찍기");
	}
	
	public void pay() {
		System.out.println("삼성페이");
	}
	
	
	
	
}
