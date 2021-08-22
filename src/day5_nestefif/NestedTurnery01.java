package day5_nestefif;

import java.util.Scanner;

public class NestedTurnery01 {
public static void main(String[] args) {
	
	Scanner in=new Scanner(System.in);
	System.out.println("Year?");
	int year=in.nextInt();
	String result= year%100==0?year%400==0?year+" is a leap year":year+"not a leap year":year%4==0?year+" is a leap year.":year +" is not a leap year";
	System.out.println(result);
}
}
