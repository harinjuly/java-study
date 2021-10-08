package gui5;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class myFrame extends JFrame{
	private static final long serialVersionUID = 1681839263849515694L;
		
	JLabel label;
	JTextField kor;
	JTextField eng;
	JTextField sum;
	JTextField avg;
	JButton result;
	
	//점수관리 프로그램 (클래스 나누기)
	
	public myFrame() {
		//프레임 기본 설정
		super("점수관리 프로그램");		
		setLocationRelativeTo(null);
		setSize(500,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		myDis();
		setVisible(true);
				
	}
	
	//화면 구현
	public void myDis() {
		label = new JLabel("점수 관리 프로그램");
		label.setBounds(0,0,500,50);
		label.setFont(new Font("맑은 고딕",Font.BOLD,20));
		label.setHorizontalAlignment(JLabel.CENTER);
		add(label);
		
		label = new JLabel("국어 : ");
		label.setBounds(20,70,50,30);
		add(label);
		
		kor = new JTextField(10);
		kor.setBounds(70,70,150,30);
		add(kor);
		
		label = new JLabel("영어 : ");
		label.setBounds(250,70,50,30);
		add(label);
		
		eng = new JTextField(10);
		eng.setBounds(300,70,150,30);
		add(eng);
		
		label = new JLabel("합계 : ");
		label.setBounds(20,130,50,30);
		add(label);
		
		sum = new JTextField(10);
		sum.setBounds(70,130,150,30);
		add(sum);
		
		label = new JLabel("평균 : ");
		label.setBounds(250,130,50,30);
		add(label);
		
		avg = new JTextField(10);
		avg.setBounds(300,130,150,30);
		add(avg);
		
		result = new JButton("계산");
		result.setBounds(200,200,100,40);
		add(result);
		
		
		//계산 버튼 이벤트 처리
		result.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//국어와 영어점수를 계산해서 합계 평균 출력
				
				int sumTemp = Integer.parseInt(kor.getText()) + Integer.parseInt(eng.getText());
				sum.setText(String.valueOf(sumTemp));
				double avgTemp = sumTemp/2.0;
				avg.setText(String.valueOf(avgTemp));
				
			}
			
			
			
		});
		
	}
	
	
	
}
