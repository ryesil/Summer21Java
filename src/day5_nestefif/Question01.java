package day5_nestefif;

import java.util.Scanner;

public class Question01 {
	public static void main(String[] args) {
		
		leapYear2();
		
		
	}
public static void leapYear() {
	Scanner input=new Scanner(System.in);
	System.out.println("A year");
	int year=input.nextInt();
	if(year%100==0&&year%400==0) {
		System.out.println("leap year");
	} else if( year%100!=0&&year%4==0) {
		System.out.println("leap");
	} else {
		System.out.println("not a leap year");
	}
}
public static void leapYear2() {
	Scanner input=new Scanner(System.in);
	System.out.println("A year");
	int year=input.nextInt();
	if(year%100==0) {
		if(year%400==0) {
			System.out.println("leap");
		}else {
			System.out.println("not a leap");
		}
	}else if(year%100!=0) {
		if(year%4==0) {
			System.out.println("leap");
		} else {
			System.out.println("Not a leap");
		}
	}

}
}
