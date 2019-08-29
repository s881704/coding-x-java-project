package v1;

import java.util.ArrayList;

public class Board {
	private Deck deck ;
	private ArrayList<Player> pList ;
	private int turn;

	public Board(int m ,int n) {
		this.deck= new Deck(m);
		this.pList = new ArrayList<Player>(n);
	}

	public void setup() {
		// ���o�P��
		int n = 0;
		deck = new Deck(n);
		// ���a�Ы�
		pList = new ArrayList<Player>();
	}

	public void wager() {
		// ��i�쪱�a���P
		deck.givecard();
		if (pList.get(turn).handvalue() > 21) {
			turn++;
			// ���}��P�B�L�X�z�P
		}
		pList.get(turn).extraCard();
	}

	public void hit() {
		if (turn == pList.size()) {
			pList.get(0);
			// pList(0) �qplayer�令Dealer
			//dealer.extraCard();
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
		// �o�P���C�쪱�a
	}

	public void printHandCard() {
		// ��i�쪱�a����P
		int i = 1;
		pList.get(i).getHandcard();
	}

	public void winLose() {
		// �P�_��Ĺ
	}

}
