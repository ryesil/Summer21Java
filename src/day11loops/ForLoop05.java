package day11loops;

import java.util.Scanner;

public class ForLoop05 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	
	System.out.println("Enter the base..");
	int base=in.nextInt();
	
	for(int i=base;i>0;i--) {
		for(int k=0;k<base-i;k++) {
			System.out.print(" ");
		}
		for(int j=i;j>0;j--) {
			System.out.print("* ");
		}
		System.out.println();
	}
}
}
