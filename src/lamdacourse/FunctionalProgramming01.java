package lamdacourse;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalProgramming01 {
/*
 1) Lambda is functional programming
 2) Functional programming was added to Java in Java 8, before Java 8 we were
 using just structured programming but after Java 8, we are able to use both
 Functional Programming and Functional Programming. 
 3) Structured Programming focuses on "How to do" most of the times, 
 Functional Programming focuses on "What to do"
 4) Functional Programming is used with Collections and Arrays
 
 */
	
	public static void main(String[] args) throws Exception {
	
		List<Integer> l = new ArrayList<Integer>();
        l.add(12);
        l.add(9);
        l.add(13);
        l.add(14);
        l.add(9);
        l.add(10);
        l.add(4);
        l.add(12);
        l.add(15);
        printElStructured(l);
        System.out.println();
//        System.out.println();
//        printElFunctional(l);
        productOfCubeOfDistincts(l);
     
        productOfCubeOfDistincts2(l);
//        getMax(l);
//        getMin(l);
//        
//        getMax3(l);
        
//        getMin3(l);
//        minAndGreater(l);
//        minAndGreater2(l);
//        getHalfOfDistinctElementsReversed(l);
        min(l);
        max(l);
        
	}
	public static void min(List<Integer> l) throws Exception {//1,2,3,4,5
	int x=(int) l.stream().sorted().limit(1).toArray()[0];
	System.out.println(x);
	}
	public static void max(List<Integer> l) {
		int x=(int) l.stream().sorted().skip(l.size()-1).toArray()[0];
	System.out.println(x);
	}
	//10)Create a method to find the half of the elements which are distinct and greater than 5 in reverse order from the list.
	public static void getHalfOfDistinctElementsReversed(List<Integer> l) {
	List<Double> result=l.stream().distinct().filter(t->t>5).map(t->t/2.0).sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println("Half of the elements list: "+ result);
		
	}
	
	
	//9 create a method to find the min value which is greater than 7 and even.
	public static void minAndGreater2(List<Integer> l) {
	Integer minEl=l.stream().distinct().filter(t->t>7&&t%2==0).sorted().findFirst().get();//Use find first with get method
																						 //To get integer return type.
		System.out.println(minEl);
	}
	
	public static void minAndGreater(List<Integer>l) {
	Integer min=l.stream().distinct().filter(t->(t%2==0&&t>7)).sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE, (t,u)->u);
	System.out.println(min);
	}
	
	
	
	// 8) Create a method to find the minimum value from the list elements
	public static void getMin(List<Integer> l) {
		int min=l.stream().reduce(Integer.MAX_VALUE,(t,u)->t<u?t:u);
		System.out.println(min);
	}
	public static void getMin2(List<Integer> l) {
		int min=l.stream().sorted().findFirst().get();
	}
	public static void getMin3(List<Integer> l) {
		Integer min=l.stream().distinct().sorted(Comparator.reverseOrder()).reduce(Integer.MAX_VALUE,(t,u)->u);
		System.out.println(min);
	}
	
	
	//7)Create a method to find the maximum value from the list elements
	public static void getMax(List<Integer> l) {
	
		int x=l.stream().reduce(Integer.MIN_VALUE,(t,u)->u>t?t=u:t);
		System.out.println(x);
	}
	
public static void getMax3(List<Integer> l) {
		//Sort then get the second
		Integer maxELm=l.stream().distinct().sorted().reduce(Integer.MIN_VALUE,(t,u)->u);
	}
	
	//6)Create a method to calculate the product of the cubes of distinct even elements
	public static void productOfCubeOfDistincts(List<Integer> l) {
		int i =l.stream().distinct().filter(t->t%2==0).reduce(1,(t,u)->t*(u*u*u));
		System.out.println(i);
	}
	public static void productOfCubeOfDistincts2(List<Integer> l) {
		Integer prod=l.stream().distinct().filter(t->t%2==0).map(t->t*t*t).reduce(1,(t,u)->t*u);
		System.out.println(prod);
	}
	
	//5)Create a method to calculate the sum of the squares of distinct even elements
	public static void sumOfSquareOfDistinctEven(List<Integer> l) {
		int sum=l.stream().distinct().filter(t->t%2==0).map(t->t*t).reduce(0,(t,u)->t+u);
		System.out.println(sum);
	}
	
	public static void sumOfSquareOfDistinctEven2(List<Integer> l) {
		int sum=l.stream().distinct().filter(t->t%2==0).reduce(0,(t,u)->t+u*u);
		System.out.println(sum);
	}
	
	
	//3)Create a method to print the square of odd list elements on the console in the
	//same line with a space between two consecutive elements.
	
	
	public static void printSquareOfOdd(List<Integer> l) {
		l.stream().distinct().filter(t->t%2==1).map(t->t*t).forEach(t->System.out.print(t+ " "));
		
	}
	
	
	//4)Create a method to print the cube of distinct
	//odd list elements on the console in the same line with a space between two consecutive elements.
	public static void printCubeOfOdd(List<Integer> l) {
		l.stream().distinct().filter(t->t%2!=0).map(t->t*t*t).forEach(t->System.out.print(t+" "));
	}
	
	///2)Create a method to print the even list elements on the console in the same
	//line with a space between two consecutive elements.(Structured)
	
	public static void printEvenFunctional(List<Integer> l) {
		l.stream().filter(t->t%2==0).forEach(t->System.out.print(t+" "));	
	}
	
	public static void printEvenStructured(List<Integer> l ) {
		for(Integer w:l) {
			if(w%2==0)
				System.out.print(w+"");
		}
	}
	
	
///1a)Create a method to print the list elements on the console in the same line with a space between two consecutive elements.(Structured)
	public static void printElStructured(List<Integer> l) {
		for(Integer w:l) {
			System.out.print(w+ " ");
		}
		
	}
	//1b)Functional version of below question
		public static void printElFunctional(List<Integer> l) {
			l.stream().forEach(t->System.out.print(t+" "));
		 
		}
}
