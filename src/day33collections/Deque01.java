package day33collections;

import java.util.Deque;
import java.util.LinkedList;

/*
 1) Deque stands for Double Ended Queue
 2) We can use FIFO and LIFO together Deque
 3) null cannot be used as an element in Deque,
 	if you try to add null, it doesn't give any error.

 */

public class Deque01 {
public static void main(String[] args) {
	
	Deque<String> dq1=new LinkedList<>();
	
	dq1.addFirst("A");
	dq1.addLast("Z");
	dq1.getFirst();
	dq1.getLast();
	
	dq1.offerLast("Y");
	dq1.offerFirst("B");
	
	dq1.peekFirst();
	dq1.peekLast();
	
	dq1.pollFirst();
	dq1.pollLast();
	
	dq1.removeFirst();
	dq1.removeLast();
	dq1.removeFirstOccurrence("A");
	dq1.removeLastOccurrence("A");
	//How can you verify if a specific element is repeated in a deque or not?
	
	Deque<String> dq2=new LinkedList<>();
	dq2.add("A");
	dq2.add("B");
	dq2.add("A");
	dq2.add("C");
	dq2.add("A");
	
	dq2.removeFirstOccurrence("A");
	if(dq2.removeLastOccurrence("A")) {
		System.out.println("A is repeated");
	}else {
		System.out.println("A is not repeated");
	}
	dq2.add(null);
	System.out.println(dq2);
	
	
}
}
