package v1;

import GUI.*;

public class Main {
	public void main(String[] args) {
		
		
	}
	
	public void selectGUI(int n) {
		GUIStart gui = new GUIStart();
		int num = gui.numOfpeople();
		switch(n) {
		case 2:
			GUI2p game2p = new GUI2p();
			break;
		
		}
	}
}
