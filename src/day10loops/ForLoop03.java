package day10loops;

import java.util.Scanner;

public class ForLoop03 {

	public static void main(String[] args) {
	/*
	 Ask user to enter a string
	 Check if the string is a palindrome or not
	 */
Scanner in=new Scanner(System.in);
System.out.println("String?");
String str=in.nextLine();
String rts="";
for(int i=str.length()-1;i>=0;i--) {
	rts=rts+str.charAt(i);
}

System.out.println(rts.equalsIgnoreCase(str)?"Palindrome":"Not a Palindrome");


	}

}
