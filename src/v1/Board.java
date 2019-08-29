package v1;

import java.util.ArrayList;

public class Board {
	private Deck deck;
	private ArrayList<Player> pList;
	private int turn;

	public void setup() {
		// 取得牌堆
		int n = 0;
		deck = new Deck(n);
		// 玩家創建
		pList = new ArrayList<Player>();
	}

	public void wager() {
		// 第i位玩家拿牌
		deck.givecard();
		pList.get(turn).extraCard();
	}

	public void hit() {
		if (turn == pList.size()) {
			winLose();
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
	}

	public void printHandCard() {
		// 第i位玩家的手牌
		int i = 1;
		pList.get(i).getHandcard();
	}

	public void winLose() {
		// 判斷輸贏
	}

}
