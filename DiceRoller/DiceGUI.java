package diceRollerGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;
import java.awt.event.ActionEvent;

import diceRoll.*;

public class DiceGUI {

	private JFrame frame;
	private JTextField txtNumDie;
	
	public static int rollDice(int numDie, String die) {
		int rand;
		
		switch(die) {
		case "d4": rand = 4;
			break;
		case "d6": rand = 6;
			break;
		case "d8": rand = 8;
			break;
		case "d10": rand = 10;
			break;
		case "d12": rand = 12;
			break;
		case "d20": rand = 20;
			break;
		case "d100": rand = 100;
			break;
		default: rand = 0;
			break;
		}
		
		if(rand == 0) {
			System.out.println("--Error with dice selection--");
			return 0;
		}
		
		int result = 0;
		for (int i = 0; i < numDie; i++) {
			int temp = ThreadLocalRandom.current().nextInt(2, rand + 1);
			result += temp;
		}
		
		return result;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiceGUI window = new DiceGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DiceGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblHeader = new JLabel("Dice Roller");
		lblHeader.setBounds(190, 23, 60, 14);
		frame.getContentPane().add(lblHeader);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(32, 50, 371, 2);
		frame.getContentPane().add(separator);
		
		JLabel lblRoll = new JLabel("Roll");
		lblRoll.setBounds(204, 71, 46, 14);
		frame.getContentPane().add(lblRoll);
		
		txtNumDie = new JTextField();
		txtNumDie.setBounds(190, 95, 46, 20);
		frame.getContentPane().add(txtNumDie);
		txtNumDie.setColumns(10);
		
		JButton btnD4 = new JButton("d4");
		btnD4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numDie = Integer.parseInt(txtNumDie.getText());
				JOptionPane.showMessageDialog(null, "Result: " + rollDice(numDie, "d4"));
			}
		});
		btnD4.setBounds(89, 123, 89, 23);
		frame.getContentPane().add(btnD4);
		
		JButton btnD6 = new JButton("d6");
		btnD6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numDie = Integer.parseInt(txtNumDie.getText());
				JOptionPane.showMessageDialog(null, "Result: " + rollDice(numDie, "d6"));
			}
		});
		btnD6.setBounds(89, 157, 89, 23);
		frame.getContentPane().add(btnD6);
		
		JButton btnD8 = new JButton("d8");
		btnD8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numDie = Integer.parseInt(txtNumDie.getText());
				JOptionPane.showMessageDialog(null, "Result: " + rollDice(numDie, "d8"));
			}
		});
		btnD8.setBounds(89, 191, 89, 23);
		frame.getContentPane().add(btnD8);
		
		JButton btnD12 = new JButton("d12");
		btnD12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numDie = Integer.parseInt(txtNumDie.getText());
				JOptionPane.showMessageDialog(null, "Result: " + rollDice(numDie, "d12"));
			}
		});
		btnD12.setBounds(244, 123, 89, 23);
		frame.getContentPane().add(btnD12);
		
		JButton btnD20 = new JButton("d20");
		btnD20.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numDie = Integer.parseInt(txtNumDie.getText());
				JOptionPane.showMessageDialog(null, "Result: " + rollDice(numDie, "d20"));
			}
		});
		btnD20.setBounds(244, 157, 89, 23);
		frame.getContentPane().add(btnD20);
		
		JButton btnD100 = new JButton("d100");
		btnD100.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numDie = Integer.parseInt(txtNumDie.getText());
				JOptionPane.showMessageDialog(null, "Result: " + rollDice(numDie, "d100"));
			}
		});
		btnD100.setBounds(244, 191, 89, 23);
		frame.getContentPane().add(btnD100);
		
		JButton btnD10 = new JButton("d10");
		btnD10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int numDie = Integer.parseInt(txtNumDie.getText());
				JOptionPane.showMessageDialog(null, "Result: " + rollDice(numDie, "d10"));
			}
		});
		btnD10.setBounds(89, 225, 89, 23);
		frame.getContentPane().add(btnD10);
		
		JButton btnClose = new JButton("Close");
		btnClose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnClose.setBounds(244, 225, 89, 23);
		frame.getContentPane().add(btnClose);
	}
	
}
