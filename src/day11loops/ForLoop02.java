package day11loops;

import java.util.Scanner;

public class ForLoop02 {
public static void main(String[] args) {
	/*
	 Find the multiplication of the numbers from 1 to 10;
	 */
	System.out.println("           Multiplication Table");
	System.out.println("____________________________________________");
	
	for(int i=1;i<11;i++) {
		System.out.printf("%-2d |",i);
		for(int j=1;j<11;j++) {
			System.out.printf("%4d",i*j);
		}
		System.out.println();
	}
	
	Scanner in=new Scanner(System.in);
//	System.out.println("Number");
	int product=1;
	for(int i=in.nextInt();i>0;i--) {
		product*=i;
	}
//	System.out.println(product);
	//BigDecimalClass for large integers
}
}
