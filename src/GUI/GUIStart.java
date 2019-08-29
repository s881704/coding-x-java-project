package GUI;

import v1.Deck;
<<<<<<< HEAD
import GUI.GUI2p;
=======
>>>>>>> master

public class GUIStart {

	public int numOfpeople() {
		// Scanner
		int num = 0;
		return num;
	}
	
	public int  numOfDeck() {
		int num = 0;
		return num;
	}
<<<<<<< HEAD
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
=======
	
	public void selectGUI() {
		GUI gui;
		switch (numOfpeople()) {
		case 2:
			gui = new GUI2p();
			break;
		case 3:
			gui = new GUI3p();
			break;
		}

		gui.startGame(numOfpeople(),numOfDeck());
	}

>>>>>>> master
}
