package day26inheritanceoverriding;

/*
 * super()
 * 1) super() is used to call a specific constructor from parent class.
 * Typing super() or not typing "super()" have same meaning if no parameter is used.
 * super() must be used in the first line inside the constructor.
 * super() can be used just once inside a constructor
 * 
 */


public class Bird extends Mammal {
	String name="bird";
	int height=11;
	byte ageOfBird=1;
	

	
	
	public Bird() {
		super(3);
		System.out.println(super.ageOfAnimal);
		System.out.println(super.ageOfMammal);
		System.out.println(super.height);
		System.out.println(super.name);
		System.out.println("Child contructor ran...");
		super.move();
	}
	
	public void move() {
		System.out.println("Birds move");
	}

	public void fly() {
		System.out.println("Birds fly");
	}
	
}
