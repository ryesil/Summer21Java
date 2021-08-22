package day33collections;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue01 {
/*
 1)Queue focuses on the first element because queue is used in First in First out operations.
 2) Because of that, When you use queue as data type will have many methods related to the first element.
 3)If you use LinkedList Constructor to create queue, the elements will be in insertion order
 	If you use PriorityQueue constructor to create Queue, the elements will be in order according to the
 	 Java ordering rule but if you want, you can declare a rule to sort the elements. We will learn how to
 	 declare sorting rules in Lambda Course;
 */
	public static void main(String[] args) {
		
//		
//		Queue<String> q1=new LinkedList<>();
//		
//		q1.add("Rick");
//		q1.add("Maggie");
//		q1.add("Glenn");
//		q1.add("Megan");
//		q1.add("Daryl");
//		System.out.println(q1);
//		q1.element();// Retrieves but doesn't remove, the head of this queue.
//					 // Throws NoSuchElementException if this queue is empty
//		q1.peek();// Retrieves, but doesn't remove, the head of this queue.
//				 //  Return null if this queue is empty
//		q1.poll();// Retrieves and removes the head of this queue
//				 // Return null if this queue is empty
//		q1.offer("XXXX");// Inserts the specified element into this queue
//		q1.add("YYYY");// INserts the specified element into this queue
		
		
		Queue<String> q2=new PriorityQueue<>();
		q2.add("M");
		q2.add("United States");
		q2.add("AB");
		q2.add("Germany");
		q2.add("X");
		q2.add("12345");
		q2.add("345");
		System.out.println(q2);
	}
	
	
}
