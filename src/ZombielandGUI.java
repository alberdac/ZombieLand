/***********************************************************
 * Contains all the GUI components
 * 
 * @author Corey Alberda
 ***********************************************************/
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/***********************************************************
 * Contains all the GUI components
 ***********************************************************/
public class ZombielandGUI {
	
	JMenuBar menuBar;
	
	JMenu gameMenu;
	JMenuItem exitMenuItem;
	
	JMenu helpMenu;
	JMenuItem aboutMenuItem;
	JMenuItem helpMenuItem;
	
	ButtonListener buttonListener;

	/** JPanel for the GUI components */
	private JPanel gamePanel;

	/** JFrame to hold the JPanel */
	private JFrame frame;

	// Map components
	/** Array of cells to keep track of the cells data */
	private Building[][] mapCopy;

	//TableModel for the JTable
	DefaultTableModel model;

	/** Game */
	private ZombielandGame game;
	
	GridBagConstraints gbc;

	/***********************************************************
	 * Constructor that creates game and label array
	 ***********************************************************/
	public ZombielandGUI() {
		
		frame = new JFrame();
				
		//Build menuBar
		menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		//Build Game Menu
		gameMenu = new JMenu("Game");
		menuBar.add(gameMenu);
		
		exitMenuItem = new JMenuItem("Exit");
		exitMenuItem.addActionListener(buttonListener);
	    gameMenu.add(exitMenuItem);
	    
	    //Build Help Menu
	    helpMenu = new JMenu("Help");
		menuBar.add(helpMenu);
		
		aboutMenuItem = new JMenuItem("About");
		aboutMenuItem.addActionListener(buttonListener);
	    helpMenu.add(aboutMenuItem);
	    
	    helpMenuItem = new JMenuItem("Help");
		helpMenuItem.addActionListener(buttonListener);
	    helpMenu.add(helpMenuItem);
		
		
	    gamePanel = new JPanel(new GridBagLayout());
        
		//Makes new game
		game = new ZombielandGame();
		mapCopy = new Building[16][16];
		
		
		gbc = new GridBagConstraints();
		
		//Adds ResourcePanel
		gbc.gridx = 0;
    	gbc.gridy = 0;
    	gbc.weighty = 1.0;
    	gbc.weightx = 1.0;
    	gamePanel.add(new ResourcePanel(), gbc);
		
    	//Adds MapPanel
    	gbc.gridx = 0;
    	gbc.gridy = 1;
    	gbc.weighty = 1.0;
    	gbc.weightx = 1.0;
    	gamePanel.add(new MapPanel(game), gbc);
    	
    	//Adds MaterialsPanel
    	gbc.gridx = 0;
    	gbc.gridy = 2;
    	gbc.weighty = 1.0;
    	gbc.weightx = 1.0;
    	gamePanel.add(new MaterialsPanel(), gbc);
    	
		//Adds groupPanel
		gbc.gridx = 1;
    	gbc.gridy = 0;
    	gbc.weighty = 1.0;
    	gbc.weightx = 1.0;
    	gamePanel.add(new GroupPanel(), gbc);		
		
		
		frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		frame.add(gamePanel);
		frame.setVisible(true);
	}
	
	/***********************************************************
	 * Buttonlistener to listen to the buttons clicked and
	 * perform the appropriate action.
	 ***********************************************************/
	private class ButtonListener implements ActionListener {

		public void actionPerformed(ActionEvent arg) {

			if (arg.getSource() == exitMenuItem) {
				System.exit(0);
			}	
			if (arg.getSource() == aboutMenuItem) {
				System.exit(0);
			}
			if (arg.getSource() == helpMenuItem) {
				System.exit(0);
			}
		}
	}
	
	
	/***********************************************************
	 * MAIN ***
	 ***********************************************************/
	public static void main(String[] args) {
		new ZombielandGUI();
	}
}

