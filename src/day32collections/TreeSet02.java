package day32collections;

import java.util.HashSet;
import java.util.TreeSet;

public class TreeSet02 {
public static void main(String[] args) {
	//We need to store unique elements in natural order.
	//1st way:TreeSet works for that task but treeset is very slow becasue of that we do not prefer to use
	//first way
	//2) Use hashSet to add elements, then convert hashset then conver to treeset to put elements in natural order.
	HashSet<String> hs1=new HashSet<>();
	hs1.add("Apple");
	hs1.add("Mango");
	hs1.add("Orange");
	hs1.add("Palm");
	hs1.add("Apricot");
	TreeSet<String> ts1=new TreeSet<>(hs1);
	System.out.println(ts1);
	
	
	
}
	
	
}
