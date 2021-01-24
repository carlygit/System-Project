/*version 07.06.2020 
 * Algorithms and Data Structures Assessment (Part B)
 * Class name: SystemTestGUI
 */

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
	
	//Inheritance from SystemTest Class and implementation of ActionListener interface.
	public class SystemTestGUI extends SystemTest implements ActionListener 
	{ 
			private JPanel panel;
			private JLabel label;
			private JFrame frame;
			private JButton choice1, choice2, choice3, choice4, choice5;
			
			int clicks = 0; //Click counter to test functionality of JButtons.
			
			
	public SystemTestGUI()
		{ 
			//JButton creation to create push buttons in the JFrame.
			choice1 = new JButton("1) Print System Details");
			choice2 = new JButton("2) Display System Properties");
			choice3 = new JButton("3) Diagnose System");
			choice4 = new JButton("4) Set Details");
			choice5 = new JButton("5) Quit");
			
			//Action listeners to action the event that occurs when the user clicks on the JButtons.
			choice1.addActionListener(this);
			choice2.addActionListener(this);
			choice3.addActionListener(this);
			choice4.addActionListener(this);
			choice5.addActionListener(this);
			
			//JLabel creation to display a short string.
			label = new JLabel("Click counter " + clicks);
			
			//JPanel to set the container and add the JButtons and JLabel.
			panel = new JPanel();
			panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
			panel.setLayout(new GridLayout(0, 1));
			panel.add(choice1);
			panel.add(choice2);
			panel.add(choice3);
			panel.add(choice4);
			panel.add(choice5);
			panel.add(label);
			
			//JFrame (top level window, border and title bar) created to add the JPanel, which contains all of the other components.
			frame = new JFrame();
			frame.add(panel, BorderLayout.CENTER);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setTitle("System 2020");
			frame.pack();
			frame.setVisible(true);
			
	}     
	//Main methods below.	
	public static void main(String[] args) {

		new SystemTestGUI();
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		clicks++;
		label.setText("Click counter: " + clicks);

	}
}