import java.awt.*;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class MaterialsPanel extends JPanel {    

	JLabel woodLabel, metalLabel, glassLabel;

	public MaterialsPanel(){

		setLayout(new GridLayout(1,3));
		setBackground(Color.LIGHT_GRAY);

		woodLabel = new JLabel("   Wood (0)  ");
		metalLabel = new JLabel("   Metal (0)  ");
		glassLabel = new JLabel("   Glass (0)  ");

		add(woodLabel);
		add(metalLabel);
		add(glassLabel);

	}

}