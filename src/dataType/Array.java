package dataType;

public class Array {

	public static void main(String[] args) {
	
		
		
		String [][][] engineeringData = new String [2][5][6];
		
		// -------------Semester 1------------------
		
		//Subjects
		engineeringData[0][0][0] = "Mathematics I";
		engineeringData[0][0][1] = "Physics";
	    engineeringData[0][0][2] = "Chemistry";
	    engineeringData[0][0][3] = "Computer Programming";
	    engineeringData[0][0][4] = "Engineering Drawing";	
	    engineeringData[0][0][5] = "Basic Electrical Eng.";
	    
	    //Marks
	    engineeringData[1][0][0] = "Pass(78)";
		engineeringData[1][0][1] = "Pass(85)";
	    engineeringData[1][0][2] = "Fail(21)";
	    engineeringData[1][0][3] = "Pass(74)";
	    engineeringData[1][0][4] =	"Pass(88)";	
	    engineeringData[1][0][5] = "Pass(79)";
	    
	    //-----------Semester 2-------------------------
	    
	    //Subjects
	    engineeringData[0][1][0] = "Mathematics II";
		engineeringData[0][1][1] = "Mechanics";
	    engineeringData[0][1][2] = "Environmental Sci.";
	    engineeringData[0][1][3] = "Basic Electronics";
	    engineeringData[0][1][4] = "Engineering Physics";	
	    engineeringData[0][1][5] = "Engineering Graphics";
	    
	    //Marks
	    engineeringData[1][1][0] = "Pass(82)";
		engineeringData[1][1][1] = "Pass(77)";
	    engineeringData[1][1][2] = "Pass(93)";
	    engineeringData[1][1][3] = "Fail(19)";
	    engineeringData[1][1][4] =	"Fail(24)";	
	    engineeringData[1][1][5] = "Pass(90)";
	    
	    //-----------------Semester 3------------------------
	    		
		//Subjects
	    engineeringData[0][2][0] = "Data Structures";
		engineeringData[0][2][1] = "Discrete Mathematics";
	    engineeringData[0][2][2] = "Digital Electronics";
	    engineeringData[0][2][3] = "Operating Systems";
	    engineeringData[0][2][4] = "Signals and Systems";	
	    engineeringData[0][2][5] = "Object-Oriented Prog.";
		
		//Marks
	    engineeringData[1][2][0] = "Pass(88)";
		engineeringData[1][2][1] = "Pass(81)";
	    engineeringData[1][2][2] = "Pass(76)";
	    engineeringData[1][2][3] = "Fail(32)";
	    engineeringData[1][2][4] = "Pass(85)";	
	    engineeringData[1][2][5] = "Pass(78)";
		
		//-------------------Semester 4--------------------------
	    
	    //Subjects
	    engineeringData[0][3][0] = "Algorithms";
		engineeringData[0][3][1] = "Computer Networks";
	    engineeringData[0][3][2] = "Database Systems";
	    engineeringData[0][3][3] = "Microprocessors";
	    engineeringData[0][3][4] = "Communication Eng.";	
	    engineeringData[0][3][5] = "Software Engineering";
		
		//Marks
	    engineeringData[1][3][0] = "Pass(91)";
		engineeringData[1][3][1] = "Pass(73)";
	    engineeringData[1][3][2] = "Fail(19)";
	    engineeringData[1][3][3] = "Pass(80)";
	    engineeringData[1][3][4] = "Pass(76)";	
	    engineeringData[1][3][5] = "Pass(87)";
	    
	    //------------------Semester 5--------------------
		
		//Subjects
	    engineeringData[0][4][0] = "Probability & Stats";
		engineeringData[0][4][1] = "Machine Learning";
	    engineeringData[0][4][2] = "Compiler Design";
	    engineeringData[0][4][3] = "Theory of Computation";
	    engineeringData[0][4][4] = "Embedded Systems";	
	    engineeringData[0][4][5] = "Computer Graphics"; 
		
		
		//Marks
	    engineeringData[1][4][0] = "Pass(86)";
		engineeringData[1][4][1] = "Pass(88)";
	    engineeringData[1][4][2] = "Pass(84)";
	    engineeringData[1][4][3] = "Pass(95)";
	    engineeringData[1][4][4] = "Pass(73)";	
	    engineeringData[1][4][5] = "Pass(90)"; 
		
		
	//-----------Output------------------------	
		
	//Print Semester 2 Subject 4 and Subject 5 names.
	    System.out.println("Semester 2, Subject 4  = " + engineeringData[0][1][3]);
	    System.out.println("Semester 2, Subject 5  = " + engineeringData[0][1][4]);
		
	//Print the Status/Marks of Semester 4 Subject 3 and Subject 6.	
	    System.out.println("Semester 4, Subject 3 = " + engineeringData[1][3][2]);
	    System.out.println("Semester 4, Subject 6 = " + engineeringData[1][3][5]);
		
		
		
		
	}

}
