package v1;

public class GUI {

	public void initialBoard() {

		Board board = new Board();

	}
	
	public void selectGUI(int n) {
		switch (n) {
		case 2:
			GUI2p p2 = new GUI2p();
			break;
		case 3:
			GUI3p p3 = new GUI3p();
			break;
		case 4:
			GUI4p p4 = new GUI4p();
			break;

		}
	}
}
