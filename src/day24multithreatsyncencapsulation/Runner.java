package day24multithreatsyncencapsulation;

public class Runner {

	public static void main(String[] args) {
		Cat cat1=new Cat();
		cat1.eat();
		
		Dog dog1=new Dog();
		dog1.move();
		dog1.eat();
		dog1.bark();
		
		Bird bird1=new Bird();
		bird1.fly();
		bird1.move();
		bird1.eat();
		bird1.fly();
		
	}

}
