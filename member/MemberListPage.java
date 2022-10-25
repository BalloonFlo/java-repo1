package member;

import java.awt.Font;
import javax.swing.JLabel;
import java.awt.TextField;
import java.awt.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
public class MemberListPage extends JFrame{
   List list;
   public MemberListPage() {
	JPanel jpm = new JPanel();
	
	JLabel l1 = new JLabel("회원관리 페이지", SwingConstants.CENTER);
	JLabel l2 = new JLabel("회원 목록");
	JLabel l3 = new JLabel("아이디 :");
	JLabel l4 = new JLabel("이름 :");
	JLabel l5 = new JLabel("비밀번호 : ");
	JLabel l6 = new JLabel("전화번호 :");
	JLabel l7 = new JLabel("아이디");
	JLabel l8 = new JLabel("이 름");
	JLabel l9 = new JLabel("비밀번호");
	JLabel l10 = new JLabel("전화번호");
	
	add(l1);
	add(l2);
	add(l3);
	add(l4);
	add(l5);
	add(l6);
	add(l7);
	add(l8);
	add(l9);
	add(l10);
	
	TextField t1 = new TextField();
	TextField t2 = new TextField();
	TextField t3 = new TextField();
	TextField t4 = new TextField();
	
	add(t1);
	add(t2);
	add(t3);
	add(t4);
	
	Font font1 = new Font("굴림체", Font.BOLD, 25);
	Font font2 = new Font("굴림체", Font.BOLD, 16);
	l1.setFont(font1);
	l2.setFont(font2);
	
	JButton save = new JButton("저 장");
	JButton delete = new JButton("삭 제");
	JButton update = new JButton("수 정");
	JButton search = new JButton("조 회");
	JButton reset = new JButton("지우기");
	JButton back = new JButton("뒤로가기");
	
	add(save);
	add(delete);
	add(update);
	add(search);
	add(reset);
	add(back);
	
	list = new List();//java.awt.List
	add(list);
	Font font3 = new Font("굴림체", 0, 15);
	list.setFont(font3);
	
	l1.setBounds(300, 30, 200, 40);
	l2.setBounds(50, 200, 80, 30);
	l3.setBounds(350, 100, 50, 30);
	l4.setBounds(350, 130, 50, 30);
	l5.setBounds(550, 100, 60, 30);
	l6.setBounds(550, 130, 60, 30);
	l7.setBounds(70, 230, 60, 25);
	l8.setBounds(250, 230, 60, 25);
	l9.setBounds(450, 230, 60, 25);
	l10.setBounds(650, 230, 60, 25);
	
	t1.setBounds(410, 100, 100, 30);
	t2.setBounds(410, 130, 100, 30);
	t3.setBounds(610, 100, 100, 30);
	t4.setBounds(610, 130, 100, 30);
	
	save.setBounds(240, 180, 100, 30);
	delete.setBounds(340, 180, 100, 30);
	update.setBounds(440, 180, 100, 30);
	search.setBounds(540, 180, 100, 30);
	reset.setBounds(640, 180, 100, 30);
	back.setBounds(650, 670, 100, 30);
	
	list.setBounds(50, 260, 700, 400);
	add(jpm);
	setSize(800, 700);
	setTitle("회원관리");
	setResizable(false);
	setLocationRelativeTo(jpm);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setVisible(true);
	
	
  }
}
