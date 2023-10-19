package java6.p51;

import java.awt.FileDialog;
import java.awt.Frame;

public class Main {
	public static void main(String[] args) {
		Frame f = new Frame("Parent");
		f.setSize(300, 200);
		
		FileDialog fileOpen = new FileDialog(f, "file Open", FileDialog.LOAD);
		
		f.setVisible(true);
		fileOpen.setDirectory("c:\\Windows");
		fileOpen.setVisible(true);
		
		System.out.println(fileOpen.getDirectory() + fileOpen.getFile());
	}
}
