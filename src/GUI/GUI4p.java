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

public class GUI4p extends GUI {
	int m, n;
	int i = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GUI4p frame = new GUI4p();
		frame.setVisible(true);
		frame.setResizable(true);

	}

	private GUI4p() {
			getContentPane().setLayout(null);
			// setBounds(100, 100, 515, 415);
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
			String name0 = "Player0";
			String name1 = "Player1";
			String name2 = "Player2";
			String name3 = "Player3";
			JButton btnStart = new JButton("Start");
			btnStart.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					startGame(m, n);  //m,n��神�憭銝����nt m,n
					printCard(name0,textArea);
					printCard(name1,textArea_1);
					printCard(name2,textArea_2);
					printCard(name3,textArea_3);
					
					String test = "<html><body>Player1 sum = " + printValue(name1) + "<br/>" + "Player2 sum = "
							+ printValue(name2) + "<br/>" + "Player3 sum = " + printValue(name3) + "<br/>"
							+ "</body></html>";
							//����神瘜��身憿舐內��嚗＊蝷箏�摰逸and value嚗�UI�銝hand value��� method
					lblNewLabel.setText(test);
					JOptionPane.showMessageDialog(null, "�摰�1������");
				}
			});
			btnStart.setBounds(27, 283, 85, 23);
			getContentPane().add(btnStart);

			//����
			JButton btnWager = new JButton("Wager");
			btnWager.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (i == 0) {
						JOptionPane.showMessageDialog(null, "雿���撘萇��");
						wagerButton();
						textArea_1.setText("");
						printCard(name1,textArea_1);
						String test = "<html><body>Player1 sum = " + printValue(name1) + "<br/>" + "Player2 sum = "
								+ printValue(name2) + "<br/>" + "Player3 sum = " + printValue(name3) + "<br/>"
								+ "</body></html>";
						lblNewLabel.setText(test);
					}if (i == 1) {
						JOptionPane.showMessageDialog(null, "雿���撘萇��");						
						wagerButton();
						textArea_2.setText("");
						printCard(name2,textArea_2);
						String test = "<html><body>Player1 sum = " + printValue(name1) + "<br/>" + "Player2 sum = "
								+ printValue(name2) + "<br/>" + "Player3 sum = " + printValue(name3) + "<br/>"
								+ "</body></html>";;
						lblNewLabel.setText(test);
					}if (i == 2) {
						JOptionPane.showMessageDialog(null, "雿���撘萇��");						
						wagerButton();
						textArea_3.setText("");
						printCard(name3,textArea_3);
						String test = "<html><body>Player1 sum = " + printValue(name1) + "<br/>" + "Player2 sum = "
								+ printValue(name2) + "<br/>" + "Player3 sum = " + printValue(name3) + "<br/>"
								+ "</body></html>";;
						lblNewLabel.setText(test);
					}
				}
			});
			btnWager.setBounds(259, 283, 85, 23);
			getContentPane().add(btnWager);
			
			
			JButton btnHit = new JButton("Hit");
			btnWager.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null, "銝�雿摰嗉���");
					n++;
					if(n==3) {
						wagerButton(); //�ㄐ���振�������ealer����lass
		
						String test = "<html><body>Player1 sum = " + printValue(name1) + "<br/>" + "Player2 sum = "
								+ printValue(name2) + "<br/>" + "Player3 sum = " + printValue(name3) + "<br/>"
								+ "</body></html>";;
						JOptionPane.showMessageDialog(null,test);
						winLose(name1); //��GUI Class銝剜憓��ethod
						winLose(name2);
						winLose(name3);					

					}
				}
			});
			btnHit.setBounds(370, 283, 85, 23);
			getContentPane().add(btnHit);
			
			
			JButton btnReset = new JButton("Reset");
			btnWager.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					clear(); //��GUI Class銝剜憓��ethod
				}
			});
			btnReset.setBounds(370, 385, 85, 23);
			getContentPane().add(btnReset);
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}
}
