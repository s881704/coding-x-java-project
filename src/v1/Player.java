package v1;

import java.util.ArrayList;

public class Player {
	private ArrayList<Card> handcard ;
	
	
	public void extraCard() {
		//叫牌
	}

	public ArrayList<Card> getHandcard() {
		//取得手牌
		return handcard;
	}
	public void clearHand() {
		//清空手牌
	}
	
	public int valueCalculate() {
		// 計算牌值
		int handvalue = 1;
		return handvalue;
	}
	
	
}
