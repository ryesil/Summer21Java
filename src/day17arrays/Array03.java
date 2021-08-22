package day17arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array03 {
	public static void main(String[] args) {

		numElem();

	}

	public static void numElem() {
		Scanner in = new Scanner(System.in);
		System.out.println("enter the length of the array");
		int length = in.nextInt();
		String[] string = new String[length];
		for (int i = 0; i < length; i++) {
			System.out.println("Enter number " + (i + 1));

			string[i] = in.next();

		}
	}

}
