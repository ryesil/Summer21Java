package day04_ifelse_ifelseif;

import java.util.Scanner;

public class IfStatement01 {
public static void main(String[] args) {
	
	//if it rains I will cancel the picnic
	// is the integer even or odd
	Scanner input=new Scanner(System.in);
//	System.out.println("integer");
//	int in=input.nextInt();
	//System.out.println("The number "+in+" is"+(in%2==0?" ":" not ")+"an integer.");
	
//	if(in%2==0) {
//		System.out.println(in+" is even");
//	}
//	if(in%2!=0) {
//		System.out.println(in+ " is odd");
//	}
//	
//	//Get an integer form user, then check if it is negative or not
//	System.out.println("a number");
//	int num=input.nextInt();
//	if(num<0) {
//		System.out.println(num+ " is negative.");
//	} else if(num>0) {
//		System.out.println(num+ " is positive.");
//	}
	
	System.out.println("a number");
	double le=input.nextDouble();
	System.out.println("a nother number");
	double l=input.nextDouble();
	if(l==le) {
		System.out.println("square");
	}else {
		System.out.println("Rectangle");
	}
	if(le==l) {
		System.out.println("Square");
	} else {
		System.out.println("Rectangle");
	}
	
	if(le==l) {
		System.out.println("Square");
	}
	if(le!=l) {
		System.out.println("Rectangle");
	}
}
	
}
