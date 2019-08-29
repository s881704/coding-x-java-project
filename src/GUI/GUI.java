package GUI;

import v1.Board;
import v1.Player;

public abstract class GUI {
<<<<<<< HEAD
	
	
	public void doStartGame() {
		
	}
	public void donextRound() {
		
	}
	public void dohit() {
		
	}
	public void dowager() {
=======
	private Board board;

	public void startGame(int m, int n) {
		board = new Board(m,n);
	}

	public void hitButton() {
		board.hit();
	}

	public void wagerButton() {
		board.wager();
	}

	public void nextRound() {
		board.clear();
	}

	public void printCard() {
		board.printHandCard();
	}
	
	public void printValue() {
>>>>>>> master
		
	}
}
