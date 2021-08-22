package day23stringbuilder;

public class StringBuilder01 {
public static void main(String[] args) {
	/*
	 * how to create s string by using 'StringBuilder class"
	 * 
	 * 
	 */
//	StringBuilder sb=new StringBuilder();
//	System.out.println(sb);// empty String
//	sb.append("Ali");
//	System.out.println(sb);//Ali
//	sb.append(" is a friend of Veli");
//	System.out.println(sb);
//	String str="Veli";
//	System.out.println(str);//Veli
//	str.toUpperCase();
//	System.out.println(str);//Veli because string is immutable
	
	
	//2. way
	StringBuilder sb1=new StringBuilder("Veli is my friend");
	System.out.println(sb1);
	System.out.println(sb1.capacity());//default capacity is 16
	sb1.append(" and my classmate.");
	System.out.println(sb1);
	
	//3.way
	StringBuilder sb2=new StringBuilder(5);
	sb2.append("JAVAX");
	System.out.println(sb2);
	System.out.println(sb2.capacity());
	System.out.println(sb2.length());
	//StringBuilder methods append() in chain
	
	StringBuilder sb3=new StringBuilder("Java");
	sb3.append('q').append('z').append('u');
	System.out.println(sb3);
	
	//2.
	sb3.append("Ahmet",1,3);
	System.out.println(sb3);
	System.out.println(sb3.charAt(5));
	
	//how to delete
	//delete by start and end index
	sb3.delete(4, 7);
	System.out.println(sb3);
	sb3.deleteCharAt(0);
	System.out.println(sb3);
	
	
}
}
