package day13loops;

public class MethodCreation01 {
	public static void main(String[] args) {
		/*
		 If a method is static, everything inside the method must be static.
		 Otherwise there will be a compiler time error.
		 */
		
		
	add(3,4);
	multiply(1,2,3);
		
	}
	
	/*
	 If you want to create methods whose names are the same inside a class, you have to make parameters different.
	 1) Make the data types of parameters different.
	 2) Make the number of parameters different.
	 3) If the data type of parameters are different, you can change the order of parameters.
	 If you creates methods whose names are the same, parameters are different in a class, this is called method overloading.
	 
	 Note: IN method overloading 
	 		a) Using different return types does not work.
	 		b) Using different access modifiers doesn't work.
	 		c) using different parameter names doesn't work.
	 		
	 		Note: For Java, to make the methods different, just change a) method name and b) parameters.
	 		Because of that method name+parameters are called "Method Signature".
	 		
	 
	 */
	
	
	public static void multiply(int a, int b, int c) {
		
		System.out.println(a*b*c);
	}
	
	
	public static int add(int a,int b) {
		return a+b;
	}
	
}
