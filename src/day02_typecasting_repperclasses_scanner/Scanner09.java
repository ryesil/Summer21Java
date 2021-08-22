package day02_typecasting_repperclasses_scanner;

import java.util.Scanner;

public class Scanner09 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
	System.out.println("Please enter an hr.");
	float hr=input.nextFloat();
	System.out.printf(hr+ " hrs is equal to %.1f sec", hr*3600);
	}

}
