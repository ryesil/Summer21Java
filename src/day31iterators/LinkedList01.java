package day31iterators;

import java.util.Collection;
import java.util.LinkedList;

public class LinkedList01 {
public static void main(String[] args) {
	
	LinkedList<String> ll1=new LinkedList<>();
	
	ll1.add("Ali");
	ll1.add("Can");
	ll1.add("Tom");;
	System.out.println(ll1);
	
	ll1.poll();/// Returns first element but removes the first element
			   // Returns null if this list is empty.
	ll1.peek();
	
}
}
