package day04_ifelse_ifelseif;

import java.util.Scanner;

public class IfelseStatement02 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("day");
	String day=in.next();
	
	if(day.equals("monday")||day.equals("tuesday")||day.equals("thursday")||day.equals("friday")||day.equals("wednesday")) {
		System.out.println("week day");
	} else{
		System.out.println("weekend day");
	}
}
}
