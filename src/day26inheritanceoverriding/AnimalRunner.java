package day26inheritanceoverriding;
/*
 * If you use variables whose names are same in inheritance, to understand which
 * variables will be able to see by using objects, remember the following rule;
 * 		Look at the data type which you used in object creation, the variables will be displayed
 * from the class which you used as data type.
 *
 *If you use variables whose names are different in inheritance, to undestand which variables will be able to see
 *by using objects, remember the following rules;
 *1)Look at the data type which you used in object creation, you will be able to see all variables whose name are
 *different in the class which you used as data type and in all parents.
 *2) It is not possible to see variables whose names are different from the child classes of the class which you used as data type.
 */
public class AnimalRunner {
public static void main(String[] args) {
	Mammal b1=new Bird();//mammal decides the variables,
						//Bird() decides the methods.
						//look below
	b1.move();//=>Birds move
	
	
}
}
