package day21listsforeachloop;

import java.util.ArrayList;
import java.util.List;

public class PassByValue {
	/*
	 IF you use a value inside a method, java doesn't use the original variable inside the method.
	 Java creates the copy of the variable then use the copy inside the method.
	 By using the copy, java protects the original valeu from method updates.
	 Following feature is called "pass by value" in Java.
	 2) If you insist to update original value, you can do it by assigning method return to the variable like:
	 a= increase(a);
	 */
	
public static void main(String[] args) {
	int a=10;
	System.out.println("Before"+a);
	/*
	2) For primitives, method call doesn't change the original value like in primitives.
	 If you want to change the original value you should do assignment like;
	 s=putQuestionMark(s)
	 */
	a=increase(a);
	
	System.out.println("after "+a);
	

	String s="Are you tired";
	System.out.println("before "+s);
	putQuestionMark(s);
	System.out.println("after "+s);
	/*
	 When we use list methods, list will be updated
	 If you want to keep original list in your application, use List.copyOf() method.
	 */
	List<String> list=new ArrayList<>();
	list.add("Hi");
	list.add("Wooow");
	list.add("Sorry");
	System.out.println("Before "+ list);
	List<String> list2=List.copyOf(list);
	
	putExclamationMark(list);
	
	System.out.println("after "+list);
}

public static int increase(int x) {
	x=x*3;
	return x;
	
	
}
	
public static String putQuestionMark(String str) {
return str+"?";
}	
public static List putExclamationMark(List<String> list) {
	for(int i=0;i<list.size();i++) {
		list.set(i,list.get(i)+"!");
	}
	return list;
}
/*
 1)For mutable objects Java copies the reference then use the copy of reference inside the method.
 Reference itself and copy of reference points the same object, because of that when you call a method 
 for mutable onjects, original value will be updated.
 2) For immutable objects, method call doesn't change the original value like in primitives.
 If you want to change the original value you should do assignment like;
 s=putQuestionMark(s)
 */

}
