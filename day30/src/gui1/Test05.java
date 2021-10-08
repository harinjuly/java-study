package gui1;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test05 {

	public static void main(String[] args) {
		//컨테이너 레이아웃 설정
		// GridLayout
		// - 가로 세로 일정 수만큼 배치, 격자 구조
		// - 객체를 생성할 때 행과 열을 지정
		// - 각 컴포넌트들은 동일한 크기를 가짐.
		
		JFrame mf = new JFrame("격자 레이아웃");
		
		mf.setBounds(300,300,300,300);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//레이아웃 설정
		mf.setLayout(new GridLayout(3,2));
		
		for(int i=1; i<=6; i++) {
			mf.add(new JButton(String.valueOf(i)));
		}
		
		mf.setVisible(true);
		
		
	}

}
