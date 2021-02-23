/**
 * GUIConverter class contains a method that constructs and shows a GUI,
 * as well as event handler methods that react to user's interaction with GUI.
 * Main method creates instance of GUIConverter and calls constructAndShowGUI method.
 * 
 * File: GUIConverter.java
 * Course: CMIS 242/6382
 * @author  Olivia-Mei McDowell
 * @version 2020-09 (4.17.0)
 * Date: 2-23-2021
 * IDE: Eclipse
 */

// import required Java classes
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GUIConverter {

	//The ActionListener for each Converter button should create the appropriate
	//Converter child instance, set the input, and call its convert() method

	/** Temperature conversion event handler */
	private static class TempHandler implements ActionListener {
		
		private JFrame subFrame = null; // create sub-frame for dialog box
		private String tempInputStr = null; // initialize string variable to hold temp input

		/** Sets up sub-frame for JOptionPane */
		public TempHandler(JFrame frame) {
			subFrame = frame;
		}

		/** 
		 * ActionListener for temperature converter button that
		 * creates the appropriate converter child instance
		 * sets the input, and calls its overridden convert() method
		 */
		public void actionPerformed(ActionEvent e) {
			
			double tempInput = 0;
			boolean invalidInput;
			
			do {
				invalidInput = true;
				tempInputStr = JOptionPane.showInputDialog(subFrame, "Input fahrenheit temperature to convert", 
															"Temperature Input", 
															JOptionPane.QUESTION_MESSAGE);
				
				if((tempInputStr != null) && (tempInputStr.length() > 0)) {
					try {
						tempInput = Double.parseDouble(tempInputStr);
						invalidInput = false;
						break;
					} catch (NumberFormatException ex) {
						invalidInput = true;
						JOptionPane.showMessageDialog(subFrame, "INVALID INPUT", 
														"Message", JOptionPane.ERROR_MESSAGE);
					}
				}
				else if ((tempInputStr == null) || (tempInputStr.length() <= 0)) {
					Converter tempConversionObj = new TemperatureConverter();
					JOptionPane.showMessageDialog(subFrame, "INPUT IS NULL\n" + 
													tempInput + " F equals " + tempConversionObj.convert() + " C", 
													"Message", JOptionPane.WARNING_MESSAGE);
					return; // exits the method if this condition is met
				}
			} while(invalidInput = true);
			Converter tempConversionObj = new TemperatureConverter(tempInput);
			JOptionPane.showMessageDialog(subFrame, tempInput + " F equals " + tempConversionObj.convert() + " C",
											"Message", JOptionPane.INFORMATION_MESSAGE);
		}
	} // end temperature event handler
	
	/** Exit event handler */
	private static class ExitHandler implements ActionListener {
		// action listener that exists program on click
		public void actionPerformed(ActionEvent e) {
			System.exit(0);
		}
	} // end exit event handler
	
	/** Distance conversion event handler */
	private static class DistanceHandler implements ActionListener {

		private JFrame window = null; // create sub-frame for dialog box
		private String distInputStr = null; // initialize string variable to hold distance input
  
		/** Sets up sub-frame for JOptionPane */
		public DistanceHandler(JFrame frame) {
			window = frame;
		}
	
		/** 
		 * ActionListener for distance converter button that
		 * creates the appropriate converter child instance
		 * sets the input, and calls its overridden convert() method
		 * 
		 */
		public void actionPerformed(ActionEvent e) {
			
			double distanceInput = 0;
			boolean invalidInput;
			
			do {
				invalidInput = true;
				distInputStr = JOptionPane.showInputDialog(window, "Input miles distance to convert", 
															"Distance Input", JOptionPane.QUESTION_MESSAGE);
			
				if((distInputStr != null) && (distInputStr.length() > 0)) {
					try {
						distanceInput = Double.parseDouble(distInputStr);
						invalidInput = false;
						break;
					} catch (NumberFormatException ex) {
						invalidInput = true;
						JOptionPane.showMessageDialog(window, "INVALID INPUT", 
														"Message", JOptionPane.ERROR_MESSAGE);
					}
				}
				else if ((distInputStr == null) || (distInputStr.length() <= 0)) {
					Converter distConversionObj = new DistanceConverter();
					JOptionPane.showMessageDialog(window, "INPUT IS NULL\n" + 
													distanceInput + " mi equals " + distConversionObj.convert() + " km", 
													"Message", JOptionPane.WARNING_MESSAGE);
					return; // exits the method if this condition is met
				}
			} while(invalidInput = true);
			Converter distConversionObj = new DistanceConverter(distanceInput);
			JOptionPane.showMessageDialog(window, distanceInput + " mi equals " + distConversionObj.convert() + " km",
											"Message", JOptionPane.INFORMATION_MESSAGE);
		}
	} // end distance event handler

	/** Creates GUI and makes it visible */
	public void constructAndShowGUI() {
		
		// create temperature button and pad with empty border
		JButton tempButton = new JButton("Temperature Converter");
		tempButton.setBorder(BorderFactory.createCompoundBorder(
								BorderFactory.createLineBorder(Color.GRAY),
								BorderFactory.createEmptyBorder(10, 10, 10, 10)));
		// create distance button and pad with empty border
		JButton distanceButton = new JButton("Distance Converter");
		distanceButton.setBorder(BorderFactory.createCompoundBorder(
									BorderFactory.createLineBorder(Color.GRAY),
									BorderFactory.createEmptyBorder(10, 10, 10, 10)));
		// creates exit button and pad with empty border
		JButton exitButton = new JButton("Exit");
		exitButton.setBorder(BorderFactory.createCompoundBorder(
								BorderFactory.createLineBorder(Color.GRAY),
								BorderFactory.createEmptyBorder(10, 10, 10, 10)));

		// creates main window frame
		JFrame mainFrame = new JFrame("CONVERTER");
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // user default close functionality
		
		// creates panel
		JPanel panelContainer = new JPanel();
		panelContainer.setLayout(new BorderLayout());
		
		// creates action listener instances and add them to buttons
		TempHandler tempListener = new TempHandler(mainFrame);
		tempButton.addActionListener(tempListener);
		DistanceHandler distListener = new DistanceHandler(mainFrame);
		distanceButton.addActionListener(distListener);
		ExitHandler exitListener = new ExitHandler();
		exitButton.addActionListener(exitListener);
		
		// adds buttons to panel and set their location
		panelContainer.add(tempButton, BorderLayout.EAST);
		panelContainer.add(distanceButton, BorderLayout.WEST);
		panelContainer.add(exitButton, BorderLayout.PAGE_END);

		// sets up main window frame
		mainFrame.setContentPane(panelContainer); // setup content pane
		mainFrame.setSize(300,150); // sets main frame size
		mainFrame.setVisible(true); // makes main frame visible
	}
	
	
	/** Creates instance of GUIConverter and calls constructAndShowGUI method. */
	public static void main(String[] args) {
		GUIConverter test = new GUIConverter(); // creates instance of GUIConverter
		test.constructAndShowGUI();	// calls constructAndShowGUI method
	}
}