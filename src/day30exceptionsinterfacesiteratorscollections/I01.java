package day30exceptionsinterfacesiteratorscollections;


/*
 1) Interface is not a class, interface is an interface, that's it.
 	 	2)interface is a storage for "abstract methods" and "public static final variables" 
	 	3)Normally we can store "abstract methods" and "public static final variables" in an "abstract class"
	 	  but abstract does not support multiple inheritance. Because of that Java created "interfaces" and interfaces 
	 	  can be used in multiple inheritance.
	 	4) Interfaces do not have "constructors" because of that we cannot create objects from interfaces.
	 	5) All variables in an interface are automatically "public", "static" and "final",
	 		a) int x=12 and public int x=12 are completely the same.
	 		
 */

public interface I01 {	
	
	int x=11;
	public int y=12;
	//c variable is final automatically because of that we cannot change its value.
	char c='A';
	//d is complaining because it is final and final variables must be initialized.
	//char d;
	
	//You can access to ALi Can by using interface name, no need to create any object to access Ali Can
	//because all variables are static in an interface
	String s="Ali Can";
	
	//All of the given varaiables are the same
	int m=13;
	public int n=13;
	public static int t=13;
	public static final int u=13;
						//Methods
	//In Interfaces all methods are abstract as default, if you want you may use "abstract' keyword or not.
	//in Interfaces all methods are public by default.
	//Untill Java9, using concrete methods in an interface was not possible, but IN Java 9, Java made an
	//update  and let us use concrete methods as well.
	
	///////////////////////Ways to create concrete methods in an interface
	//1) Use "default" keyword, it is not access modifier, it is a specific keyword for interfaces,
	//If you use default keyword, it means the method has a default implementation,
	//Like in apstract classes, if you create a concrete method in interface, it is not a must to override,
	//2) Use static keyword;
	//  Note: all methods are abstract and public by default. if you want you change it. 
	// So below divide method must be overriden because it is abstract.
	//We cannot create object from interface because interface doesn't have constructor.
	
	//example for the first way
	default void product(int x,int y){//The method has a default implementation so
									 //default is not access modifier in an interface.
		System.out.println("Result: "+ x+y);
	}
	
	//Example of the method creation second way.
	static void add(int x, int y){
		System.out.println(x+y);
	}
	
	abstract void divide(int x, int y);
	abstract void subtract(int x, int y);
	
	
	
}
