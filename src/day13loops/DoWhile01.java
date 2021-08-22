package day13loops;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
//		int n=0;
//		
//		do {
//			System.out.println("Enter an integer");
//		n=in.nextInt();
//			
//		}while(n%2!=0);
//		System.out.println("You won!");
//		Ask user to enter his/her first name
//		 If the initial is lower case print a message like “Make the initial upper case”
//		 If the initial is upper case print a message like “You did it right”
		
//		String name="";
//		System.out.println("Enter your first name");
//		 name=in.next();
//		do {
//			
//			if(!Character.isUpperCase(name.charAt(0))) {
//				System.out.println("Make sure initial is upperCase! Try again");
//				 name=in.next();
//			}
//			
//			
//		}while(!Character.isUpperCase(name.charAt(0)));
//		
//		System.out.println("You did it");
		
		
//		Ask user to enter password.
//		 If the password has more than 6 characters print “It is okay”
//		 Otherwise, print “Make the password longer than 6 characters” and ask user to enter a new password
		
		
		
		System.out.println("Enter your password!");
		String pass=in.next();
		do {
			
			if(pass.length()<=6) {
				System.out.println("You entered "+pass.length()+ " characters. ");
				System.out.println("The password should be more than 6 characters. Try again");
				pass=in.next();
			}
			}while(pass.length()<=6);
			System.out.println("Password has been created.");
			
			
		
	}

}
