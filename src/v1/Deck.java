package v1;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
	private ArrayList<Card> cards = new ArrayList<Card>();

	// 洗牌
	public void shuffle() {
		Collections.shuffle(cards);
	}

	public Card givecard() {
		Card temp = cards.get(0);
		cards.remove(0);
		return temp;
	}

	public ArrayList<Card> createDeck(int numofcards) {
		for (int a = 0; a < numofcards; a++) {
			for (int icon = 1; icon < 5; icon++) {
				int index = 0;
				String iconMask = "";
				// 初始化花色、字標
				if (icon == 1) {
					index = 0;
					iconMask = "♥";
				} else if (icon == 2) {
					index = 13;
					iconMask = "♦";
				} else if (icon == 3) {
					index = 26;
					iconMask = "♠";
				} else if (icon == 4) {
					index = 39;
					iconMask = "♣";
				}
				for (int i = index; i < index + 13; i++) {
					if (i == index + 0) {
						Card c = new Card("A", i - index + 11, icon, iconMask, true);
						cards.add(c);
					} else if (i > index && i < 10 + index) {
						Card c = new Card(String.valueOf(i + 1 - index), i - index + 1, icon, iconMask, true);
						cards.add(c);
					} else if (i >= 10 + index && i < 13 + index) {

						if (i == 10 + index) {
							Card c = new Card("J", 10, icon, iconMask, true);
							cards.add(c);
						} else if (i == 11 + index) {
							Card c = new Card("Q", 10, icon, iconMask, true);
							cards.add(c);
						} else if (i == 12 + index) {
							Card c = new Card("K", 10, icon, iconMask, true);
							cards.add(c);
						}
					}
				}
			}
		}

		return cards;
	}
}
