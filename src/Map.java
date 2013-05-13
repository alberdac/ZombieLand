
import java.util.*;


/***********************************************************
 *@author Corey Alberda
 ***********************************************************/

public class Map {

	/** Array of cells */
	private Building[][] buildingMap;
	
	/** Starting location of first survivor */
	int startX;
	int startY;


	/***********************************************************
	 * Constructor: Makes and fills map
	 ***********************************************************/
	public Map() {
		buildingMap = new Building[22][22];
		fillMap();
	}

	/***********************************************************
	 * Fills map with certain amount of streets and buildings
	 * 
	 * Should place the following:
	 * streets                                           ***DONE
	 * one of each of the sustainable 2x2 buildings      ***DONE
	 * one of each of the sustainable 1x1 buildings      ***DONE
	 * Some morale boosting buildings
	 * 5 empty lots
	 * houses
	 * shops
	 * 
	 ***********************************************************/
	private void fillMap(){
		//Creates a building in each location on the map;
		for(int x=0;x<=15;x++){
			for(int y=0;y<=15;y++){
				buildingMap[x][y] = new Building();
			}
		}	
		placeStreets();
		place2x2SustainableBuildings();
		place1x1SustainableBuildings();
		placeOtherBuildings();
	}

	/***********************************************************
	 * Places the streets on the map
	 ***********************************************************/
	private void placeStreets(){

		for(int x=0;x<=15;x++){
			for(int y=0;y<=15;y=y+3){
				buildingMap[x][y].setBldgType(BType.StreetBackslash); //Place vertical streets
			}
		}
		for(int x=0;x<=15;x=x+3){
			for(int y=0;y<=15;y++){
				buildingMap[x][y].setBldgType(BType.StreetSlash); //Place horizontal streets
			}
		}
		for(int x=0;x<=15;x=x+3){
			for(int y=0;y<=15;y=y+3){
				buildingMap[x][y].setBldgType(BType.StreetIntersection); //Place intersections
			}
		}	
	}

	/***********************************************************
	 * Places 2x2 Buildings
	 ***********************************************************/
	private void place2x2SustainableBuildings(){
		//Place large buildings
		int count=0;
		Random rand = new Random();
		//Place Hospital
		while(count<1){

			int X =((rand.nextInt(5) + 1)*3-2);
			int Y =((rand.nextInt(5) + 1)*3-1);
			if(buildingMap[X][Y].getBlngType()==null){
				buildingMap[X][Y].setBldgType(BType.Hospital);
				buildingMap[X+1][Y].setBldgType(BType.notNull);
				buildingMap[X][Y-1].setBldgType(BType.notNull);
				buildingMap[X+1][Y-1].setBldgType(BType.notNull);
				count++;
			}
		}
		//Place FireDepartment
		while(count<2){
			int X = ((rand.nextInt(5) + 1)*3-2);
			int Y = ((rand.nextInt(5) + 1)*3-1);
			if(buildingMap[X][Y].getBlngType()==null){
				buildingMap[X][Y].setBldgType(BType.FireDepartment);
				buildingMap[X+1][Y].setBldgType(BType.notNull);
				buildingMap[X][Y-1].setBldgType(BType.notNull);
				buildingMap[X+1][Y-1].setBldgType(BType.notNull);
				count++;
			}
		}
		//Place FireDepartment
		while(count<3){
			int X = ((rand.nextInt(5) + 1)*3-2);
			int Y = ((rand.nextInt(5) + 1)*3-1);
			if(buildingMap[X][Y].getBlngType()==null){
				buildingMap[X][Y].setBldgType(BType.Greenhouses);
				buildingMap[X+1][Y].setBldgType(BType.notNull);
				buildingMap[X][Y-1].setBldgType(BType.notNull);
				buildingMap[X+1][Y-1].setBldgType(BType.notNull);
				count++;
			}
		}
		//Place PoliceDepartment
		while(count<4){
			int X = ((rand.nextInt(5) + 1)*3-2);
			int Y = ((rand.nextInt(5) + 1)*3-1);
			if(buildingMap[X][Y].getBlngType()==null){
				buildingMap[X][Y].setBldgType(BType.PoliceDepartment);
				buildingMap[X+1][Y].setBldgType(BType.notNull);
				buildingMap[X][Y-1].setBldgType(BType.notNull);
				buildingMap[X+1][Y-1].setBldgType(BType.notNull);
				count++;
			}
		}
		//Place Water Treatment Center
		while(count<5){
			int X = ((rand.nextInt(5) + 1)*3-2);
			int Y = ((rand.nextInt(5) + 1)*3-1);
			if(buildingMap[X][Y].getBlngType()==null){
				buildingMap[X][Y].setBldgType(BType.WaterTreatmentPlant);
				buildingMap[X+1][Y].setBldgType(BType.notNull);
				buildingMap[X][Y-1].setBldgType(BType.notNull);
				buildingMap[X+1][Y-1].setBldgType(BType.notNull);
				count++;
			}
		}
		//Place one trivial large building
		while(count<7){
			int X = ((rand.nextInt(5) + 1)*3-2);
			int Y = ((rand.nextInt(5) + 1)*3-1);
			if(buildingMap[X][Y].getBlngType()==null){
				//Pick one of the buildings
				int Z = rand.nextInt(3) + 1;
				if(Z==1)
					buildingMap[X][Y].setBldgType(BType.Park);
				if(Z==2)
					buildingMap[X][Y].setBldgType(BType.Pond);
				if(Z==3)
					buildingMap[X][Y].setBldgType(BType.BallField);
				buildingMap[X+1][Y].setBldgType(BType.notNull);
				buildingMap[X][Y-1].setBldgType(BType.notNull);
				buildingMap[X+1][Y-1].setBldgType(BType.notNull);
				count++;
			}
		}
	}

	/***********************************************************
	 * Places 1x1 Buildings
	 ***********************************************************/
	private void place1x1SustainableBuildings(){

		//Place 1x1 buildings
		int count=0;
		Random rand = new Random();
		//Place Clinic
		while(count<1){
			int X = ((rand.nextInt(5) + 1)*3-2);
			int Y = ((rand.nextInt(5) + 1)*3-1);
			if(buildingMap[X][Y].getBlngType()==null){
				buildingMap[X][Y].setBldgType(BType.Clinic);
				count++;
			}
		}
		//Place FireStation
		while(count<2){
			int X = ((rand.nextInt(5) + 1)*3-2);
			int Y = ((rand.nextInt(5) + 1)*3-1);
			if(buildingMap[X][Y].getBlngType()==null){
				buildingMap[X][Y].setBldgType(BType.FireStation);
				count++;
			}
		}
		//Place PoliceOutpost
		while(count<4){
			int X = ((rand.nextInt(5) + 1)*3-2);
			int Y = ((rand.nextInt(5) + 1)*3-1);
			if(buildingMap[X][Y].getBlngType()==null){
				buildingMap[X][Y].setBldgType(BType.PoliceStation);
				count++;
			}
		}
		//Place Water Tower
		while(count<5){
			int X = ((rand.nextInt(5) + 1)*3-2);
			int Y = ((rand.nextInt(5) + 1)*3-1);
			if(buildingMap[X][Y].getBlngType()==null){
				buildingMap[X][Y].setBldgType(BType.WaterTower);
				count++;
			}
		}
	}
	
	
	/***********************************************************
	 * Places the other buildings on the map
	 ***********************************************************/
	private void placeOtherBuildings(){

			
	}

	/***********************************************************
	 * Returns the map
	 ***********************************************************/
	public Building[][] getBuildingMap() {
		return buildingMap;
	}
	
	/***********************************************************
	 * Returns startX
	 ***********************************************************/
	public int getStartX() {
		return startX;
	}
	
	/***********************************************************
	 * Returns startY
	 ***********************************************************/
	public int getStartY() {
		return startY;
	}

}



