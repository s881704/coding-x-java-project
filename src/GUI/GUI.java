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
	private Board board ;
	private Player player;
	public GUI frame;
	JButton btnStart = new JButton("Start");
	JButton btnWager = new JButton("Wager");
	JButton btnHit = new JButton("Hit");
	JButton btnReset = new JButton("Reset");
	
	//建構基本按鍵
	public GUI() {
		getContentPane().setLayout(null);
		// setBounds(100, 100, 515, 415);
		setBounds(100, 100, 505, 475);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		btnStart.setBounds(27, 283, 85, 23);
		getContentPane().add(btnStart);

		btnWager.setBounds(259, 283, 85, 23);
		getContentPane().add(btnWager);

		btnHit.setBounds(370, 283, 85, 23);
		getContentPane().add(btnHit);

		btnReset.setBounds(370, 385, 85, 23);
		getContentPane().add(btnReset);
		
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clear(); //��GUI Class銝剜憓��ethod
			}
		});
	}
	
	public void startGame(int m, int n) {
		board = new Board();
		board.getPlayer(4);
		board.getDeck(2);
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

	public void printCard(int i , JTextArea textArea) {
		textArea.setText("");
		if (i == 0) {
			textArea.append("*" + " , ");
			for (int j = 1; j < board.printHandCard(i).size(); j++) {
				textArea.append(
						board.printHandCard(i).get(j).getIconMask() +board.printHandCard(i).get(j).getMask() + " , ");
			}
		} else {
			for (int j = 0; j < board.printHandCard(i).size(); j++) {
				textArea.append(
						board.printHandCard(i).get(j).getIconMask() + board.printHandCard(i).get(j).getMask() + " , ");
			}
		}
	}
	
	public String printValue(int i) {
		String s = "";
		if (board.printHandValue(i)<=21) {
		s = Integer.toString(board.printHandValue(i));
		}
		else if (board.printHandValue(i)>21) {
			s = "busted";
		}
		return s;
	}

	public void winLose(int i) {
		board.winLose(i);
	}

	public void clear() {
		board.clear();
	}
}
