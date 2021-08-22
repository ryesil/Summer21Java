package day29exceptionsabstraction;

import java.util.Scanner;

public class E01 {
	//IlligalArgumentException
	//Sometimes we do not want to use some values for some parameters
//

	public static void main(String[] args) {
		
		
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your agee...");
		int age =scanner.nextInt();
		try {
		setAge(age);
		}catch(IllegalArgumentException e) {
		System.out.println("Do not use negative values for ages...");
		}	
	}
	
public static void setAge(int age) throws IllegalArgumentException, NumberFormatException{

	if(age<0) {
		throw new IllegalArgumentException();
	} else {
		throw new NumberFormatException();
		//System.out.println("Your age is "+age);
	}
	}

	
	
}
	

