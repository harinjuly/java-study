package gui1;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test03 {

	public static void main(String[] args) {
		// 컨테이너 레이아웃 설정
		//borderLayout 다섯 개의 영역(동서남북중앙)
		
		//컨테이너 객체 생성
		JFrame mf = new JFrame("레이아웃 실습");
		
		mf.setBounds(500,500,300,300);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//레이아웃 설정
//		BorderLayout bl = new BorderLayout();
//		mf.setLayout(bl);
		mf.setLayout(new BorderLayout());
				
		//컴포넌트 객체 생성
		JButton bt1 = new JButton("버튼1");
		JButton bt2 = new JButton("버튼2");
		JButton bt3 = new JButton("버튼3");
		JButton bt4 = new JButton("버튼4");
		JButton bt5 = new JButton("버튼5");
		
		//컴포넌트를 컨테이너에 배치
		//각 컴포넌트를 어떤 영역에 배치할 것인지를 지정
		//동서남북중앙 대소문자 구분 필수
		mf.add(bt1,"North");
		mf.add(bt2,"South");
		mf.add(bt3,"East");
		mf.add(bt4,"West");
		mf.add(bt5,"Center");
			
		//하나의 영역에 여러 컴포넌트를 배치
		// 그냥하면 덮어쓰기됨.
		// panel컨테이너를 만들어서 추가해 준다.
		
		JPanel sf = new JPanel();
		sf.setLayout(new BorderLayout());
		
		JButton bt6 = new JButton("버튼6");
		sf.add(bt6,"North");
		
		JButton bt7 = new JButton("버튼7");
		sf.add(bt7,"South");
		
		mf.add(sf,"Center");
				
		mf.setVisible(true);
		
		
			
	}

}
