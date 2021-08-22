package day32collections;

import java.util.TreeSet;

public class TreeSet01 {
	public static void main(String[] args) {
		
		/*
		 1) In treeSet, all elements are unique and in ascending order
		 2) TreeSet spends too much time to put the elements in ascending order, because TreeSet is very slow.
		 Developers do not prefer to sue TreeSet
		 3) IF try to add repeated elements, TreeSet will overWrite.
		 
		 
		 
		 */
		
	

	TreeSet<String> ts1= new TreeSet<>();
	ts1.add("Apple");
	ts1.add("Mango");
	ts1.add("Orange");
	ts1.add("Palm");
	ts1.add("Apricot");
	System.out.println(ts1);
	//Returns the least element in this set greater than or equal to the given element,
	// or null if there is no such element.
	// HeadSet() gives you all elements from the first element to the element(exclusive) you used as argument.
	
	System.out.println(ts1.headSet("Mango"));//
	System.out.println(ts1.ceiling("Appleq"));
	
	
	}
}
