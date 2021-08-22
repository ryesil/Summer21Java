package day02_typecasting_repperclasses_scanner;

import java.util.Scanner;

public class Scanner03 {
public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	
	System.out.println("Hey user, enter a number");
	double a=input.nextDouble();
	System.out.println("The cube of the number is "+Math.pow(a, 3));
	
	
	
}
	
}
