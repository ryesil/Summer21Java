package day30exceptionsinterfacesiteratorscollections;

public class CustomExceptions01 {
public static void main(String[] args) {
	
//	Handle custom exception
	try {
		checkTheGrade(90);
	} catch (IllegalGradeException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	//Handle unchecked CustomException
	divide(10,2);
	
	
}
//Use Custom exception in a method.
public static void checkTheGrade(int grade) throws IllegalGradeException {
	if(grade<0||grade>100) {
		throw new CustomExceptions01().new IllegalGradeException("grades must be between 0 and 100");
	}
	System.out.println("Your grade is "+ grade);
}

//Use Unchecked Custom Exception in a method
public static void divide(int x, int y) throws DivideByOneException{
	if(y==1) {
		throw new CustomExceptions01().new DivideByOneException("/ by 1 gives the number itself, no need to divide.");
	} else {
		System.out.println("The result is "+ x/y);
	}
}


/*
 When you create a "Custom Exception";
 1)Put exception word at the end of the custom Exception class name like IllegalGradeException
 2) Don't forget to extend Exception class;
 3) Create constructor with a String parameter, and super() constructor call keyword,
 
 */

class IllegalGradeException extends Exception {
	
	public IllegalGradeException(String message) {
		super(message);
	}
	
}

class DivideByOneException extends RuntimeException{
	
public DivideByOneException(String message) {
	super(message);
}
	
}


}
