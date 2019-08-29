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


	public class GUI4p extends JFrame implements ActionListener {
		GUI gui = new GUI();
		private JTextField textField_1;
		private JTextField textField;
		private JTextField textField_2;
		private JTextField textField_3;
		
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
			
			//Button
			JButton btnStart = new JButton("Start");
			btnStart.setBounds(27, 283, 85, 23);
			getContentPane().add(btnStart);
			
			JButton btnWager = new JButton("Wager");
			btnWager.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				}
			});
			btnWager.setBounds(259, 283, 85, 23);
			getContentPane().add(btnWager);
			
			JButton btnHit = new JButton("Hit");
			btnHit.setBounds(370, 283, 85, 23);
			getContentPane().add(btnHit);
			
			JButton btnReset = new JButton("Reset");
			btnReset.setBounds(370, 385, 85, 23);
			getContentPane().add(btnReset);
			
			//Show players' card
			JLabel lblNewLabel = new JLabel("Card Value");
			lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
			lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 16));
			lblNewLabel.setBounds(32, 327, 312, 81);
			getContentPane().add(lblNewLabel);}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		}
}
	
