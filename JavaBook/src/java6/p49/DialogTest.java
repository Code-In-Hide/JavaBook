package java6.p49;

import java.awt.Button;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class DialogTest {
	public static void main(String[] args) {
		Frame f = new Frame("Parnet");
		f.setSize(300, 200);
		Dialog info = new Dialog(f, "Infromation", true);
		info.setSize(140, 90);
		info.setLocation(50, 50);
		info.setLayout(new FlowLayout());
		
		Label msg = new Label("This is modal Dilog", Label.CENTER);
		Button ok = new Button("OK");
		info.add(msg);
		info.add(ok);
		
		f.setVisible(true);
		info.setVisible(true);
	}
}
