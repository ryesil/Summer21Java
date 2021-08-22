package day5_nestefif;

import java.util.Scanner;

public class Ternary04 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("a number?");
	int y=in.nextInt();
	int x = String.valueOf(Math.abs(y)).length();
	System.out.println(x==3?y+" has 3 digits":y+" doesn't have 3 digits");
	
	
	
	
	//System.out.println(x==3?"three digits":"something else");
	
//	System.out.println("A number?");
//	int a= in.nextInt();
//	int b=Math.abs(a);
//	String result=a>99&&a<1000?a+" has 3 digits":"has no three digits";
//	
//	System.out.println(result);
	
}
	
}
