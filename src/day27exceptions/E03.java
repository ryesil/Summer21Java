package day27exceptions;

public class E03 {
public static void main(String[] args) {
	int a=12;
	int b=0;
	try {
	System.out.println(a/b);
	} catch(ArithmeticException e){
		//System.out.println("You cannot divide by zero: second number "+b+" needs to be a non-zero number.");
		System.out.println("Equals to infinity");
	}
	
	
}
}
