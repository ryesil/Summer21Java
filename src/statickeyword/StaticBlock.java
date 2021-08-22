package statickeyword;

public class StaticBlock {
	/* class loader======> loads the class then it loads the static block like "year". Next the main method comes.
	 static variable: Class variable, it is attached to the class and you should use class name to access.
	 static method: They belong to the class, you should use class name to access.
	 static block: (Code block) 
	 				1) it is used to initialize "class variables"
	 				2) Static block is executed before everything (constructors, methods, main methods) inside the class. 
	 				3) If you have multiple static blocks, first one runs first.
	 				
	 */

	// I did not use "static block" to initialize
		static int age=12;
		//I used "static block" to initialize
		
		static int year;
		static {// is executed before everything inside the class.
			year =2021;
		}
		
		static {
			System.out.println("Static block 1");
		}
		static {
			System.out.println("static block 2");
		}
		static {
			System.out.println("static block 3");
		}
	public static void main(String[] args) {

		method1();
		System.out.println("Main");
		method2();
		StaticBlock obj1=new StaticBlock();
		
	}
	
	public static void method1() {
		System.out.println("method 1");
	}
	public static void method2() {
		System.out.println("method 2");
	}
	
	StaticBlock(){
		System.out.println("Constructor");
	}

}
