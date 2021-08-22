package day23stringbuilder;

public class StringBuilder02 {
public static void main(String[] args) {
	StringBuilder sb1=new StringBuilder("Java123");
	
	StringBuilder sb2=new StringBuilder("Java123");
	//how to compare
	//StringBuilder equals method is not the same as String equals() method.
	//We can get true if we compare the same object
	//
	System.out.println(sb1.equals(sb2));//false
	System.out.println(sb1.indexOf("a"));
	System.out.println(sb1.indexOf("a"));
	sb1.insert(3, "QX");
	System.out.println(sb1);
	
	sb1.insert(1, "CCTYEWCC",2,5);
	System.out.println(sb1);
	//use reverse method
	sb1.reverse();
	sb1.replace(0, 3, "***");
	sb1.setCharAt(0, '9');
	sb1.trimToSize();//trims the capacity
	
	
	
	
}
}
