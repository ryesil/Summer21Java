package day15constructors;
/*
We use intance variables in constructors as parameters, because constructors create objects and they use object related variables
which are instance variables.
We don't use class variables inside the constructors, because class varialbes are related with class not with objects.

We can use constructor we can use other constructors
*/
public class Animals {

	String name;  //instance variable
	int age;
	boolean isCarnivorous;
	String specy;
	char gender;
	
	static int counter;// class variable

	public Animals() {
		counter++;
	}
	
	public Animals(String name, int age, boolean isCarnivorous, String specy, char gender) {
		this.name = name;
		this.age = age;
		this.isCarnivorous = isCarnivorous;
		this.specy = specy;
		this.gender = gender;
		counter++;
	}

	public Animals(String name, int age, char gender) {
		this();// uses the Constructor w/o any parameter.
		this.name = name;
		this.age = age;
		this.gender = gender;
		counter++;
	}
	
	public Animals(String specy) {
		/*
		1)this() is called for constructor call 
		2) this() must be in the first line inside the constructor.
		3) In a constructor, how many times can "this()" be used? at most once. Because this() must be in the first line, If you use more
		than once where will you put it? You need to put it into second, third...etc lines but it is not allowed.
		
		*/
		this("Bobby",5,'M');// will use another constructor with the matching arguments. and you cannot use another constructor
		this.specy = specy;
		counter++;
	}
	
	
	
	
	
}
