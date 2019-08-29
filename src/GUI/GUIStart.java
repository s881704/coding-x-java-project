package GUI;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import v1.Deck;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;

import javax.swing.*;


public class GUIStart extends JFrame implements ActionListener {

	private static int people;
	private static int deck;
	public static void main(String[] args) {
		GUIStart frame = new GUIStart();
		frame.setVisible(true);
		frame.setResizable(false);
	}
	

    public void initComponents(){
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
        setVisible(true);
    }
	public GUIStart() {
		initComponents();
		setBounds(100, 100, 400, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JTextField peotextField = new JTextField();
		peotextField.setBounds(110, 30, 96, 34);
		getContentPane().add(peotextField);
		peotextField.setColumns(10);

		
		
		JButton btnPeopleButton = new JButton("People");
		btnPeopleButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String peo = peotextField.getText();
				people = Integer.valueOf(peo);
				
			
			}
		});
		btnPeopleButton.setBounds(210, 30, 96, 23);
		getContentPane().add(btnPeopleButton);
		
		JLabel lblPeopleNumber = new JLabel("People number");
		lblPeopleNumber.setBounds(10, 30, 90, 15);
		getContentPane().add(lblPeopleNumber);
		
		
		JTextField decktextField = new JTextField();
		decktextField.setBounds(110, 74, 96, 34);
		getContentPane().add(decktextField);
		decktextField.setColumns(10);
	
		
		
		JButton btnDeckButton = new JButton("Deck");
		btnDeckButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String de = decktextField.getText();
				deck = Integer.valueOf(de);
			
			}
		});
		btnDeckButton.setBounds(210, 74, 96, 23);
		getContentPane().add(btnDeckButton);
		
		JLabel lblDeckNumber = new JLabel("Deck number");
		lblDeckNumber.setBounds(10, 74, 90, 15);
		getContentPane().add(lblDeckNumber);
		
		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				GUIStart.selectGUI();
				
			}
		});
		btnOK.setBounds(312, 30, 62, 67);
		getContentPane().add(btnOK);
	}

	public int numOfpeople() {
		return people;
	}
	
	public int  numOfDeck() {
		return deck;
	}
	
	public static void selectGUI() {
		//System.out.println("Good");
		switch (people) {
		case 3:
			//System.out.println("33");
			//GUI3p gui3 = new GUI3p();
			//gui = new GUI3p();
			break;
		case 4:
			GUI gui = new GUI4p();
			gui.setVisible(true);
			gui.setResizable(true);
			break;
		}

		//gui.startGame(numOfpeople(),numOfDeck());
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
