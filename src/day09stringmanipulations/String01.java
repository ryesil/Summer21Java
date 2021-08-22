package day09stringmanipulations;

import java.util.Scanner;

public class String01 {
	public static void main(String[] args) {
		//15th method substring();
		String s1="Java is easy";
	String subString= s1.substring(5,7);
		System.out.println(subString);
		System.out.println(s1.substring(1,4));
		System.out.println(s1.substring(8));
		
//		Scanner in=new Scanner(System.in);
//		String string=in.nextLine();
//		System.out.println(string.substring(0,1)+" "+string.substring(string.length()-1));
		String s3="Teach to learn";
		s3.substring(5,5);// returns nothing
		//System.out.println(s3.substring(5,3));// starting index cannot be greater than the ending index.
		//If you get a red underline while you type a code, it is called "Compile Time Error".
		//If you get red error messages on the console after running your code, it is called "Run time error".
		
//		Scanner in=new Scanner(System.in);
//		String ssn=in.next();
//		System.out.println("*****"+ssn.substring(5));
//		System.out.println(ssn.replace(ssn.substring(0,5), "*****"));
//		System.out.println("".concat("*****").concat(ssn.substring(5)));
		//16th method trim() removes spaces from the beginning and the end.
		String s4="   Ali Can  ";
		System.out.println(s4.trim());
		 String s5="";
		 String s6=" ";
		 System.out.println(s5.isBlank());
		 System.out.println(s6.isBlank());
		//18th method replaceAll(regex,replacement);
		 /*
		  Replace vs ReplaceAll
		  1) In replace() you can use String and char as parameters
		  	 But in replaceAll(), you can use String
		  2) In replaceAll() we can use regex (regular expressions) 
		  regex is some syntaxes which represents multiple characters.
		  Example:
		  a) \\d==> stands for all digits. [0-9]
		  b) \\D==> stands for all characters but digits.
		  c) \\w==>stands for _ and a-z and A-Z and 0-9;
		  d) \\s==> stands for space
		  e) \\S==> stands for any character other than space
		  f) \\A==> add to the beginning.
		  g) \\Z==> add to the end.
		  g)[abc]==> Stands for all a,b,c
		  h) [^abc]==> all characters but abc.
		  
		  Example		  
		  */
		 String s9="2A1b234C7";
		 System.out.println(s9.replaceAll("\\d",""));
		 System.out.println(s9.replaceAll("\\D", ""));
		 String s10="a01_BC !5x_m ?";
		 System.out.println(s10.replaceAll("\\w","*"));
		 String s11="     Al   i   Can     ";
		 
		 System.out.println(s11.replaceAll("\\s",""));
		 String s12="3,12.99";
		 ;
		 System.out.println(s12.replaceAll("\\A", "\\$"));
		 String s13= " ali can bey";
		 s13.replaceAll("[abc]", "*");
		 System.out.println(s13.replaceAll("[abc]", "*"));
		 System.out.println(s13.replaceAll("[^abc]","*"));
		 StringBuilder x=new StringBuilder();
		 x.append("eben").append(12);
		 System.out.println(x);
	}

}
