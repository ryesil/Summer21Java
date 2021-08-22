package day04_ifelse_ifelseif;

import java.util.Scanner;

public class NestedIf01 {
	public static void main(String[] args) {
		/*
		 * Ask user to enter his/her age and gender (M===>Male,F===>Female) if the age
		 * is greater than 65 and gender is male print "retired"
		 */
		Scanner input = new Scanner(System.in);
		System.out.println("age?");
		int age = input.nextInt();
		System.out.println("Gender==>M orF");
		char gender = input.next().charAt(0);
		if (age < 0) {
			System.out.println("do not make age negative");
		} else if (!(gender == 'M' || gender == 'F')) {
			System.out.println("Make the gender 'M' or 'F'");
		} else if (gender == 'M') {
			if (age > 65) {
				System.out.println("retired");
			} else {
				System.out.println("need to work");
			}
		} else if(gender=='F') {
			if (age > 60) {
				System.out.println("retired");
			} else {
				System.out.println("need to work");
			}
			
			
		}

		input.close();
	}

	public static void isRetired() {
		Scanner input = new Scanner(System.in);
		System.out.println("age?");
		int age = input.nextInt();
		System.out.println("Gender==>M orF");
		char gender = input.next().toUpperCase().charAt(0);

		boolean retired = (age > 65 && gender == 'M');
		boolean warning = (age < 0 || !(gender == 'M'));
		if (warning) {
			System.out.println("age>0 and gender==>M");
			isRetired();
		} else if (retired) {
			System.out.println("retired");
		} else {
			System.out.println("need to work");
		}

		input.close();
	}
}
