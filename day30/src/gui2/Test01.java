package gui2;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Test01 {

	public static void main(String[] args) {
		//메모 보내기 창 만들기
		
		JFrame mf = new JFrame("메모 보내기");
		
		mf.setLocationRelativeTo(null);
		mf.setSize(500,500);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		mf.setLayout(new BorderLayout());
	
		
		//상단 패널 구성
		JPanel top = new JPanel();
		// 패널은 레이아웃 지정안해도 여러 컴포넌트 추가 가능
		JLabel le = new JLabel("이름 : ");
		top.add(le);
		JTextField name = new JTextField(10);
		top.add(name);
		
		JLabel ps = new JLabel("암호 : ");
		top.add(ps);
		JPasswordField pass = new JPasswordField(15);
		top.add(pass);
		
		
		mf.add(top, "North");
		
		
		//중앙 패널 구성
		JPanel center = new JPanel();
		
		center.add(new JLabel("메모 : "));
		JTextArea memo = new JTextArea(10,30);
				
		center.add(memo);
		mf.add(center,"Center");
				
		
		//하단 버튼 구성
		JButton sub = new JButton("전송");
		
		mf.add(sub,"South");
		
		
		
				
		mf.setVisible(true);
	
	}

}
