package day26inheritanceoverriding;

public class Animal {
	String name ="animal";
	int height=33;
	byte ageOfAnimal=3;
	
	public Animal() {
	System.out.println("Parent Animal Constructor ran...");	
	}
	
	public Animal(String name) {
		this();
		System.out.println("Parent Constructor with parameters has ran...");
	}
	public void move() {
		System.out.println("animals move");
	}
	
	public void eat() {
		System.out.println("animals eat");
	}
	
}
