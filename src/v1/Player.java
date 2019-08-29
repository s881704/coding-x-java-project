package v1;

import java.util.ArrayList;

<<<<<<< HEAD
public class Player extends Board{
	private Behavior behavior = new Behavior();

	
	
	
=======
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
	
	public int handvalue() {
		// 計算牌值
		int handvalue = 1;
		return handvalue;
	}
	
	
>>>>>>> master
}
