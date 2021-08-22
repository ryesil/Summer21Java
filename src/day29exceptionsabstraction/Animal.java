package day29exceptionsabstraction;
/*
 1) Abstract methods can be stored in "Abstract Classes
 2) To create an abstract Method
 	a) Do not put method body
 	b) Put abstract keyword between access modifier and return type.
 3) For abstract methods, "public protected and default access modifiers can be used but private cannot.
 because we create abstract methods to access from child classes.
 4) Abstract classes can have concrete methods as well. but concrete classes can have just 
 concrete methods.
 5) Abstract methods must be overridden by child classes, otherwise you will get CTE
 	Abstract: Because of that, If we think sth is a must for every child class,
 	we make them abstract then child classes have to override them.
 6) Just concrete child classes must override abstract methods, it is not must to override
 abstract methods for abstract child classes.
 7) If an abstract method is overridden by class x, child classes of the class X may or may not override the method.
 8) You cannot create object from abstract classes,
 9) Abstract classes are classes becasue of that they have constructor, but constructors are not used to create objects,
 they can be used to initialize variables.
 
 */
public abstract class Animal {

abstract void eat();

public void drink() {
	System.out.println("They drink");
}

	
}
