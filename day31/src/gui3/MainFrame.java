 package gui3;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MainFrame extends JFrame {
	
	private static final long serialVersionUID = -1730869195445042544L;
	
	JLabel label;
	JTextField id;
	JPasswordField pass;
	JButton sub;
	
	Font font15 = new Font("맑은 고딕",Font.BOLD,15);
	
	public MainFrame() {
		super("로그인");
		
		// - 컨테이너 설정 메소드 사용
		setLocationRelativeTo(null);
		setSize(300, 400);
		super.setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		
		label = new JLabel("로그인");
		label.setFont(new Font("맑은 고딕",Font.BOLD,30));
		label.setHorizontalAlignment(JLabel.CENTER);
		label.setBounds(0,0,300,100);
		add(label);
		
		label = new JLabel("아이디 : ");
		label.setFont(font15);
		label.setBounds(20,100,80,30);
		add(label);
		
		id = new JTextField(20);
		id.setBounds(100,100,180,30);
		add(id);
		
		label = new JLabel("암호 : ");
		label.setFont(font15);
		label.setBounds(20,150,80,30);
		add(label);
		
		pass = new JPasswordField(20);
		pass.setBounds(100,150,180,30);
		add(pass);
		
		sub= new JButton("로그인");
		sub.setBounds(100,200,100,50);
		add(sub);
			
		
		setVisible(true);
	}
	
		
	
}
