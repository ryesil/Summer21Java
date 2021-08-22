package day11loops;

import java.util.Scanner;

public class ForLoop03 {

	public static void main(String[] args) {
	
		
		
		for(int i=1;i<4;i++) {
			
			
			
			
			for(int j=5;j<7;j++) {
				
				
				
				
				System.out.println(i+"_"+j);
			}
		}
		/*
		 Draw a rectangle using asteriks *.
		 */
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int row=in.nextInt();
		System.out.println("Enter the number of coulmns");
		int coulmn=in.nextInt();
		for(int i=1;i<=coulmn;i++) {
		
			for(int j=1;j<=row;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
