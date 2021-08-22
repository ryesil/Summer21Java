package day14methodoverloadingconstruction;

public class Car {
	// Instance variable
	String make;
	int price;
	int year;
	String model;
	String color;
	static int soldCarCounter=0;// default value for integers is 0.
	
	public static void main(String[] args) {
		// Object creation
		//Class Name    Object name= new Constructor;
		Car car01=new Car("Audi",20000,2017,"Q5","Black" );
		System.out.println(soldCarCounter);
		System.out.println(car01.make);
		Car car02=new Car("Honda",20000,2017,"CRV","red" );
		System.out.println(soldCarCounter);
		System.out.println(car01.soldCarCounter);// static variables should be accessed directly from the class. No need through and object.
		System.out.println(car02.soldCarCounter);// When you want to look at the value of a class variable, no need to use object.
		Car car03=new Car("Lexus",22000,2020,"RC2000" );
		System.out.println(car02.soldCarCounter);
		Car car04=new Car(2200,2020);
		System.out.println(car04.price);
		System.out.println(car04.year);
		System.out.println(soldCarCounter);
		
		Car car05=new Car();
		
		
	}
	
	public Car(String make, int price, int year, String model, String color) {
		this.make = make;
		this.price = price;
		this.year = year;
		this.model = model;
		this.color = color;
		soldCarCounter++;
	}
	public Car(String make, int price, int year, String model) {
		this.make = make;
		this.price = price;
		this.year = year;
		this.model = model;
		soldCarCounter++;
	}
	public Car(int price, int year) {
		this.price = price;
		this.year = year;
		soldCarCounter++;
	}
	
	public Car() {
		soldCarCounter++;
	}
	
}
