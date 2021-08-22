package day5_nestefif;

import java.util.Scanner;

public class Turnery01 {
public static void main(String[] args) {
	
	Scanner in=new Scanner(System.in);
	System.out.println("Enter an integer");
	int x=in.nextInt();
	
	//String result=x<5? "True":"False";
	//String result= x%2==0?(x+" is even"): (x+" is odd");
	
	String result= x++>5? "true": String.valueOf(x);
	
	
	System.out.println(result);
	
	
	
	
	
	
			
}
}
