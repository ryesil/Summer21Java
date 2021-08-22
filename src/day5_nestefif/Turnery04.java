package day5_nestefif;

import java.util.Scanner;

public class Turnery04 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("A number?");
	double x=in.nextDouble();
	
	String result=x>=0&&x<10? "Cube "+Math.pow(x, 3):"Square "+Math.pow(x, 2);
	//double result=x>=0&&x<10? "Cube "+Math.pow(x, 3):"Square "+Math.pow(x, 2);//String because Cube and Square. And variable is double. Mismatch.
	System.out.println(result);
	
}
}
