import java.util.Random;

/**********************************************************************
 * Contains all the methods to access and alter data held by a cell
 * 
 * @author Corey Alberda
 *********************************************************************/
public class Survivor {

	String survFName;
	String survLName;
	char survGender;
	int survAge;
	int survSkill;
	
	//Random Generator to determine random traits
	Random rand = new Random();	

	/****************************************************************
	 * Makes "You" / Initial Survivor Constructor
	 ****************************************************************/
	public Survivor(String fname, String lname,char gender, int age){
		survFName = fname;
		survLName = lname;
		survGender = gender; 
		survAge = age;
		survSkill = rand.nextInt(20) + 80; // 80 - 100
	}
	
	/****************************************************************
	 * Survivor Constructor
	 ****************************************************************/
	public Survivor(){
		makeRandSurvivor();
	}
		
	/****************************************************************
	 * Survivor Constructor
	 ****************************************************************/
	public void makeRandSurvivor(){
		int temp;
			
		//Gender
		temp = rand.nextInt(2);
		if(temp == 0)
			survGender = 'M';
		else
			survGender = 'F';		
		//First Name
		if(survGender == 'M'){
			survFName = "Steve";
		}
		else{
			survFName = "Mary";
		}		
		//Last Name
		survLName = "Smith";		
		// Age
		survAge = rand.nextInt(86);	
		// Skill
		if(survAge<12)
			survSkill = 0;
		if(survAge>70)
			survSkill = 0;
		else
			survSkill = rand.nextInt(90)+10; //random skill 10-90		
	}

	public String getSurvFName() {
		return survFName;
	}

	public String getSurvLName() {
		return survLName;
	}

	public char getSurvGender() {
		return survGender;
	}

	public int getSurvAge() {
		return survAge;
	}

	public int getSurvSkill() {
		return survSkill;
	}
}