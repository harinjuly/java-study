package gui4;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class MainFrame01 extends JFrame{

	private static final long serialVersionUID = -110449621687617155L;

	JLabel label;
	JButton bt;
	
	public MainFrame01() {
		super("이벤트 테스트1");
		setBounds(300,300,300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(2,1));
				
		label = new JLabel("이벤트 발생 전");
		label.setHorizontalAlignment(JLabel.CENTER);
		add(label);
		
		bt= new JButton("버튼을 눌러보세요.");
		add(bt);
				
		setVisible(true);
		
		//컴포넌트에 객체 생성 후 컴포넌트 연결
		//버튼 클릭 시 이벤트 동작
		bt.addActionListener(new ActionHandler());
		
	}
	
	//클래스 내부에 내부(Inner) 클래스로 이벤트 리스너 객체화
	//Listener 인터페이스를 구현해서 메소드를 오버라이딩해서 구현 해줌 
	private class ActionHandler implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			//이벤트가 발생했을 때 실행할 내용 구현
			//다이얼로그박스(메시지박스) 띄어주기
			JOptionPane.showMessageDialog(null, "버튼을 누르셨습니다.");
			
			if(label.getText().equals("이벤트 발생 전")) {
			label.setText("이벤트 발생 후");
			} else {
			label.setText("이벤트 발생 전");	
			}
			
			

		}
	}
	
}
