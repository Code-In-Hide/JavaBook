package java6.p53;

import java.awt.Frame;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PopupMenuTest {
	public static void main(String[] args) {
		Frame f = new Frame("PopupMenu Test");
		f.setSize(300, 200);
		
		PopupMenu pMenu = new PopupMenu("Edit");
		MenuItem miCut = new MenuItem("Cut");
		MenuItem miCapy = new MenuItem("Capy");
		MenuItem miPaste = new MenuItem("Paste");
		
		pMenu.add(miCut);
		pMenu.add(miCapy);
		pMenu.add(miPaste);
		
		f.add(pMenu);
		f.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent me) {
				if (me.getModifiersEx() == InputEvent.BUTTON3_DOWN_MASK) {
					pMenu.show(f, me.getX(), me.getY());
				}
			}
		});
		f.setVisible(true);pMenu.add(miCut);
	}
}
