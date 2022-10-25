package movie;

import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import member.MemberDAO;

public class JoinMember extends JFrame{
	
	public JoinMember() {
		JPanel p = new JPanel();
		setLocationRelativeTo(p);
		Label l1 = new Label("Id");
		Label l2 = new Label("Name");
		Label l3 = new Label("Password");
		Label l4 = new Label("PhoneNumber");
		add(l1);
		add(l2);
		add(l3);
		add(l4);
		
		TextField t1 = new TextField();
		TextField t2 = new TextField();
		TextField t3 = new TextField();
		TextField t4 = new TextField();
		add(t1);
		add(t2);
		add(t3);
		add(t4);
		t3.setEchoChar('*');
		
		JButton b1 = new JButton("save");
		JButton b2 = new JButton("cancel");
		JButton b3 = new JButton("check");
		add(b1);
		add(b2);
		add(b3);
		
		l1.setBounds(40, 10, 40, 40);
		l2.setBounds(40, 50, 40, 40);
		l3.setBounds(40, 90, 60, 40);
		l4.setBounds(40, 130, 40, 40);
		
		t1.setBounds(120, 10, 200, 30);
		t2.setBounds(120, 50, 200, 30);
		t3.setBounds(120, 90, 200, 30);
		t4.setBounds(120, 130, 200, 30);
		
		b1.setBounds(125, 330, 80, 30);
		b2.setBounds(240, 330, 80, 30);
		b3.setBounds(350, 10, 100, 30);
		
		add(p);
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		//저장버튼에 대한 이벤트 처리
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//1단계. 텍스트 상자에서 값을 가지고 온다.
				//2단계. DB에 연결하기.
				//3단계. DB 안에 넣어주기.
				String Id = t1.getText();
				String Name = t2.getText();
				String Password = t3.getText();
				String PhoneNumber = t4.getText();
				//DB 연결 담담 클래스 MemberDAO()
				MemberDAO dao = new MemberDAO();
				//dao 안에 데이터 삽입을 담당할 메소드 구현하기
				dao.insertMember(Id, Name, Password, PhoneNumber);
				JOptionPane.showMessageDialog(null, "회원가입 되었습니다.");
				Login login = new Login();
				dispose();
			}
		});
		
		//취소버튼에 대한 이벤트 처리
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//취소버튼을 누르면 회원가입창이 닫히고 로그인화면이 나오게 하기
				Login login = new Login();
				dispose();
				
			}
		});

		//Id중복체크버튼에 대한 이벤트 처리
		b3.addActionListener(new ActionListener() {
			MemberDAO dao = new MemberDAO();
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String Id = t1.getText(); //화면에서 id를 입력한 것을 받아서
				if (dao.checkId(Id) == true) {
					JOptionPane.showMessageDialog(null, "사용중인 아이디입니다.");
					t1.setText("");
				} else {
					JOptionPane.showMessageDialog(null, "사용가능한 아이디입니다.");
				}
			}
		});
	}
	
}
