/***********************************************************
 * Game has all the unique game attributes 
 ***********************************************************/
public class ZombielandGame {
	
	/** Map */
	Map map;
	
	/** Group 1 */
	Group group1;	
	/** Group 2 */	
	Group group2;	
	/** Group 3 */
	Group group3;
	
	/** Resource Values */
	int health = 100;
	int morale = 100;
	int food = 0;
	int water = 0;
	int power = 0;
	int ammo = 0;
	
	int wood = 0;
	int metal = 0;
	int glass = 0;
	
	
	/***********************************************************
	 * Constructor that creates new game
	 ***********************************************************/
	public ZombielandGame(){
		//makes new map
		map = new Map();
		
		//creates three groups
		group1 = new Group();
		group2 = new Group();
		group3 = new Group();
		
		//Makes player's survivor
		Survivor you = new Survivor("New","Player",'M',20);
		group1.addSurvivor(you);
		//Places you in the starting location (a house)
		map.getBuildingMap()[map.getStartX()][map.getStartY()].setSurvivors(group1);
	}
	
	public Map getMap(){
		return map;
	}
	
	
}




