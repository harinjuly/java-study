package gui1;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Test02 {

	public static void main(String[] args) {
		// 컨테이너에 컴포넌트 추가
		
		// 컨테이너 객체 생성
		JFrame mf = new JFrame("컴포넌트 추가테스트~!");
		
		mf.setBounds(500,300,500,200);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 컴포넌트 객체 생성
		JButton bt1 = new JButton("버튼1");
		// 컴포넌트를 컨테이너에 배치(추가)
		// - 컨테이너 전체화면에 컴포넌트 추가됨
		mf.add(bt1);
		
		// 컴포넌트 하나 더 추가
		// - 이전 컴포넌트를 덮어써서 배치됨
		// -> 레이아웃을 설정 해줘야 함!!
		JButton bt2 = new JButton("버튼2");
		mf.add(bt2);
		
		mf.setVisible(true);		
	}

}