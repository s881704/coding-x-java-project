package v1;

import java.util.ArrayList;

public class Board {
	private Deck deck;
	private ArrayList<Player> pList;
	private int turn;

	public Board(int m, int n) {
		this.deck = new Deck(m);
		this.pList = new ArrayList<Player>(n);
	}

	public void wager() {
		// 第i位玩家拿牌
		if (pList.get(turn).handvalue() > 21) {
			turn++;
			// 揭開手牌、印出爆牌
		}
		pList.get(turn).extraCard(deck.givecard());

	}

	public void dealerWager() {
		if (pList.get(0).handvalue() >= 17) {
		} else if (pList.get(0).handvalue() < 17) {
			pList.get(0).extraCard(deck.givecard());
			dealerWager();
		}
	}

	public void hit() {
		if (turn == pList.size()) {
			// 將第0位玩家設為dealer
			pList.set(0, new Dealer());
			// dealer.extraCard();
			//winLose();
		} else {
			turn++;
		}
	}

	public void clear() {
		for (int i = 0; i < pList.size(); i++) {
			pList.get(i).clearHand();
		}
		turn = 0;
	}

	public void sendCard() {
		// 發牌給每位玩家
		for (int i = 0; i < pList.size(); i++) {
			Player p = new Player();
			pList.add(p);
			pList.get(i).extraCard(deck.givecard());
			pList.get(i).extraCard(deck.givecard());
		}
	}

	public void printHandCard(int i) {
		// 第i位玩家的手牌
		pList.get(i).getHandcard();
	}
	
	public int printHandValue(int i) {
		int value = pList.get(i).handvalue();
		return value;
	}
	public void winLose(int i) {
		// 判斷輸贏
		if (pList.get(i).handvalue() > pList.get(0).handvalue()) {
			System.out.println();
		}
	}

}
