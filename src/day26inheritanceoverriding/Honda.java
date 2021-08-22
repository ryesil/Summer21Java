package day26inheritanceoverriding;

public class Honda extends Car {
/*
 * 1) when you override a method, you can use same access modifier,
 * 2) Access modifier in child class cannot have narrower access modifier,
 * Common interview question
 * 3) private methods cannot be overridden, because overriding means
 * we want to use method in another class, but private class members cannot
 * be used in other classes.
 * @Override annotation checks for overriding rules. So Even if the parent has private method
 * and we can still use that method in child class w/o using @override annotation.
 * 
 * final methods cannot be overridden, because final method's body cannot be updated but in overriding,
 * we update the method.
 * 
 * Static methods cannot be overriden, because static methods are common methods for all child classes.
 * If any child can update it, the other classes will be effected, it can create problems because of that java
 * doesn't let overriding for static methods.
 * 
 * 4) @Override annotation checks the overriding rules, if there is any missed or used wrongly overriding rule, it will give CTE.
 * 5) In overriding, return types of "overridden" and "overriding" methods can be same.
 * overridden==> upper(parent) class/ parent class yazilmis
 * overriding==>child class// child class yaziyor.
 * 6) In overriding, from "overriding" method return type to "overridden" method return type must have "IS-A" relationship.
 * Note: if there is a "IS-A" relationship between return types, Return types are called "Covariant Return types"
 * 7) In overriding, if the return type is "primitive return types of overriden and overriding methods must be the same.
 * 8) in overriding, if the return type is "void"
 * return types of overridden and overriding methods must be 'void".
 * 
 * 
 */
	@Override// check overriding rules.
	public void move() {
		System.out.println("Honda moves fast...");
		return;
	}

	
	
	
	
}
