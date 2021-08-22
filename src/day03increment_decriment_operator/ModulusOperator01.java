package day03increment_decriment_operator;

import java.util.Scanner;

public class ModulusOperator01 {
	public static void main(String[] args) {

		System.out.println(25 % 4);

		Scanner input = new Scanner(System.in);

//	System.out.println("Number please?");
//	
//	int lastDigit=input.nextInt()%10;
//	
//	System.out.println("The last digit is: "+lastDigit);

//		int sum = 0;
//		for (int i = 1; i < 4; i++) {
//			System.out.println("number: " + i);
//			sum += input.nextInt();
//		}
//		System.out.println(sum);
//		
//		
//		
		Integer number =0;
		int lastDigit=0;
		int midDigit=0;
		int firstDigit=0;
		
		System.out.println("Give me a 3 digit integer...");
		number=input.nextInt();
		String num=number.toString();
//		System.out.println(Integer.parseInt(;
		
		lastDigit=number%10;
		number/=10;
		midDigit=number%10;
		number/=10;
		firstDigit=number%10;
		System.out.println(firstDigit+midDigit+lastDigit);
		
	//1th way
		
		int a=5;
		int b=12;
		
		int c=a;
		a=b;
		b=c;
		System.out.println(a+","+b);
		int d=5;
		int e=12;
		
	//2nd way
	e=e+d;
	d=e-d;
	e=e-d;
	
	
	System.out.println(e+","+d);
	
				
		

	}

}
