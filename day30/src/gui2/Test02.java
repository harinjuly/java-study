package gui2;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class Test02 {

	public static void main(String[] args) {
		//다양한 컨포넌트 활용 방법
		
		JFrame mf = new JFrame("컴포넌트 활용");
		
		mf.setLocationRelativeTo(null);
		mf.setSize(500,500);
		mf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mf.setLayout(null);
		
		// 이미지 넣기
		JLabel imageLabel;
		try {
			Image logo = ImageIO.read(new File("C:\\Users\\user\\programming\\workspace\\day30\\src\\resources\\kh_logo.jpg"));
			imageLabel = new JLabel(new ImageIcon(logo));
		} catch (IOException e) {
			imageLabel = new JLabel("이미지 로딩 실패");
		}
		imageLabel.setBounds(100,50,165,37);
		mf.add(imageLabel);
		
		//글씨체 변경
		JLabel label = new JLabel("KH정보교육원");
		label.setBounds(0,100,500,100);
		label.setFont(new Font("맑은 고딕",Font.BOLD,35)); //글씨체, 크기 변경
		label.setHorizontalAlignment(JLabel.CENTER); // 정렬
		label.setForeground(Color.blue);
		mf.add(label);		
		
		// 콤보 박스
		// - 개강 월 선택
		String [] list = {"2월","3월","4월"};		
		JComboBox<String> combo = new JComboBox<>(list);
		combo.setBounds(100,200,100,30);
		mf.add(combo);
		
		//라디오 버튼(중복체크 불가능)
		// - 과정 선택
		JRadioButton rbt1 = new JRadioButton("자바");
		JRadioButton rbt2 = new JRadioButton("보안");
		//그룹을 만들어서 묶어준다. (중복선택이 불가하게)
		ButtonGroup bg = new ButtonGroup();
		bg.add(rbt1);
		bg.add(rbt2);
		//화면에 배치할 때는 컴포넌트별로 배치해줌.
		rbt1.setBounds(100,250,100,30);
		rbt2.setBounds(200,250,100,30);
		mf.add(rbt1);
		mf.add(rbt2);
				
		
		//체크 박스(중복체크 가능)
		// - 사전 지식 선택
		JCheckBox cb1 = new JCheckBox("JAVA");
		JCheckBox cb2 = new JCheckBox("Oracle");
		JCheckBox cb3 = new JCheckBox("HTML");
		cb1.setBounds(100,300,100,30);
		cb2.setBounds(200,300,100,30);
		cb3.setBounds(300,300,100,30);
		mf.add(cb1);
		mf.add(cb2);
		mf.add(cb3);
		
		mf.setVisible(true);
		
		

	}

}
