package day8stringmanipulations;

public class String01 {
public static void main(String[] args) {
	/*
	 "Learn Java earn money" 
	 
	 
	 */
	String string="Learn Java earn money";
	
	System.out.println(string.indexOf("earn",3)); //index of second earn
	
	//9th method: lastindexOf method: it returns the index last occurrence of a character. Returns int
	
	System.out.println(string.indexOf("e"));
	System.out.println(string.lastIndexOf('e'));
	System.out.println(string.lastIndexOf(" "));
	System.out.println(string.lastIndexOf(""));//21 becasue there is nothing after the money. only grave.
	System.out.println(string.lastIndexOf("X"));// -1
	System.out.println(string.lastIndexOf("Java"));// returns the first letter of the last java.
	System.out.println(string.lastIndexOf("earn"));
	// 10th method: Startswith(); used to check the initial of a string.
	String s2="Java";
	System.out.println(s2.startsWith("J"));//true
	System.out.println(s2.startsWith("j"));//false
	System.out.println(s2.startsWith("a",1));//true
	System.out.println(s2.startsWith("Java"));//true
	System.out.println(s2.startsWith("Javax"));//false
	System.out.println(s2.startsWith("i", 5));//Check the first character money starts with Number. $53000;
	//11th method endWith(); last character
	System.out.println(s2.endsWith("y"));
	System.out.println(s2.endsWith("m"));
	System.out.println(s2.endsWith("easy"));
	//12th method isEmpty(): is it empty or not?
	System.out.println(s2.isEmpty());
	//13th method: concat() 
	String s5="Ali";
	String s6="Can";
	System.out.println(s5+s6);
	System.out.println(s5.concat(s6));
	//14th method replace() replaces characters.
	String s7="$3,199.99";
	String ss=s7.replace("$", "").replace(",", "").replace(".", "");
	System.out.println(ss);
	String s8="Java ahh Java!...";;
	System.out.println(s8.replace("Java", "Pyton"));// all java replaced with python.
	System.out.println(s8.replace("a", "e"));
	String s99="123456789";
	//System.out.println(s9.replace());
	String s9="Saltwater Fishing Boats";
	System.out.println(s9.toLowerCase().replace(" ", "_"));
	
	System.out.println(s99.replace(s99.substring(0, 5), "*****"));
	String s10="Java";//J_A_V_A_
	System.out.println(s10.toUpperCase().replace("", "_"));
	System.out.println(s10.toUpperCase().replace("A", "_A_"));
	System.out.println(s10.replace("a", "_A_").replace("v", "V"));
	System.out.println(s10.replace("", "/"));// /J/a/v/a
	
	String s11="Java is ";
	s11.replace('a', 'x');
	
	
}
}
