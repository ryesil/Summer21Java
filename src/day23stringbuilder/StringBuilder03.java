package day23stringbuilder;

public class StringBuilder03 {
public static void main(String[] args) {
	
	
	StringBuilder sb1=new StringBuilder("Java");
	StringBuilder sb2=new StringBuilder("Java");
	/*Equals() method in StringBuilder uses "==" to compare
	 */
	//1th way Convert StringBuilder to String then use equals method
	System.out.println(sb1.toString().equals(sb2.toString()));//false for StringBilder equal
	System.out.println();									  // true for String equal
	
	//2nd way use compareTo() method
	System.out.println(sb1.compareTo(sb2));
	
	
	
}
	
	
	
}
