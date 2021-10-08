package oop.method2;

public class Test01 {
public static void main(String[] args) {
	
	Menu test1 = new Menu();
	Menu test2	= new Menu();
	Menu test3 = new Menu();
	
	//초기화
	
	test1.setup("아메리카노","음료",1500,false);
	test2.setup("카페라떼", "음료", 2000, true);
	test3.setup("샌드위치", "식사", 3000, true);
			
	
	//출력
	
	test1.output();
	test2.output();
	test3.output();
	
	
}
}
