package day5_nestefif;

import java.util.Scanner;

public class NestedTurnery02 {
public static void main(String[] args) {
	
	Scanner in=new Scanner(System.in);
	System.out.println("Please enter your age!");
	int age=in.nextInt();
	System.out.println("Please enter your gender==> male, female");
	char gender=in.next().toUpperCase().charAt(0);
	String result=gender=='M'?age>65?"Retired":"Need to work":age>60?"Retired":"Need to work";
	
	System.out.println(result);
	
}
}
