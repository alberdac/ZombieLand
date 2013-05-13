import javax.swing.*;

import java.awt.*;

public class ResourcePanel extends JPanel {    

	JLabel healthLabel, moraleLabel, waterLabel, foodLabel, ammoLabel, powerLabel;
	
    public ResourcePanel(){
    	
    	Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		setLayout(new GridLayout(1,6));
		setBackground(Color.LIGHT_GRAY);
		
		healthLabel = new JLabel("Health (0)");
		moraleLabel = new JLabel("Morale (0)");
		waterLabel = new JLabel("Water (0)");
		foodLabel = new JLabel("Food (0)");
		ammoLabel = new JLabel("Ammo (0)");
		powerLabel = new JLabel("Power (0)");
		
		add(healthLabel);
		add(moraleLabel);
		add(waterLabel);
		add(foodLabel);
		add(ammoLabel);
		add(powerLabel);
		
    }

}


