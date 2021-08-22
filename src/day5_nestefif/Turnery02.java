package day5_nestefif;

import java.util.Scanner;

public class Turnery02 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("A number please?");
		int a=in.nextInt();
		System.out.println("Another number?");
		System.out.println(System.in);
		int b=in.nextInt();
		
		if(a<b) {
			System.out.println(a);
		}else {
			System.out.println(b);
		}
		System.out.println(a<b?a:b);
		
	}

}
