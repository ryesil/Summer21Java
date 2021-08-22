package day5_nestefif;

import java.util.Scanner;

public class Question5 {
	public static void main(String[] args) {
		enterAn();
		
	}
	
	public static void enterAn() {
		Scanner input=new Scanner(System.in);
		System.out.println("four digit number");
		int num=input.nextInt();
		num=Math.abs(num);
		
		if(num>999&&num<10000) {
			int first= num/1000;
			int last =num%10;
			System.out.println("The sum "+ (first+last));
		} else {
			System.out.println(" 4 digit please");
		}
		input.close();
	}

}
