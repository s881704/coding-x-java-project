package GUI;

import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import v1.Board;
import v1.Player;

public class GUI {
	private Board board;
	private Player player;
	public GUI() {
		
	}

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

	public void printCard(String name, JTextArea textArea) {
		board.printHandCard();
	}
	
	public void printValue(String name) {
		System.out.println(player.handvalue());
	}
	
	public void winLose(String name) {
		board.winLose();
	}
	
	public void clear() {
		board.clear();
	}
}
