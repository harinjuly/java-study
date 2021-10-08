package oop.modifier8;

public class Robot {

		//1. 곱하기 기능 2.제곱 기능 3. 삼각형 넓이 계산 기능
	
	//곱하기
	public static int multiple(int a, int b) {
		return a*b;
	}
		
	//제곱 기능
	
	public static int square(int n) {
		//return n * n;
		return multiple(n, n);
	}
	
	//삼각형 넓이 = 폭 * 높이/2
	public static double triangle(int width, int height) {
		//return width * height / 2.0;
		return (double)width * height / 2;
	}
	
	
	//원의 넓이 = 반지름 * 반지름 * 원주율
	public static double circle(int radius) {
		double area = radius * radius * 3.14;
		return area;
	}
	
	
	
		
}
