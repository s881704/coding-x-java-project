package GUI;

import v1.Deck;
import GUI.GUI2p;

public class GUIStart {
	public int numOfpeople() {
		//Scanner
		int num =0;
		return num;
	}
	public int numOfDeck() {
		//Scanner
		int num =0;
		Deck deck = new Deck(num);
		return num;
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
