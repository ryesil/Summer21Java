package day30exceptionsinterfacesiteratorscollections;

public class Runner {
public static void main(String[] args) {
	
	
	
	//Having abstract methods with the same name in parent interfaces is not problem.
			//But if the methods whose names are same have different return types gives Compile Time Error
			//If you need to use different return type make the method names different
//	System.out.println(I01.x);
//	System.out.println(I01.s);	
//.add(2, 3);	
	
}
public static void ebe() throws BrainException {
	throw new Runner().new BrainException("Warning no brain found!!!");
}


class BrainException extends Exception{
	public BrainException(String message) {
		super(message);
	}
}
}
