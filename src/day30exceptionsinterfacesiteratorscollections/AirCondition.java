package day30exceptionsinterfacesiteratorscollections;

public interface AirCondition {

	int price=3000;
	void climate();
	void eat();
	/*
	 Interview Question
	 What is the difference between abstract class and Interfaces?
	 	1) Abstract class can have concrete methods without needing any keyword;
	 	2) Interface can have concrete methods with "default and Static" key words
	 	3) In an interface all methods are public and abstract, but in an abstract class
	 	you can have every type of methods
	 	4) All variables are public, static, and final in interfaces, in abstract classes we can have every type of variables
	 	5) Abstract classes have constructors interfaces don't have.
	 	6) Both cannot be instantiated. 
	 	7) A concrete class can have just a single "abstract" class parent but it can have multiple interface parents
	 	8) Class==> Interface use "implements" keyword.
	 		interface==> interface use "extends" keyword.
	 		Class==> class use "extends again.
	 */
}
