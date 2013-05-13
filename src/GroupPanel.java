import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.*;

public class GroupPanel extends JPanel {    

	GridBagConstraints gbc;
	
	/** panel to hold group components */
	JPanel buttonGroupPanel;
	
	/** group selector */
	JRadioButton group1Button,group2Button,group3Button;
	
	/** jtable to show all survivors */
	JTable survivorTable;
	
	
    public GroupPanel(){
    	setLayout(new GridBagLayout());
    	setBackground(Color.DARK_GRAY);
    	setVisible(true);
    	
    	gbc = new GridBagConstraints();

    	// JRadioButton group
    	buttonGroupPanel = new JPanel();
    	buttonGroupPanel.setLayout(new GridLayout(1,3));
    	group1Button = new JRadioButton("Group 1");
    	group2Button = new JRadioButton("Group 2");
    	group3Button = new JRadioButton("Group 3");
    	buttonGroupPanel.add(group1Button);
    	buttonGroupPanel.add(group2Button);
    	buttonGroupPanel.add(group3Button);
    	buttonGroupPanel.setPreferredSize(new Dimension (300,20));
    	
    	gbc.gridx = 0;
    	gbc.gridy = 0;
    	gbc.gridheight = 1;
    	add(buttonGroupPanel, gbc);
    	
    	
    }

}


