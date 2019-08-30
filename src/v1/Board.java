package v1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Board {
	private Deck deck;
	private ArrayList<Player> pList = new ArrayList<Player>();
	private int turn;

	/*
	 * public Board(int m, int n) { this.deck = new Deck(m); this.pList = new
	 * ArrayList<Player>(n); }
	 */
	public void getPlayer(int m) {
		for (int i = 0; i < m; i++) {
			Player p = new Player();
			pList.add(p);
		}
	}

	public void getDeck(int n) {
		deck = new Deck();
		deck.createDeck(n);
		deck.shuffle();
	}

	public void wager() {
		//拿牌
		pList.get(turn).extraCard(deck.givecard());
		//判斷是否爆牌，換下位玩家叫牌
		if (pList.get(turn).handvalue() > 21) {
			turn++;
		} 
		//判斷是否為最後一位玩家結束，換莊家叫牌
		if (turn == pList.size()) {
			dealerWager();
		}

	}
	//莊家叫牌規則
	public void dealerWager() {
		if (pList.get(0).handvalue() >= 17) {
		} else if (pList.get(0).handvalue() < 17) {
			pList.get(0).extraCard(deck.givecard());
			dealerWager();
		}
	}

	public void hit() {
		if (turn == pList.size()) {
			//判斷是否為最後一位玩家結束，換莊家叫牌
			dealerWager();
		} else {
			turn++;
		}
	}

	public void clear() {
		//清除所有人手牌
		for (int i = 0; i < pList.size(); i++) {
			pList.get(i).clearHand();
		}
		turn = 0;
	}

	public void sendCard() {
		// 發牌給每位玩家
		for (int i = 0; i < pList.size(); i++) {
			pList.get(i).extraCard(deck.givecard());
			pList.get(i).extraCard(deck.givecard());
		}
		turn = 1;
	}

	public ArrayList<Card> printHandCard(int i) {
		// 第i位玩家的手牌
		ArrayList<Card> card = pList.get(i).getHandcard();
		return card;
	}

	public int printHandValue(int i) {
		// 第i位玩家的牌值
		int value = pList.get(i).handvalue();
		return value;
	}

	public void winLose(int i) {
		// 判斷輸贏，直接跟莊家比
		/*
		if (pList.get(i).handvalue() > pList.get(0).handvalue()) {
			System.out.println();
		}
		*/
		
		if (pList.get(i).handvalue() <= 21 & pList.get(i).handvalue() > pList.get(0).handvalue()) {
			String A = pList.get(i).playername(i) + "Win to the dealer !";
			JOptionPane.showMessageDialog(null, A);
		}
		if (pList.get(i).handvalue() > 21 & pList.get(0).handvalue() <= 21) {
			String B = pList.get(i).playername(i) + "Lose to the dealer !";
			JOptionPane.showMessageDialog(null, B);
		}
		if (pList.get(i).handvalue() == pList.get(0).handvalue()) {
			String C = pList.get(i).playername(i) + "Flat to the dealer !";
			JOptionPane.showMessageDialog(null, C);
		}
		if (pList.get(0).handvalue() > 21 & pList.get(i).handvalue() > 21) {
			String D = pList.get(i).playername(i) + "Flat to the dealer !";
			JOptionPane.showMessageDialog(null, D);
		}
		if (pList.get(i).handvalue() <= 21 & pList.get(0).handvalue() > 21) {
			String E = pList.get(i).playername(i) + "Win to the dealer !";
			JOptionPane.showMessageDialog(null, E);
		}
		if (pList.get(i).handvalue() < 21 & pList.get(i).handvalue() < pList.get(0).handvalue() & pList.get(0).handvalue() <= 21) {
			String F = pList.get(i).playername(i) + "Lose to the dealer !";
			JOptionPane.showMessageDialog(null, F);
		}
	}

}
