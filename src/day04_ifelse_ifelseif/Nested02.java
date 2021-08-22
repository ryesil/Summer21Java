package day04_ifelse_ifelseif;

import java.util.Scanner;

public class Nested02 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("integer?");
		int n=scanner.nextInt();
		
		if(n<0) {
			if(n<-9) {
				System.out.println("too small");
			}else {
				System.out.println("Small");
			}
		}else if(n>0) {
			if(n>9) {
				System.out.println("Too big");
			}else {
				System.out.println("Big");
			}
		
		} else {
			System.out.println("Please insert negative or positve integers");
		}
		
		scanner.close();
	} 
		
		
		
		
	
	
	/*
	 * Ask user to enter an integer
	 * If the integer is less than zero check if it is less than -9 if it is less than -9 print "Too small" otherwise print "small".
	 * If the integer is greater than zero check if it is greater than 9. If it is greater than 9 print "too big" otherwise print "Big".
	 */

}
