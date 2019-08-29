package GUI;

import java.awt.event.ActionEvent;
import java.awt.EventQueue;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.*;


public class GUI4p extends GUI {
	int m = 4, n;
	int i = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GUI4p frame = new GUI4p();
		frame.setVisible(true);
		frame.setResizable(true);

	}
	public void initComponents(){
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
        setVisible(true);
    }

	public GUI4p() {
			initComponents();
			setBounds(100, 100, 505, 475);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			getContentPane().setLayout(null);
			//TextArea
			JTextArea textArea = new JTextArea();
			textArea.setBounds(27, 26, 338, 42);
			getContentPane().add(textArea);
			
			JTextArea textArea_1 = new JTextArea();
			textArea_1.setBounds(27, 90, 338, 42);
			getContentPane().add(textArea_1);
			
			JTextArea textArea_2 = new JTextArea();
			textArea_2.setBounds(27, 154, 338, 42);
			getContentPane().add(textArea_2);
			
			JTextArea textArea_3 = new JTextArea();
			textArea_3.setBounds(27, 217, 338, 42);
			getContentPane().add(textArea_3);
			
			//Label
			JLabel lblDealer = new JLabel("Dealer");
			lblDealer.setFont(new Font("Arial", Font.PLAIN, 16));
			lblDealer.setBounds(399, 26, 56, 36);
			getContentPane().add(lblDealer);
			
			JLabel lblPlayer = new JLabel("Player1");
			lblPlayer.setFont(new Font("Arial", Font.PLAIN, 16));
			lblPlayer.setBounds(399, 96, 56, 36);
			getContentPane().add(lblPlayer);
			
			JLabel lblPlayer_1 = new JLabel("Player2");
			lblPlayer_1.setFont(new Font("Arial", Font.PLAIN, 16));
			lblPlayer_1.setBounds(399, 160, 56, 36);
			getContentPane().add(lblPlayer_1);
			
			JLabel lblPlayer_2 = new JLabel("Player3");
			lblPlayer_2.setFont(new Font("Arial", Font.PLAIN, 16));
			lblPlayer_2.setBounds(399, 223, 56, 36);
			getContentPane().add(lblPlayer_2);
			
			//Show players' card
			JLabel lblNewLabel = new JLabel("Card Value");
			lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
			lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 16));
			lblNewLabel.setBounds(32, 327, 312, 81);
			getContentPane().add(lblNewLabel);
			
			//Button

			btnStart.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					startGame(m, n);  //m,n嚙踝蕭�蟡蕭謓剜謖�豰�蕭嚙踝蕭��蕭��t m,n
					printCard(name0,textArea);
					printCard(name1,textArea_1);
					printCard(name2,textArea_2);
					printCard(name3,textArea_3);
					
					String test = "<html><body>Player1 sum = " + printValue(1) + "<br/>" + "Player2 sum = "
							+ printValue(2) + "<br/>" + "Player3 sum = " + printValue(3) + "<br/>"
							+ "</body></html>";
							//嚙踝蕭賹秧嚙踝蕭������嚙踝蕭��澈���嚙踝蕭��嚗蝞蕭����筠nd value��嚙踝�I嚙踝����and value嚙踝蕭嚙� method
					lblNewLabel.setText(test);
					JOptionPane.showMessageDialog(null, "嚙踐�嚙�1嚙踝蕭��蕭��蕭蹓踝蕭嚙�");
				}
			});

			//嚙踝�蕭嚙踝蕭
			btnWager.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (i == 0) {
						JOptionPane.showMessageDialog(null, "�蹎∴蕭蹓綽蕭��蕭���蕭嚙�");
						wagerButton();
						textArea_1.setText("");
						printCard(1,textArea_1);
						String test = "<html><body>Player1 sum = " + printValue(1) + "<br/>" + "Player2 sum = "
								+ printValue(2) + "<br/>" + "Player3 sum = " + printValue(3) + "<br/>"
								+ "</body></html>";
						lblNewLabel.setText(test);
					}if (i == 1) {
						JOptionPane.showMessageDialog(null, "�蹎∴蕭蹓綽蕭��蕭���蕭嚙�");						
						wagerButton();
						textArea_2.setText("");
						printCard(2,textArea_2);
						String test = "<html><body>Player1 sum = " + printValue(1) + "<br/>" + "Player2 sum = "
								+ printValue(2) + "<br/>" + "Player3 sum = " + printValue(3) + "<br/>"
								+ "</body></html>";;
						lblNewLabel.setText(test);
					}if (i == 2) {
						JOptionPane.showMessageDialog(null, "�蹎∴蕭蹓綽蕭��蕭���蕭嚙�");						
						wagerButton();
						textArea_3.setText("");
						printCard(3,textArea_3);
						String test = "<html><body>Player1 sum = " + printValue(1) + "<br/>" + "Player2 sum = "
								+ printValue(2) + "<br/>" + "Player3 sum = " + printValue(3) + "<br/>"
								+ "</body></html>";;
						lblNewLabel.setText(test);
					}
				}
			});

			btnWager.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "���蕭������蕭蹓踝蕭嚙�");
					n++;
					if(n==3) {
						wagerButton(); //嚙踐��蕭嚙踐�蕭���嚙踝�蕭嚙踝�蕭�嚙踐播嚙踐�蕭��aler嚙踝�蕭嚙踝嚙踝�ass
		
						String test = "<html><body>Player1 sum = " + printValue(1) + "<br/>" + "Player2 sum = "
								+ printValue(2) + "<br/>" + "Player3 sum = " + printValue(3) + "<br/>"
								+ "</body></html>";;
						JOptionPane.showMessageDialog(null,test);
						winLose(name1); //嚙踝蕭�謓胃UI Class�����筐嚙踐�蕭��thod
						winLose(name2);
						winLose(name3);					

					}
				}
			});
	
			btnWager.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					clear(); //嚙踝蕭�謓胃UI Class�����筐嚙踐�蕭��thod
				}
			});		
			
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


}
