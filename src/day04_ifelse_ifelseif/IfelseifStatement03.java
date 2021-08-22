package day04_ifelse_ifelseif;

import java.util.Scanner;

public class IfelseifStatement03 {
public static void main(String[] args) {
//	A school has following rules for grading system:
//		1. Below 50 - D   2. 50 to 59 - C     3. 60 to 80 - B.   4. From 80 to 100 - A 
//		Ask user to enter marks and print the corresponding grade.
//	
	grading();
	
}
public static void grading() {
	System.out.println("What is your grade?");
	Scanner in=new Scanner(System.in);
	int a=in.nextInt();
	if(a<0) {
		System.out.println("Please do not enter negative values");
	}
	else if(a<50) {
		System.out.println("D");
	} else if(a<60) {
		System.out.println("C");
	} else if(a<80) {
		System.out.println("B");
	}else if(a<100) {
		System.out.println("A");
	} else {
		System.out.println("enter 100 at most");
	}
	
	
}

}
