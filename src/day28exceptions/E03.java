package day28exceptions;
/*
 1) ArrayIndexOutOfBoundException is thrown if you use non-existing index in Arrays
 2)	ArrayIndexOutOfBoundException is anun-checked Exception
 3)ClassCastException is thrown if you try to cast a data type to another which is not supported by Java
 4) ClassCastException is an unchecked exception
 5) NumberCastException is thrown if you use non-digit characters in a string and use parseInt()
 6) ClassCastException is an un-checked exception
 */
public class E03 {
public static void main(String[] args) {
	String s[]= {"A","D","B","C"};//Arrays accept only primitives and references.
	System.out.println(s[2]);//B
try {
	System.out.println(s[4]);//OutOfBoundException
	}
	catch(ArrayIndexOutOfBoundsException e){
	System.out.println("Do not use non-existing index "+e.getMessage());	
	}

//ClassCastException
//Object obj=70;
//String num=(String)obj;
//NumberFormatException
String s1="123";
int num1=Integer.parseInt(s1);
System.out.println(num1+5);

String s2="1a2b3c";
try {
int num2=Integer.parseInt(s2);
System.out.println(num2+5);
}
catch(NumberFormatException e) {
	System.out.println("You used non-digit characters in the String");
}

}
}
