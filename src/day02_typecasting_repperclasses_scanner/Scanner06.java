package day02_typecasting_repperclasses_scanner;

import java.util.Scanner;

public class Scanner06 {
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	System.out.println("Please enter a number");
	double a=input.nextDouble();
	System.out.println("Please enter another nubmer");
	double b=input.nextDouble();
	System.out.printf("The area is %11.3f \n", a*b);//11
	System.out.printf("The perimeter is %5.3f",2*(a+b));//17

}
}