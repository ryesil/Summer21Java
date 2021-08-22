package day14methodoverloadingconstruction;

/*
 there are 3 main variable types in Java
 	a) Local variables: they are created inside a method
 			You have to initialize local variables
 			When you create a variable, Java uses default values for the variables, but
 			if the variable is local variable Java does NOT use default values.
 			You have to assign a value for local variables, otherwise when you try to use local variable, Java complains.
 	b) Instances (Object) Variables: If you create a variable outside the methods and inside the class without using "static"
 	keyword, it is called "Instance(Object) variable".
 									Instance variables may be initialized or not.
 									If you initialize, java uses the value you assigned for the variable.
 									If you do not initialize, Java uses default value for the variable.
 	
 	
 	
 	c) Class Variables: If you create a variable outside the methods and inside the class with using "static"
 						keyword, it is called "instance(object) variable.
 	STATIC: if a variable is static it is attached to the class. It is not attached to any object.
 	
 	       Class varaibles(static)  are attached to the class, not to the object.
 	
 */




public class VariableTypes01 {
	
	//Instance variables created outisde the methods, inside the class
	//initializing is optional
	String name="Ali Can";
	
	char c;
	
	static String address="Main USA";// this is a class variable. Class variables use static keyword.
	
public static void main(String[] args) {
	
	//Local variable
	int y=11;
	//local variable without initializing
	int z;
	//When we try to use non-initialized local variable Java complains.
	
	//Below example When you try to use instance variable inside the main method, it complains.
	//Because, the main method is static and static methods do not accept non-static things in it.
	//System.out.println(c);
	System.out.println(address);// No complain address is static variable

}

	public int add(int a, int b) {
		System.out.println(c);
		int x=12;
		return a+b;
	}
	
	
}
