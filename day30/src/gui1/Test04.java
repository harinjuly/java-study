package gui1;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test04 {

	public static void main(String[] args) {
		//컨테이너 레이아웃 설정
		// - FlowLayout
		// - FlowLayout.LEFT, FlowLayout.RIGHT, FlowLayout.CENTER
		
		
		JFrame mf = new JFrame("플로우 레이아웃");
		
		mf.setLocationRelativeTo(null);
		mf.setSize(300,300);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
//		mf.setLayout(new FlowLayout()); ->기본값 가운데 정렬
//		mf.setLayout(new FlowLayout(FlowLayout.LEFT)); //객체 생성시 정렬 기준 설정
		mf.setLayout(new FlowLayout(FlowLayout.RIGHT));
		
		JButton bt1 = new JButton("버튼1");
		JButton bt2 = new JButton("버튼2");
		JButton bt3 = new JButton("버튼3");
		JButton bt4 = new JButton("버튼4");
		JButton bt5 = new JButton("버튼5");
		
		mf.add(bt1);
		mf.add(bt2);
		mf.add(bt3);
		mf.add(bt4);
		mf.add(bt5);
				
		mf.setVisible(true);
		
		
		
		
	}

}
