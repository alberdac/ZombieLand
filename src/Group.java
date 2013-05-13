import java.util.*;

public class Group {
	
	/**Array of survivors*/
	ArrayList<Survivor> survivors;
	
	/**total skill probability of a group*/
	int skillProbability = 0;
	
	/**location of a group*/
	Building groupLocation;
	
	/***********************************************************
	 * Constructor that creates group
	 ***********************************************************/
	public Group(){
		survivors = new ArrayList<Survivor>();
	}
	
	/***********************************************************
	 * Constructor that creates group
	 ***********************************************************/
	public Group(Building location){
		survivors = new ArrayList<Survivor>();
	}
	
	/***********************************************************
	 * Adds survivor and updates group info
	 ***********************************************************/
	public void addSurvivor(Survivor newSurvivor){
		survivors.add(newSurvivor);
		updateGroupProbability();
	}
	
	/***********************************************************
	 * updates groups probability
	 ***********************************************************/
	public void updateGroupProbability(){
		for(int x = 0; x<survivors.size(); x++){
			skillProbability = 0; //Temp reset to 0
			skillProbability += survivors.get(x).getSurvSkill();
		}
	}
}






