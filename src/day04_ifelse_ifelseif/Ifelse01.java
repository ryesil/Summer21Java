package day04_ifelse_ifelseif;

import java.util.Scanner;

public class Ifelse01 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
//		System.out.println("enter width and length");
//		double w=input.nextDouble();
//		double l=input.nextDouble();
//		
//		if(w==l) {
//			System.out.println("Square");
//		} else {
//			System.out.println("Rectangle");
//		}
//		
//		if(w==l) {
//			System.out.println("Square");
//		}
//		if(w!=l) {
//			System.out.println("Rectangle");
//		}
		int year=2020;
		Boolean isLeapYear=(year%100==0&&year%400==0||year%100!=0&& year%4==0);
		if (isLeapYear) {
			System.out.println("leap year");
		} else {
			System.out.println("Not a leap year");
		}
		
		
		
		String s="ascde43asdr asdw2213";
		
		
	}
	

}
