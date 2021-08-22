package day14methodoverloadingconstruction;

public class Methodoverloading01 {
public static void main(String[] args) {
	
//	System.out.println((add(2,3)));// Autowidening is used here from int to double.
//	System.out.println(add(2.5,3));//Explicit narrowing will not work.
	add(2,3);
	
	add(2.5,3);
	
	add(3,2.5);
	
	add(3,6,5.5);
	
	
	
	
}



public static double add(int a, int b) {//1th method
	System.out.println(("int + int"));
	return a+b;
}

public static double add(double a, int b) { //2nd method
	System.out.println("double + int");
	return a+b;
}

public static double add(int a, double b) { //2nd method
	System.out.println("int + double ");
	return a+b;
}

public static double add(double a, double b) { //2nd method
	System.out.println("double + double ");
	return a+b;
}

public static double add(int a, int b, double c) {//1th method
	System.out.println(("int + int"));
	return a+b;
}

}
