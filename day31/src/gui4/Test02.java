package gui4;

import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Test02 {

	public static void main(String[] args) {
		// 무명 클래스(익명객체)로 리스너 객체화
		
		JFrame mf = new JFrame("이벤트 테스트2");
		
		Font font20 = new Font("맑은 고딕",Font.BOLD,20);
		
		mf.setBounds(500,500,300,300);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setLayout(new GridLayout(5,2));
		
		JLabel label = new JLabel("숫자 1 : ");
		mf.add(label);
		JTextField num1 = new JTextField(5);
		mf.add(num1);
		
		mf.add(new JLabel("숫자 2 : "));
		JTextField num2 = new JTextField(5);
		mf.add(num2);
		
		mf.add(new JLabel("합계 : "));
		JTextField sum = new JTextField(5);
		sum.setEnabled(false);
		mf.add(sum);
				
		mf.add(new JLabel("평균 : "));
		JTextField avg = new JTextField(5);
		avg.setEnabled(false);
		mf.add(avg);
		
		JButton result = new JButton("결과");
		mf.add(result);
		
		JButton reset = new JButton("다시");
		mf.add(reset);
		
		mf.setVisible(true);
		
		// //이벤트 처리
		
		
		//결과 버튼에 대한 이벤트 처리
		result.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//입력받은 두 수의 합계 구하기
				int sumTemp = Integer.parseInt(num1.getText()) + Integer.parseInt(num2.getText());
				sum.setText(String.valueOf(sumTemp));
				
				double avgTemp = sumTemp/2.0;
				avg.setText(String.valueOf(avgTemp));
				
			}
		});

		//'다시' 버튼에 대한 이벤트 처리
		reset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//모든 값 초기화 시키기
				num1.setText("");
				num2.setText("");
				avg.setText("");
				sum.setText("");
			}
			
		});
	
	}

}
