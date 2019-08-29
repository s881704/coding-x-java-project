package v1;

import java.util.ArrayList;

public class Player {
	private ArrayList<Card> handcard = new ArrayList<Card>();

	public void extraCard(Card card) {
		// 叫牌
		handcard.add(card);
	}

	public ArrayList<Card> getHandcard() {
		// 取得手牌
		return handcard;
	}

	public void clearHand() {
		// 清空手牌
		handcard.clear();
	}

	public int handvalue() {
		// 計算牌值
		int sum = 0;
		int ace = 0;
		for (int j = 0; j < handcard.size(); j++) {
			sum = sum + handcard.get(j).getValue();
			if (handcard.get(j).getMask().equals("A")) {
				ace++;
			}
		}
		//判斷A為11 or 1
		if (sum > 21 && ace > 0) {
			for (int i = 0; sum > 21 && ace>0; i++) {
				sum = sum -  10;
				ace--;
			}
		}
		return sum;
	}
}
