package day14methodoverloadingconstruction;

public class Constructors01 {
	/*
	 Java knows, classes are for Object creation. To create object we need "constructors. Because of that when you create a class
	 Java creates a constructor automatically
	 Java gives you a default constructor, which is invisible inside the class.
	 If you want you can create you can create your own constructor as well.
	 */
	// How can we create a constructor?
		// Access modifier + ClassName() + { }
		public Constructors01() {
			
		}
		
		public Constructors01(int a) {
			
		}
        public Constructors01(int a, String s) {
			
		}
        public Constructors01(char a, double d, String s) {
			
		}
		// Note: Constructors are not methods because they don't do have return types.
		// Do not say constructor method, they will show you the door.
		//Constructors are constructor. 
		//COnstructor names must be same with the class name.
		/*
		 Interview Question:
		 What are the diff between constructor and method?
		 	1) Constructors do not have return type but methods have
		 	2) Methods may have any name as method name but constructors must have class name as constructor name
		 Note: when you create a class Java gives you default constructor but if you create any constructor Java deletes default one
		 Note: Default constructor is a constructor without parameters like public Constructors01(){}.
		 */
public static void main(String[] args) {
	
	
	
	
}
}
