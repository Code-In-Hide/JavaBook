package java6.p18;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventTest implements ActionListener{
	private Frame f;
	private Button btu1, btu2, btu3, btu4, btu5;

	public EventTest() {
		f = new Frame("event handler example");
		btu1 = new Button("Button1");
		btu2 = new Button("Button2");
		btu3 = new Button("Button3");
		btu4 = new Button("Button4");
		btu5 = new Button("Button5");
	}

	public void startFrame() {
		btu1.addActionListener(this);
		btu2.addActionListener(this);
		btu3.addActionListener(this);
		btu4.addActionListener(this);
		btu5.addActionListener(this);

		f.add(btu1, "North");
		f.add(btu2, "South");
		f.add(btu3, "West");
		f.add(btu4, "East");
		f.add(btu5, "Center");
		
		f.setSize(300, 300);
		f.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand(). equals("Button1")) {
			System.out.println("Button 1 Click!");
		}
		if (e.getActionCommand(). equals("Button2")) {
			System.out.println("Button 2 Click!");
		}
		if (e.getActionCommand(). equals("Button3")) {
			System.out.println("Button 3 Click!");
		}
		if (e.getActionCommand(). equals("Button4")) {
			System.out.println("Button 4 Click!");
		}
		if (e.getActionCommand(). equals("Button5")) {
			System.out.println("Button 5 Click!");
		}
	}
	public static void main(String[] args) {
		EventTest g = new EventTest();
		g.startFrame();
	}
}
