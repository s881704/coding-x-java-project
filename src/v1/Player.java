package v1;

import java.util.ArrayList;

<<<<<<< HEAD
public class Player extends Board{
	private Behavior behavior = new Behavior();

	
	
	
=======
public class Player {
	private ArrayList<Card> handcard ;
	
	
	public void extraCard() {
		//�s�P
	}

	public ArrayList<Card> getHandcard() {
		//���o��P
		return handcard;
	}
	public void clearHand() {
		//�M�Ť�P
	}
	
	public int handvalue() {
		// �p��P��
		int handvalue = 1;
		return handvalue;
	}
	
	
>>>>>>> master
}
