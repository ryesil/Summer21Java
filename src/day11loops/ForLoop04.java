package day11loops;

import java.util.Scanner;

public class ForLoop04 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Number");
		int num=in.nextInt();
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			System.out.println();
			
		}

	}

}
