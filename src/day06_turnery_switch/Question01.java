package day06_turnery_switch;

import java.util.Scanner;

public class Question01 {
public static void main(String[] args) {
//	Ask user to enter year
//	Type java code by using if-else if() statement.
//	Write a program to check if a year is leap year or not.
//	if the year is divisible by 100 then it must be divisible by 400.
//	If a year is not divisible by 100 then it must be divisible by 4.
	
	Scanner in=new Scanner(System.in);
//	System.out.println("Enter a year!");
//	int year=in.nextInt();
//	if(year%100==0) {
//		if(year%400==0) {
//			System.out.println(year+" is a leap year");
//		} else {
//			System.out.println(year +" is not a leap year");
//		}
//	} else {
//		if(year%4==0) {
//			System.out.println(year+ " is a leap year");
//		} else {
//			System.out.println(year+" not a leap year");
//		}
//	}
	System.out.println("Enter your password..");
	char initial=in.next().charAt(0);
	
	
	if(initial>='A'&&initial<='Z') {
		if(initial=='A') {
			System.out.println("Valid Password");
		} else {
			System.out.println("Invalid Password");
		}
	} else if (initial>='a'&&initial<='z') {
		if(initial=='z') {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
	} else {
		System.err.println("No numbers please!");
	}
	

	
}
}
