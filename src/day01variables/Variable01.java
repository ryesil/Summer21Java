package day01variables;

public class Variable01 {
	
/*
 1) Project==> Package==>Class==>variables+Methods;
 2) How to create "Variables";
 	a) Type data type
 	b) Type name for the variable
 	d)"d"
 	d) value
 	Note; if you create a variable inside a method, you should initialize it.
 	Note: If you want to see default values, create the variables outside the methods.
 	Note: if a method is static, everything you use in the method must be static.
 	Note: If you don't assign any value, java uses "default values' from them. Default values for 
 		a)int -0,
 		b) double=0.0;
 		c) float
 	Note: When you assign any value for a float variable, add f to the end of the number.
 		d) char==> nothing or '\\u000'
 		e) byte==> byte is whole numbers from -128 to 127;
 		f) short==> 
 		Note: Short is a whole number. -32768 to 32767;
 		g) long
 		Note: long is a very large whole number.
 		h) boolean
 	Note: boolean data type is used for "True" or "false" values.
 		g) String==>
 		Note: Order the number data types in ascending order;
 		Byte, short, int, long, float, double.
 		
 		 */
	
	static int price2;
	static double minSalary;
	static float hourlySalary;
	static char single;
	static boolean isOld;
	public static void main(String[] args){
		
		//If you create a variable inside a static method Java makes it static automatically.
	int price1=100;
	double salary=2.34;
	float weeklySalary=1.234f;
	char initial='S';
	byte age=3;
	short populationOfAVillage=25000;
	boolean isNew= true;
	boolean isRetired=false;
	String name="Suleyman";
	
	
	
	System.out.println(isNew);
	System.out.println(isRetired);
	System.out.println(isOld);
	System.out.println(single);
	System.out.println(weeklySalary);
	System.out.println(salary);
	System.out.println(price1);
	System.out.println();
	System.out.println(price2);
	System.out.println(minSalary);
	System.out.println(price1+salary);
	System.out.println(price1*salary);
	System.out.println(hourlySalary);
	System.out.println(populationOfAVillage);
	System.out.println(name);
	
	
	}
	
	}
	
	

