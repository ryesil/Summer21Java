package day12loops;

import java.util.Scanner;

public class whileLoop01 {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Number?");
		double num=in.nextDouble();
		int start=1;
		while(start<=10) {
			System.out.println(num+" x "+start+ " = "+(int)((num*start)*10)/100.0);
			start++;
			
		}

	}

}
