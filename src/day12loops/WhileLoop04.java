package day12loops;

import java.util.Scanner;

public class WhileLoop04 {
public static void main(String[] args) {
	
	Scanner in=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=Math.abs(in.nextInt());
	int i=1;
	while(i<=n) {
		for(int j=1;j<=i;j++) {
			System.out.print("*");
			
		}
		System.out.println(i);
		i++;
		
	}
	
	
}
}
