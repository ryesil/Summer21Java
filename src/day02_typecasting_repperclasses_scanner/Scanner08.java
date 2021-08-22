package day02_typecasting_repperclasses_scanner;

import java.util.Scanner;

public class Scanner08 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	
	System.out.println("Please enter km");
	double mile=input.nextDouble();
	System.out.println(Math.round(mile)+" miles is equal to "+Math.round(mile*1.6)+" km.");
}
}
