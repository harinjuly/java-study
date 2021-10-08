package gui2;

import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Test03 {

	public static void main(String[] args) {
		// 회원 가입 창 만들기
		
		JFrame mf = new JFrame("회원가입");
		mf.setLocationRelativeTo(null); // 화면 중앙에 뜨도록
		mf.setSize(400,500);
//		mf.setBounds(500,500,500,600);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setLayout(null);
		
		//로고 이미지
		JLabel imageLabel;
		try {
		Image logo = ImageIO.read(new File("C:\\Users\\user\\programming\\workspace\\day30\\src\\resources\\회원가입1.png"));
		imageLabel = new JLabel(new ImageIcon(logo));
		} catch (IOException e) {
			imageLabel = new JLabel("이미지로딩실패");
		}
		imageLabel.setBounds(10,10,95,89);
		mf.add(imageLabel);
		
		//제목
		JLabel label = new JLabel("회원 가입");
		label.setBounds(150,10,200,100);
		label.setFont(new Font("맑은 고딕", Font.BOLD,40));
		mf.add(label);
		
		//아이디 입력창
				
		JLabel le;
		le = new JLabel("아이디 : ");
		le.setFont(new Font("맑은 고딕",Font.BOLD,20));
		le.setBounds(20,100,100,50);
		JTextField id = new JTextField(20);
		id.setBounds(120,120,150,30);
		mf.add(le);
		mf.add(id);		
		
		Font Font20 = new Font("맑은 고딕",Font.BOLD,20);
		
		le = new JLabel("이름 : ");
		le.setBounds(20,130,100,50);
		le.setFont(Font20);
		JTextField name = new JTextField(10);
		name.setBounds(120,150,150,30);
		mf.add(le);
		mf.add(name);
		
		
		le = new JLabel("비밀번호 : ");
		le.setFont(Font20);
		le.setBounds(20,160,100,50);
		JPasswordField pass = new JPasswordField(10);
		pass.setBounds(120,180,150,30);
		mf.add(le);
		mf.add(pass);
			
		le = new JLabel("전화번호 : ");
		le.setFont(Font20);
		le.setBounds(20,190,100,50);
		JTextField call = new JTextField(10);
		call.setBounds(120,210,150,30);
		mf.add(le);
		mf.add(call);
		
		//지역(콤보박스)
		le = new JLabel("지역 : ");
		le.setFont(Font20);
		le.setBounds(20,140,100,250);
		String [] list = {"서울시","경기도","충청도","경상도"};
		JComboBox<String> combo = new JComboBox<>(list);
		combo.setBounds(120,250,150,30);
		mf.add(le);
		mf.add(combo);
		
		//성별(라디오)
		le = new JLabel("성별 : ");
		le.setFont(Font20);
		le.setBounds(20,150,100,300);
		JRadioButton rb1 = new JRadioButton("여자"); 
		JRadioButton rb2 = new JRadioButton("남자");
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		rb1.setBounds(120,300,80,30);
		rb2.setBounds(200,300,80,30);
		mf.add(rb1);
		mf.add(rb2);
		mf.add(le);
		
		//관심분야(체크박스)
		le = new JLabel("관심분야 : ");
		le.setFont(Font20);
		le.setBounds(20,230,100,250);
		JCheckBox cb1 = new JCheckBox("JAVA");
		JCheckBox cb2 = new JCheckBox("DB");
		JCheckBox cb3 = new JCheckBox("WEB");
		cb1.setBounds(130,350,70,30);
		cb2.setBounds(200,350,70,30);
		cb3.setBounds(270,350,70,30);
		mf.add(le);
		mf.add(cb1);
		mf.add(cb2);
		mf.add(cb3);
		
		//가입하기
		JButton sub = new JButton("가입하기");
		sub.setFont(Font20);
		sub.setBounds(100,400,200,50);
		mf.add(sub);
		
		
		mf.setVisible(true);
		
	}

}
