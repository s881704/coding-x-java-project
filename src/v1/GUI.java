package v1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class GUI extends JFrame implements ActionListener {
	public GUI() {
	}

	public void initialBoard() {

		Board board = new Board();

	}
	
	public void selectGUI(int n) {
		switch (n) {
		case 2:
			GUI2p p2 = new GUI2p();
			break;
		case 3:
			GUI3p p3 = new GUI3p();
			break;
		case 4:
			GUI4p p4 = new GUI4p();
			break;

		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
