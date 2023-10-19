package java6.p07;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;

public class BorderTest {
	private Frame Frame;
	private Button center, west, east, south;
	private TextField tf1;

	public BorderTest() {
		Frame = new Frame("BorderLayout example");
		south = new Button("Button 1");
		west = new Button("Button 2");
		east = new Button("Button 3");
		center = new Button("Button 4");
		tf1 = new TextField();
		tf1.setText("입력창 입니다.");
	}

	public void startFrame() {
		Frame.add(tf1, "North");
		Frame.add(south, "South");
		Frame.add(west, "West");
		Frame.add(east, "East");
		Frame.add(center, "Center");
		Frame.setSize(400, 400);
		Frame.setVisible(true);
	}

	public static void main(String[] args) {
		BorderTest border = new BorderTest();
		border.startFrame();
	}
}
