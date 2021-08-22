package day28exceptions;

public class E02 {
public static void main(String[] args) {
String s1="";
System.out.println(s1.length());//0
	
String s2=null;
try 
{
	System.out.println(12/4);//Java will throw ArithmeticException
	//System.out.println(s2.length());//NullPointerException
	
}catch(NullPointerException e) {
	System.out.println("Do not use length() for null. "+e.getMessage());
}catch(ArithmeticException e) {
	System.out.println("Do not divide by zero.. "+e.getMessage());
}
finally {
	System.out.println("Finally part will be executed under every condition.");
}
System.out.println("will that be executed!");	
}
}
