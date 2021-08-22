package day02_typecasting_repperclasses_scanner;

import java.util.Scanner;

public class Scanner02 {
	public static void main(String[] args) {
		//Create Scanner Object
		Scanner scanner = new Scanner(System.in);
		//Give message to user
		System.out.println("Hey user, enter your firstName...");
		//Create a container to store data coming from user
		String firstName=scanner.nextLine();
		
		System.out.println("Hey user, enter your lastName...");
		String lastName=scanner.nextLine();
		
		System.out.println("Hey user, enter your address...");
		String address=scanner.nextLine();
		
		
		
		//Note: To get String data from user you have nextLine() and next() methods.
		//NextLine() takes all String
		// Next() takes just the first word;
		System.out.println("You are retired. True or False?");
		boolean isRetired=scanner.nextBoolean();
		
		System.out.println("Hey user, enter your name...");
		String name=scanner.next();
		
		
		//Print the name on the console
		System.out.println(firstName);
		System.out.println(lastName);
		System.out.println(address);
		System.out.println(name);
		System.out.println(isRetired);
		
	}

}
