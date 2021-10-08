package gui1;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test06 {

	public static void main(String[] args) {
		//컨테이너 레이아웃 설정
		//GridBagLayout
		//위치와 크기 자유롭게 배치
		
		JFrame mf = new JFrame("그리드백 레이아웃");
		
		mf.setBounds(300,300,300,300);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//레이아웃 지정
		mf.setLayout(new GridBagLayout());
		
		//GridBagLayout 배치를 도와줄 클래스
		GridBagConstraints c = new GridBagConstraints();
		
		c.fill = GridBagConstraints.BOTH; 		//컴포넌트를 영역의 크기로 알아서 조정
		c.weightx = 1.0;
		c.weighty = 1.0;
		//배치설정
		c.gridx = 0;
		c.gridy = 0;
		c.gridwidth = 1;
		c.gridheight = 1;
		JButton bt1 = new JButton("버튼1");
		mf.add(bt1,c);
		
		c.gridy =1;
		JButton bt2 = new JButton("버튼2");
		mf.add(bt2,c);

		c.gridx = 1;
		c.gridy = 0;
		c.gridheight =2;
		JButton bt3 = new JButton("버튼3");
		mf.add(bt3,c);

		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 2;
		c.gridheight = 1;
		JButton bt4 = new JButton("버튼4");
		mf.add(bt4,c);

		
		c.gridy = 3;
		JButton bt5 = new JButton("버튼5");
		mf.add(bt5,c);
		
		mf.setVisible(true);
	}

}
