package movie;

import java.awt.Font;
import java.awt.Label;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ManagerPg extends JFrame {

	public ManagerPg() {
		
		JPanel jpmp = new JPanel();
		
		Label title = new Label("관리자페이지", SwingConstants.CENTER);
		add(title);
		
		Font font1 = new Font("고딕체", Font.BOLD, 15);
		Font font2 = new Font("고딕체", Font.BOLD, 30);
		title.setFont(font2);
		
		title.setBounds(150, 10, 1000, 65);
		
		JButton j1 = new JButton("회원 관리");
		JButton j2 = new JButton("영화정보관리");
		JButton j3 = new JButton("예약관리");
		JButton j4 = new JButton("로그아웃");
		add(j1); add(j2); add(j3); add(j4);
		
		j1.setBounds(165, 100, 150, 40);
		j2.setBounds(165, 150, 150, 40);
		j3.setBounds(165, 200, 150, 40);
		j4.setBounds(165, 370, 150, 30);
		
		add(jpmp);
		setSize(500, 450);
		setLocationRelativeTo(jpmp);
		setResizable(false);
		setTitle("Manager-Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);

	}

}
