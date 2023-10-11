package java6.p40;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextFieldTest implements ActionListener{
	private Frame f;
	private Button login;
	TextField id;
	TextField pwd;
	TextField trueandfalse;
	public TextFieldTest() {
		f = new Frame("Login");
		f.setSize(450, 130);
		f.setLayout(null);

		login = new Button("Login");
		login.setBackground(Color.CYAN);
		login.setBounds(375, 30, 60, 50);
		login.addActionListener(this);

		Label lid = new Label("ID : ", Label.RIGHT);
		lid.setBounds(60, 30, 25, 25);
		Label lpwd = new Label("Password : ", Label.RIGHT);
		lpwd.setBounds(10, 55, 75, 25);

		id = new TextField();
		id.setBounds(90, 32, 250, 20);
		pwd = new TextField();
		pwd.setBounds(90, 57, 250, 20);
		trueandfalse = new TextField();
		trueandfalse.setBackground(Color.pink);
		trueandfalse.setBounds(20, 90, 410, 20);
		pwd.setEchoChar('*');

		f.add(lid);
		f.add(id);
		f.add(lpwd);
		f.add(pwd);
		f.add(trueandfalse);
		f.add(login);
		f.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		if (id.getText().equals("hello") && pwd.getText().equals("1234")) {
			trueandfalse.setText("로그인 되었습니다.");
		} else {
			trueandfalse.setText("아이디 비밀번호가 틀림");
		}
	}

	public static void main(String[] args) {
		TextFieldTest tft = new TextFieldTest();
	}
}
