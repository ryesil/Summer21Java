package statickeyword;

public class Students {

//	String name;
//	static String id;// this should be static because it needs to be unique. Because instances should not change it. 
//	int grade;
//	int registrationYear;
//	static int counter =1000;//If we update the counter, all students number will increase by 1. That's why it has to be unique.
//	
//	public void setId() {
//		counter++;
//		id=String.valueOf(registrationYear);
	
	String name;
	String id;
	int grade;
	int registrationYear;
	static int counter = 1000;
	
	public void setId() {		
		counter++;
		id = "" + registrationYear + grade + counter;		
	}
	
	
	
	
	public Students(String name, int grade, int registrationYear) {
		this.name = name;
		this.grade = grade;
		this.registrationYear = registrationYear;
		setId();
	
	
	
}
	
}
