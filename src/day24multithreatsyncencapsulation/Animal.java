package day24multithreatsyncencapsulation;
/*
 * In java there is parent-child relationship
 * A parent can have infinitely many child classes
 * A child can have just a single parent Java.
 * It means, Java doens't support multiple inheritance
 * Inheritance means; child classes can use class members from parent class.
 * Inheritance is so beneficial in;
 * 	a) Ending repetition
 * 	b) maintenance
 * 	c) Re-usability
 * Child class may have grandparents as well.
 * Single inheritance; Child can have only one parent
 * Hierarchical Inheritance: A parent will have multiple child classes
 * Multi-level inheritance: if a child has parent, grandparent, grand-grandparent.....
 * 
 */
public class Animal {
	
	public void move() {
		System.out.println("Walk");
	}
	
	public void eat() {
		System.out.println("eat");
	}
	

}
