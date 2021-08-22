package day07stringmanupilations;

import java.util.Scanner;

public class StringMethods {
public static void main(String[] args) {
	//1st Method: equals
	//2nd Method: equalsIgnoreCase()
	//3rd Method: length()
	//4th method: toUpperCase();
	//5th method: toLowerCase();
	//6th method: contains();
	//7th method: charAt();
	
	String s1=";";
	s1.length();
	String s2=" ";
	String s3=null;
	//System.out.println(s3.length());//NullPointerException;
	String s4="Learn Java earn money...";
	System.out.println(s4.length());
	String s5="java";
	System.out.println(s4.contains(s5));
	System.out.println(s4.contains(s2));//true
	System.out.println(s4.contains(s1));//true;
	//System.out.println(s4.contains(null));//exception;
	//charAt() method;
	
String s6="Java is easy!";
System.out.println(s6.charAt(0));

//Scanner in=new Scanner(System.in);
//System.out.println("String?");
//String string=in.next();
//System.out.println(string.charAt(string.length()-1));
//	System.out.println();
	
	//indexOf()==> it returns index of specific character/s + returns integer.
	String s8="Java ahh Java!!...";
	System.out.println(s8.indexOf("J"));
	System.out.println(s8.indexOf('J')); //indexOf method accepts '' and ""
	System.out.println(s8.indexOf("x"));// returns -1 for non-existing character.
	System.out.println(s8.indexOf(""));//0
	System.out.println(s8.indexOf("ahh"));//returns the index of first character.
	System.out.println(s8.indexOf("ahha"));//checks if the whole string exists then it returns the index of the first character.
	System.out.println(s8.indexOf("j",5));//9
	System.out.println(s8.indexOf("a",4));//5 it will skip first 4 characters, then look for the first occurrence of a and will return the index of a.
										  //and will return the index of a.
	
	
	
}
	
}
