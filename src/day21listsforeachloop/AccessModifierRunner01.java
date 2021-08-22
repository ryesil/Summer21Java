package day21listsforeachloop;

import day24multithreatsyncencapsulation.AccessModifier01;

public class AccessModifierRunner01 {

	public static void main(String[] args) {
		AccessModifier01 obj1=new AccessModifier01();
		/*
		 * By using obj1, YOu cannot access to profession because profession is in private and you are trinh it in a different class.
		 * By using obj1, you cannot access to school because school is using default access modifier and you cannot access default class
		 * member from any other packages. 
		 *  By using obj1, you cannot access to address because address is using protected access modifier and you cannot access protected class
		 * member from any other packages unless they are child class.
		 * By using obj1, you can access to name because it is public .
		 */


	}

}
