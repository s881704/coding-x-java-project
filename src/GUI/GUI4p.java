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
	int m , n;
	int i = 0;
	int turn = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GUI4p frame = new GUI4p(4,2);
		frame.setVisible(true);
		frame.setResizable(true);

	}
	public void initComponents(){
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        pack();
        setVisible(true);
    }

	public GUI4p(int m, int n) {
		this.m = m;
		this.n = n;
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
			
			//Button Listener
			btnStart.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					startGame(m, n);  //m,n���嚙踐�豯株雓���蕭鞊堆�蕭豲���嚙踝蕭豲嚙踝蕭� m,n
					printCard(0,textArea);
					printCard(1,textArea_1);
					printCard(2,textArea_2);
					printCard(3,textArea_3);
					
					String test = "<html><body>Player1 sum = " + printValue(1) + "<br/>" + "Player2 sum = "
							+ printValue(2) + "<br/>" + "Player3 sum = " + printValue(3) + "<br/>"
							+ "</body></html>";
							//���鞈察縑蝘批��嚙踝蕭��蕭豯佗蕭謚喉蕭蹎改蕭���嚙踝蕭謍單�蕭�嚙踝蕭�����嚙踝蕭謅�謑脣�����嚙踝蕭��蕭謢畸嚙賜�d value嚙踝蕭謅�謑剖��蕭������蕭嚙踐�蕭謅�嚙踐�nd value�����蕭 method
					lblNewLabel.setText(test);
					JOptionPane.showMessageDialog(null, "Player1 turn");
				}
			});

			//���蕭謏�����
			btnWager.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					wagerButton();
					printCard(0,textArea);
					printCard(1,textArea_1);
					printCard(2,textArea_2);
					printCard(3,textArea_3);
					String test = "<html><body>Player1 sum = " + printValue(1) + "<br/>" + "Player2 sum = "
							+ printValue(2) + "<br/>" + "Player3 sum = " + printValue(3) + "<br/>"
							+ "</body></html>";;
					lblNewLabel.setText(test);
				}
				
				/*{
					if (i == 0) {
						JOptionPane.showMessageDialog(null, "嚙踐郁頩�頩飭�嚙踝蕭��嚙踝蕭謢對蕭����蕭");
						wagerButton();
						textArea_1.setText("");
						printCard(1,textArea_1);
						String test = "<html><body>Player1 sum = " + printValue(1) + "<br/>" + "Player2 sum = "
								+ printValue(2) + "<br/>" + "Player3 sum = " + printValue(3) + "<br/>"
								+ "</body></html>";
						lblNewLabel.setText(test);
					}if (i == 1) {
						JOptionPane.showMessageDialog(null, "嚙踐郁頩�頩飭�嚙踝蕭��嚙踝蕭謢對蕭����蕭");						
						wagerButton();
						textArea_2.setText("");
						printCard(2,textArea_2);
						String test = "<html><body>Player1 sum = " + printValue(1) + "<br/>" + "Player2 sum = "
								+ printValue(2) + "<br/>" + "Player3 sum = " + printValue(3) + "<br/>"
								+ "</body></html>";;
						lblNewLabel.setText(test);
					}if (i == 2) {
						JOptionPane.showMessageDialog(null, "嚙踐郁頩�頩飭�嚙踝蕭��嚙踝蕭謢對蕭����蕭");						
						wagerButton();
						textArea_3.setText("");
						printCard(3,textArea_3);
						String test = "<html><body>Player1 sum = " + printValue(1) + "<br/>" + "Player2 sum = "
								+ printValue(2) + "<br/>" + "Player3 sum = " + printValue(3) + "<br/>"
								+ "</body></html>";;
						lblNewLabel.setText(test);
					}
				}*/
			});
			
			btnHit.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					if (turn<=2) {
						JOptionPane.showMessageDialog(null, "Next");
					}
					turn++;
					hitButton();
					printCard(0,textArea);
					printCard(1,textArea_1);
					printCard(2,textArea_2);
					printCard(3,textArea_3);
					String test = "<html><body>Player1 sum = " + printValue(1) + "<br/>" + "Player2 sum = "
							+ printValue(2) + "<br/>" + "Player3 sum = " + printValue(3) + "<br/>"
							+ "</body></html>";;
					lblNewLabel.setText(test);
					/*
					n++;
					if(n==3) {
						wagerButton(); //���蕭謘綽蕭�����蕭��嚙踝蕭嚙踝���蕭謏�����蕭��嚙踐ㄠ������蕭��嚙踝蕭��ler���蕭謏�����ㄟ���蕭�ass
		
						String test = "<html><body>Player1 sum = " + printValue(1) + "<br/>" + "Player2 sum = "
								+ printValue(2) + "<br/>" + "Player3 sum = " + printValue(3) + "<br/>"
								+ "</body></html>";;
						JOptionPane.showMessageDialog(null,test);
						winLose(1); //���嚙踐雓�I Class嚙踝蕭豲蕭謚喉蕭�嚙踐蝑��蕭��嚙踝蕭��hod
						winLose(2);
						winLose(3);					

					}*/
				}
			});
	
			btnReset.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					clear(); //���嚙踐雓�I Class嚙踝蕭豲蕭謚喉蕭�嚙踐蝑��蕭��嚙踝蕭��hod
					printCard(0,textArea);
					printCard(1,textArea_1);
					printCard(2,textArea_2);
					printCard(3,textArea_3);
					String test = "<html><body>Player1 sum = " + printValue(1) + "<br/>" + "Player2 sum = "
							+ printValue(2) + "<br/>" + "Player3 sum = " + printValue(3) + "<br/>"
							+ "</body></html>";;
					lblNewLabel.setText(test);
				}
			});		
			
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}


}
