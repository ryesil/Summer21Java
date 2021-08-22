package day19arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class List01 {

	public static void main(String[] args) {
		// ArrayLists are flexible with their size
		// ArrayLists cannot store multiple data type
		// ArrayLists store non primitive data type
		//how to create a list
		//1. way
		ArrayList<Integer> list=new ArrayList<>();
		
		//To print the list on the console: just place the name of the list in the System.out.println()
		System.out.println(list);
		//How to add elements into a list
		list.add(12);
		list.add(5);
		list.add(30);
		list.add(0,8);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list);
		//How to get a specific element from list
		System.out.println(list.get(2));
		list.add(45);
		list.add(25);
		list.add(19);
		list.add(-5);
		list.add(128);
		list.add(501);
		System.out.println(list);
		//System.out.println(list.get(4));
		
		/*
		 Thype a code to find and print the min and max elements
		 */
		Collections.sort(list);
		System.out.println(list);
		int max=list.get(list.size()-1);
		int min=list.get(0);
		//How to check if the list is empty or not
		System.out.println(list.isEmpty());//false
		ArrayList<String> list2=new ArrayList<>();
		System.out.println(list2.isEmpty());//true
		//How to remove elements from a list
		//by index
		list.remove(4);
		System.out.println(list);
		list.remove(list.indexOf(5));
		System.out.println(list);
		list2.add("Ali");
		list2.add("Veli");
		list2.add("John");
		list2.add("Ayse");
		list2.add("Can");
		System.out.println(list2);
		list2.remove("Veli");//Interesting.
		System.out.println(list2);
	}
	
}
