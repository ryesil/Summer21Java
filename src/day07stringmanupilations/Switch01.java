package day07stringmanupilations;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		/*
		 Ask user to enter the name of the month;
		 For January, Febru
		 */
		Scanner in=new Scanner(System.in);
		System.out.println("Name of the month");
		
		String firstQuarter=" january, fabruary, march";
		String secondQuarter="april, may, june,";
		String thirdQuarter="july, august, eptember";
		String fourthQuarter="October, November, December";
		String month =in.next();
		
		switch(month) {
		case "january":
		case "february":
		case"march":
		System.out.println("First Quarter");
		break;
		case "july":
		case "august":
		case "september":
			System.out.println("Third quarter");
			break;
		case "april":
		case"may":
		case"june":
			System.out.println("second quarter");
			
		}
	}

}
