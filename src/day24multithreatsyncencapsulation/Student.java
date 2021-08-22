package day24multithreatsyncencapsulation;

public class Student {
	/*
	 * Data hiding process is called Encapsulation!
	 * 1)To hide class members, use "private" access modifier for them.
	 * If you don't want anybody to see object details, do not create "toString()"
	 * 2) To read the value of hidden variables, we create "getters", adn by using getters we can read the values
	 * 3) To update value of a variable for a specific student, use "setters".
	 * To make an immutable class 
	 * 				a) make the variables private
	 * 				b) Do not create any setters.
	 * Note: getter() and Setter() methods are called "Java beans" in java
	 * Note: a) getter method names start with "get" followed by " variable name"
	 * int number =11; ==> Getter: getNumber() - Setter: setNumber()
	 * But if the variable is "boolean", getter method names start with "is" followed by "variable name"
	 * boolean old = true; ==> Getter: isOld() - setter: setOld()
	 * Note: a) the return type of getter is the same with the return type of the variable
	 * 		 b) The return type of setter is " void" every time.
	 * 		 c)Getters do not use "parameters" but setters must usr parameters to update the existing value.
	 */
private String name="Mark Stone";

public boolean isSuccessful() {
	return isSuccessful;
}
private int age=33;
private boolean isSuccessful=false;

public Student(String name,int age, boolean isSuccessful) {
	this.name=name;
	this.age = age;
	this.isSuccessful = isSuccessful;
}
public Student() {
	
}

public String getName() {
	return name;
}
public int getAge() {
	return age;
}
public void setName(String name) {
	this.name = name;
}
public void setSuccessful(boolean isSuccessful) {
	this.isSuccessful = isSuccessful;
}
}
