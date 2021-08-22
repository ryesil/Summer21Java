package day13loops;

import java.util.Scanner;

public class DoWhile04 {

	public static void main(String[] args) {
		/*
		 Ask user to enter any integer number. 
			 If the integer is divisible by 5, tell user to "Won"
			 Otherwise tell user "Lost" and ask user if s/he want to play again.
			 if yes ask a new number to enter, if no say Thanks.
		 */
		Scanner scanner=new Scanner(System.in);
		int n=0;
		do {
			System.out.println("Enter an integer");
			n=scanner.nextInt();
			if(n%5==0) {
				System.out.println("Won!!!");
			}else {
				System.out.println("Lost");
			}
			System.out.println("To end the game press Q to continue the game press any other key");
			char confirm=scanner.next().toLowerCase().charAt(0);
			if(confirm=='q') {
				break;
			}
			
		}while(true);
		System.out.println("Game finished");
		

	}

}
