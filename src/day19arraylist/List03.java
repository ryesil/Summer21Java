package day19arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class List03 {
public static void main(String[] args) {
	//2.d way to create a list
	List<String> list= new ArrayList<>();
	
	list.add("A");
	list.add("B");
	list.add("C");
	list.add("D");
	list.add("E");
	
	List<String> list1=new ArrayList<>();
	list1.add("A");
	list1.add("B");
	list1.add("C");
	list1.add("D");
	list1.add("E");
	System.out.println(list.contains("A"));
	System.out.println(list.contains("X"));
	System.out.println(list.equals(list1));
	
	Scanner in=new Scanner(System.in);
	System.out.println("letter");
//	String ch=String.valueOf(in.next().charAt(0));
//	
//	if(list.contains(ch)) {
//		list.set(list.indexOf(ch),"Got it");
//		
//	}else {
//		list.add(ch);
//	}
	String str=in.next().toUpperCase().substring(0,1);
	if(list1.contains(str)) {
		list1.set(list1.indexOf(str), "Got it");
		System.out.println(list1);
	} else {
		list1.add(str);
		System.out.println(list1);
	}
}
}
