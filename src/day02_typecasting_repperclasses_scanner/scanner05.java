package day02_typecasting_repperclasses_scanner;

import java.util.Scanner;

public class scanner05 {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Hey user, enter a number");
		double length=input.nextDouble();
		System.out.println("The area is;"+ length*length +"\n The perimeter is :"+ length*4);
		
	}

}
