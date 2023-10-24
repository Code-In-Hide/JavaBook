package java6.p401;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.geom.Area;
import java.util.ArrayList;

public class TextFieldTest extends WindowAdapter implements ActionListener {
	private Frame f, mf;
	private Button login, b1, b2, b3, b4, Register;
	TextField id, pwd;
	Label Lab_1;
	private MemberDAO dao;

	public TextFieldTest() {
		dao = new MemberDAO();
		f = new Frame("Login");
		f.setSize(450, 135);
		f.setLayout(null);
		f.setBackground(Color.LIGHT_GRAY);
		f.addWindowListener(this);

		mf = new Frame("Main");
		mf.setSize(900, 600);
		mf.setLayout(null);
		mf.setBackground(Color.pink);
		mf.addWindowListener(this);

		b1 = new Button("뚜");
		b1.setBounds(375, 300, 50, 50);
		b2 = new Button("치");
		b2.setBounds(425, 300, 50, 50);
		b3 = new Button("따");
		b3.setBounds(475, 300, 50, 50);
		b4 = new Button("쨍!!!");
		b4.setBounds(525, 300, 50, 50);

		login = new Button("Login");
		login.setBackground(Color.CYAN);
		login.setBounds(370, 35, 60, 50);
		login.addActionListener(this);

		Register = new Button("Register");
		Register.setBackground(Color.CYAN);
		Register.setBounds(370, 90, 60, 30);
		Register.addActionListener(this);

		Label lid = new Label("ID : ", Label.RIGHT);
		lid.setBounds(60, 35, 25, 25);
		Label lpwd = new Label("Password : ", Label.RIGHT);
		lpwd.setBounds(10, 60, 75, 25);

		id = new TextField();
		id.setBounds(90, 35, 250, 22);
		id.setBackground(Color.lightGray);
		id.setForeground(Color.DARK_GRAY);
		pwd = new TextField();
		pwd.setBounds(90, 60, 250, 22);
		pwd.setBackground(Color.lightGray);
		pwd.setForeground(Color.DARK_GRAY);
		Lab_1 = new Label();
		Lab_1.setBounds(90, 90, 250, 30);
		Lab_1.setBackground(Color.lightGray);
		pwd.setEchoChar('*');

		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.add(Lab_1);
		f.add(login);
		f.add(Register);
		f.setVisible(true);
		mf.add(b1);
		mf.add(b2);
		mf.add(b3);
		mf.add(b4);
		mf.setVisible(false);
	}

	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Login")) {
			if (!id.getText().equals("") && !pwd.getText().equals("")) {
				ArrayList<MemberVo> ar = dao.list(id.getText());
				if (ar.size() != 0 && ar.get(0).getPwd().equals(pwd.getText())) {
					Lab_1.setText("로그인이 되었습니다.");
					mf.setVisible(true);
					f.setVisible(false);
				} else {
					Lab_1.setText("아이디 비밀번호가 틀림");
				}
			} else {
				Lab_1.setText("틀렸습니다.");
			}
		} else if (e.getActionCommand().equals("Register")) {
			Lab_1.setText("지금은 회원가입을 할수 업습니다.");
		}
	}

	public static void main(String[] args) {
		TextFieldTest tft = new TextFieldTest();
	}
}
