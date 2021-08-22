package day02_typecasting_repperclasses_scanner;

import java.util.Scanner;

public class scanner07 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
//	double a,b;
//			a=b=1;
//			for(int i=1;i<4;i++) {
//				System.out.println("Please enter a number");
//				a=input.nextDouble();
//				b*=a;
//			}
//			System.out.printf("The volume of the prism is %.1f", b);
	
			System.out.println("Enter the width, length, and heigth...");
			double w=input.nextDouble();
			double l=input.nextDouble();
			double h=input.nextDouble();
			System.out.println("Volume: "+w*l*h);
}
}
