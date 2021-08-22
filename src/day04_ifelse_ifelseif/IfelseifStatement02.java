package day04_ifelse_ifelseif;

import java.util.Scanner;

public class IfelseifStatement02 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("day");
		String a=in.next();
		if(a.equalsIgnoreCase("sunday")|| a.equalsIgnoreCase("saturday")) {
			System.out.println("weekend");
		} else {
			System.out.println("weekday");
		}
		
	}

}
