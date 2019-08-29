package GUI;

import javax.swing.JTextArea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import v1.Board;
import v1.Player;

public abstract class GUI extends JFrame implements ActionListener  {
	private Board board;
	private Player player;
	public GUI frame;
	JButton btnStart = new JButton("Start");
	JButton btnWager = new JButton("Wager");
	JButton btnHit = new JButton("Hit");
	JButton btnReset = new JButton("Reset");
	
	public GUI() {
		getContentPane().setLayout(null);
		// setBounds(100, 100, 515, 415);
		setBounds(100, 100, 505, 475);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JButton btnStart = new JButton("Start");
		btnStart.setBounds(27, 283, 85, 23);
		getContentPane().add(btnStart);
		JButton btnWager = new JButton("Wager");
		btnWager.setBounds(259, 283, 85, 23);
		getContentPane().add(btnWager);
		JButton btnHit = new JButton("Hit");
		btnHit.setBounds(370, 283, 85, 23);
		getContentPane().add(btnHit);
		JButton btnReset = new JButton("Reset");
		btnReset.setBounds(370, 385, 85, 23);
		getContentPane().add(btnReset);
	}

	public void startGame(int m, int n) {
		board = new Board(m, n);
		board.sendCard();
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

	public String printValue(String name) {
		System.out.println(player.handvalue());
		String s = Integer.toString(player.handvalue());
		return s;
	}

	public void winLose(String name) {
		board.winLose();
	}

	public void clear() {
		board.clear();
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
