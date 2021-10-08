package gui4;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Test03 {

	public static void main(String[] args) {
		
		JFrame mf = new JFrame("점수 관리 프로그램");
		
		mf.setSize(600,500);
		mf.setLocationRelativeTo(null);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setLayout(null);
		
		JLabel label;
		Font font30 = new Font("맑은 고딕",Font.BOLD,30);
		Font font15 = new Font("맑은 고딕",Font.BOLD,15);
		
		//제목
		label = new JLabel("점수 관리 프로그램");
		label.setBounds(150,0,400,50);
		label.setFont(font30);
		mf.add(label);

		//국어
		label = new JLabel("국어 : ");
		label.setBounds(30,100,50,50);
		label.setFont(font15);
		mf.add(label);
		
		JTextField kor = new JTextField(15);
		kor.setBounds(100,100,150,50);
		mf.add(kor);
		
		
		//영어
		label = new JLabel("영어 : ");
		label.setBounds(280,100,50,50);
		label.setFont(font15);
		mf.add(label);
		
		JTextField eng = new JTextField(15);
		eng.setBounds(350,100,150,50);
		mf.add(eng);
		
		
		//합계
		label = new JLabel("합계 : ");
		label.setBounds(30,200,50,50);
		label.setFont(font15);
		mf.add(label);
		
		JTextField sum = new JTextField(15);
		sum.setBounds(100,200,150,50);
		sum.setEnabled(false);
		mf.add(sum);
						
		
		//평균
		label = new JLabel("평균 : ");
		label.setBounds(280,200,50,50);
		label.setFont(font15);
		mf.add(label);
		
		JTextField evg = new JTextField(15);
		evg.setBounds(350,200,150,50);
		evg.setEnabled(false);
		mf.add(evg);
				
		//계산버튼
		JButton bt = new JButton("계산");
		bt.setBounds(100, 300, 400, 100);
		mf.add(bt);
		
		
		mf.setVisible(true);
		
		//버튼에 대한 이벤트 처리
		bt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			int sumTemp = Integer.parseInt(kor.getText()) +Integer.parseInt(eng.getText());
			sum.setText(String.valueOf(sumTemp));
			
			double evgTemp = sumTemp/2.0;
			evg.setText(String.valueOf(evgTemp));
			}
			
		});
	}
	
	
	

}
