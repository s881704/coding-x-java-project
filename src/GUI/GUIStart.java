package GUI;

import v1.Deck;

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

}
