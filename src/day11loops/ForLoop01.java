package day11loops;

import java.util.Scanner;

public class ForLoop01 {
	public static void main(String[] args) {
		
		/*
		 Type program to find the sum of the integers from 1 to 100;
		 */
//		int sum=0;
//		for(int i=1;i<100;i++) {
//			sum+=i;
//		}
//		System.out.println(sum);
		
		Scanner in=new Scanner(System.in);
		System.out.println("starting");
		int start=in.nextInt();
		System.out.println("Ending");
		int end=in.nextInt();
		int sum=0;
		for(int i=start;i<=end;i++) {
			sum+=i;
		}
		System.out.println(sum);
		
		/*
		 Ask user to enter a number then calculate the factorial of it.
		 */
	}
}
