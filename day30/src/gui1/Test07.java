package gui1;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Test07 {

	public static void main(String[] args) {
		//레이아웃 설정 null
		
		JFrame mf = new JFrame("레이아웃 테스트");
		
		mf.setBounds(300,300,500,500);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mf.setLayout(null);
		
		JButton bt1 = new JButton("버튼1");
		bt1.setBounds(0,0,100,100);
		mf.add(bt1);
		
		JButton bt2 = new JButton("버튼2");
		bt2.setBounds(300,200,100,50); //컴포넌트마다 위치와 크기를 지정
		mf.add(bt2);
		
		JPanel sf = new JPanel();
		
		sf.setBounds(100,300,150,150);
		sf.setLayout(new GridLayout(2,2));
		
		JButton bt3 = new JButton("버튼3");
		JButton bt4 = new JButton("버튼4");
		JButton bt5 = new JButton("버튼5");
		JButton bt6 = new JButton("버튼6");
		
		sf.add(bt3);
		sf.add(bt4);
		sf.add(bt5);
		sf.add(bt6);
		
		mf.add(sf);
		
		mf.setVisible(true);
		

	}

}
