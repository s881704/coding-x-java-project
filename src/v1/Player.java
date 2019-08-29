package v1;

import java.util.ArrayList;

public class Player {
	private ArrayList<Card> handcard;

	public void extraCard(Card card) {
		// �s�P
		handcard.add(card);
	}

	public ArrayList<Card> getHandcard() {
		// ���o��P
		return handcard;
	}

	public void clearHand() {
		// �M�Ť�P
		handcard.clear();
	}

	public int handvalue() {
		// �p��P��
		int sum = 0;
		int ace = 0;
		for (int j = 0; j < handcard.size(); j++) {
			sum = sum + handcard.get(j).getValue();
			if (handcard.get(j).getMask().equals("A")) {
				ace++;
			}
		}
		if (sum > 21 && ace > 0) {
			for (int i = 0; sum > 21; i++) {
				sum = sum - i * 10;
			}
		}
		return sum;
	}
}
