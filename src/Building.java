import javax.swing.ImageIcon;

/**********************************************************************
 * Contains all the methods to access and alter data held by a cell
 * 
 * @author Corey Alberda
 *********************************************************************/
public class Building {
	
	BType BldgType;
	//int BlngSize;
	Boolean BlngCleared;
	Group survivors;
	int BlngPOA;
	int BlngRisk;
	int BlngHealth;
	int BlngFood;
	int BlngWater;
	int BlngAmmo;
	int BlngPower;
	int BlngWood;
	int BlngMetal;
	int BlngGlass;
	int BlngX;
	int BlngY;
	
	
	public static final ImageIcon FireDepartment_ICON = new ImageIcon("src/ICONS/FireDepartment.jpg");
	public static final ImageIcon Greenhouses_ICON = new ImageIcon("src/ICONS/Greenhouses.jpg");
	public static final ImageIcon Hospital_ICON = new ImageIcon("src/ICONS/Hospital.jpg");
	public static final ImageIcon Intersection_ICON = new ImageIcon("src/ICONS/Intersection.jpg");
	public static final ImageIcon notNull_ICON = new ImageIcon("src/ICONS/notNull.jpg");
	public static final ImageIcon PoliceDepartment_ICON = new ImageIcon("src/ICONS/PoliceDepartment.jpg");
	public static final ImageIcon StreetH_ICON = new ImageIcon("src/ICONS/StreetH.jpg");
	public static final ImageIcon StreetV_ICON = new ImageIcon("src/ICONS/StreetV.jpg");
	public static final ImageIcon WaterTreatmentPlant_ICON = new ImageIcon("src/ICONS/WaterTreatmentPlant.jpg");
	public static final ImageIcon Park_ICON = new ImageIcon("src/ICONS/Park.jpg");
	public static final ImageIcon BallField_ICON = new ImageIcon("src/ICONS/BallField.jpg");
	public static final ImageIcon Pond_ICON = new ImageIcon("src/ICONS/Pond.jpg");
	public static final ImageIcon Trees_ICON = new ImageIcon("src/ICONS/Trees.jpg");
	public static final ImageIcon Cemetary_ICON = new ImageIcon("src/ICONS/Cemetary.jpg");
	public static final ImageIcon EmptyLot_ICON = new ImageIcon("src/ICONS/EmptyLot.jpg");
	public static final ImageIcon Clinic_ICON = new ImageIcon("src/ICONS/Clinic.jpg");
	public static final ImageIcon PoliceOutpost_ICON = new ImageIcon("src/ICONS/PoliceOutpost.jpg");
	public static final ImageIcon WaterTower_ICON = new ImageIcon("src/ICONS/WaterTower.jpg");
	public static final ImageIcon FireStation_ICON = new ImageIcon("src/ICONS/FireStation.jpg");
	public static final ImageIcon House1_ICON = new ImageIcon("src/ICONS/House1.jpg");
	public static final ImageIcon Shop1_ICON = new ImageIcon("src/ICONS/Shop1.jpg");
	
	
	/****************************************************************
	 * Building Constructor (Empty)
	 ****************************************************************/
	public Building(){
		
	}

	public BType getBlngType() {
		return BldgType;
	}

	public Boolean getBlngCleared() {
		return BlngCleared;
	}

	public int getBlngProbOfAttack() {
		return BlngPOA;
	}

	public int getBlngProbRisk() {
		return BlngRisk;
	}

	public void setBldgType(BType bldgType) {
		BldgType = bldgType;
	}

//	public void setBlngSize(int blngSize) {
//		BlngSize = blngSize;
//	}

	public void setBlngCleared(Boolean blngCleared) {
		BlngCleared = blngCleared;
	}

	public void setSurvivors(Group survivors) {
		this.survivors = survivors;
	}

	public void setBlngProbOfAttack(int blngProbOfAttack) {
		BlngPOA = blngProbOfAttack;
	}

	public void setBlngProbRisk(int blngProbRisk) {
		BlngRisk = blngProbRisk;
	}

	

}