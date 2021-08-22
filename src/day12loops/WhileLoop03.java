package day12loops;

import java.util.Scanner;

public class WhileLoop03 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=Math.abs(in.nextInt());
		int i=n;
		int count=0;
		while(i>=1) {
			if(n%i==0) {
				System.out.print(n/i+", ");
			}
			
			
			i--;
		}
		
	
		
	}

}
