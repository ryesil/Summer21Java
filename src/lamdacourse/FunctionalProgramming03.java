package lamdacourse;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

class edabit{
public static String add(String str) {
	return str.concat("Edabit");
}
}


public class FunctionalProgramming03 {
	
	
	
public static void main(String[] args) {
	
	List<String> l = new ArrayList<>();
    l.add("Ali");
    l.add("Ali");
    l.add("Mark");
    l.add("Amanda");
    l.add("Christopher");
    l.add("Jackson");
    l.add("Mariano");
    l.add("Alberto");
    l.add("Tucker");
    l.add("Benjamin");
    //printSortedBylength(l);
    //printDistinctSortedByLastChar(l);
   // printSortedByLengthThenFirstChar(l);
   // removeIfLengthgreaterThanFive(l);
    //removeIfSt(l);
    //distinctReverseOrderOfSquareOfNumbers(l);
    //angleSum(3);
  //edabitAdder("mehmet");
    //reOrder("Ahmet Mahmet");
  //System.out.println(consecutiveNumbers("1222233344"));
    Integer[] arr= {1,2,3,5,6,7,-5};
    List<Integer> list=new ArrayList<>();
    Collections.addAll(list, arr);
    System.out.println(order1(list));
   // oneLarger(arr,3);
    System.out.println(diff(arr));
    
    
    
}




public static List<Integer> order1(List<Integer> l){
	return l.stream().sorted().collect(Collectors.toList());
}

//Create the function that takes an array with objects and returns the sum of people's budgets.
public static int butget(List<Integer> l) {
	int sum=l.stream().reduce(0,Math::addExact);
	return sum;
}



//Create a function that takes an array and returns the difference between the biggest and smallest numbers.
public static int diff(Integer[] arr) {
	List<Integer> list=new ArrayList<>();
	Collections.addAll(list, arr);
	int min=list.stream().sorted().findFirst().get();
	int max=list.stream().sorted(Comparator.reverseOrder()).findFirst().get();
	return max-min;
}


//Write a function that returns true if there exists at least one number that is larger than or equal to n.
public static boolean oneLarger(Integer[] arr,int n) {	
List<Integer> list=new LinkedList<>();
Collections.addAll(list,arr);
return list.stream().anyMatch(t->t>n);	
}

//Write a function that returns true if a string consists of ascending or ascending AND consecutive numbers.

public static boolean consecutiveNumbers(String str) {
	int[] arr=new int[str.length()-1];
	for(int i=0;i<arr.length;i++) {
		arr[i]=Integer.valueOf(str.charAt(i));
	}
	String str2="";
	Arrays.sort(arr);
	for(int w:arr) {
		str2+=w;
	}
	return str2.equals(str);
}



//Write a function that takes a string, breaks it up and returns it with vowels first,
//consonants second. For any character that's not a vowel (like special characters or spaces), treat them like consonants.

public static void reOrder(String str) {
	String arr[]=str.split("");
	List<String> list=new ArrayList<>();
	Collections.addAll(list, arr);
	System.out.println(list);
	list.stream().filter(t->t!=" ").filter(Utils::isWovel).forEach(t->System.out.print(t));
	list.stream().filter(t->t!=" ").filter(Utils::isConsanant).forEach(t->System.out.print(t));
	
}





//Create a function that reorders the digits of each numerical element in an array based on ascending (asc) or descending (desc) order.
public static void order(List<Integer> l) {
	l.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
}





//A student learning Java was trying to make a function.
//His code should concatenate a passed string name with string 
//"Edabit" and store it in a variable called result. He needs your help to fix this code.

public static void edabitAdder(String str) {
List<String> list=new ArrayList<>();
list.add(str);
list.stream().map(edabit::add).forEach(System.out::println);	
}


//10) Create a method to check if at least one of the elements ending with “R”

public static void lastQuestion(List<String> l) {
	boolean result=l.stream().anyMatch(t->t.endsWith("R"));
	System.out.println(result);
}




//9) Create a method to check if the initial of any element is not ‘X’
public static boolean initialNotX(List<String> l) {	
return	l.stream().anyMatch(t->t.charAt(0)=='X');
}
public static void checkInitials(List<String> l) {
	boolean result=l.stream().noneMatch(t->t.startsWith("X"));
	System.out.println(result);
}
//8) Create a method to check if the lengths of all elements are less than 12

public static boolean lengthsOfAllElLessThanTwelve(List<String> l) {
	return l.stream().allMatch(t->t.length()<12);
	
}

//7) Create a method which takes the square of the length of every element, prints them distinctly in reverse order
public static void distinctReverseOrderOfSquareOfNumbers(List<String> l) {
	l.stream().map(t->t.length()*t.length()).distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
}

public static void distinctReverseOrderOfSquareOfNumbers2(List<String> l) {
	l.stream().map(String::length).map(Utils::getSquare).distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
}

//6) Remove the elements if the element is starting with 'A' or 'a' or ending with 'N', 'n'

public static void removeIfSt(List<String> l) {
	
	l.removeIf(t->t.matches(""));
	System.out.println(l);
	
	
}




//5) Remove the elements if the length of the element is greater than 5

public static void removeIfLengthgreaterThanFive(List<String> l) {
	l.removeIf(t->t.length()>5);
	System.out.println("The length of all elements is less than 5"+l);
	
}


//4) Create a method to sort the elements according to their lengths then accourding to their first character

public static void printSortedByLengthThenFirstChar(List<String> l) {
	l.stream().sorted(Comparator.comparing(String::length).thenComparing(t->t.charAt(0))).forEach(System.out::println);
}


//3) Create a method to sort the distinct elements by using their last characters
public static void printDistinctSortedByLastChar(List<String> l) {
	l.stream().distinct().sorted(Comparator.comparing(t->t.charAt(t.length()-1))).forEach(System.out::println);
}

//1. Create a method to print all list elements in upperCase
public static void printUpperCase1(List<String> l) {

	l.stream().map(String::toUpperCase).forEach(Utils::printInTheSameLineWithASpace);
}
public static void printUpperCase2(List<String> l) {
	l.replaceAll(String::toUpperCase);
	System.out.println(l);
}

//3) Create a method to print the elements after ordering according to their lengths
public static void printSortedBylength(List<String> l) {
	l.stream().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
}

//Given an n-sided regular polygon n, return the total sum of internal angles (in degrees).
public static void angleSum(Integer n) {
	List<Integer> list=new ArrayList<>();
	list.add(n);
	int angleSum=list.stream().reduce(0,(t,u)->t=(u-2)*180);
	System.out.println(angleSum);
	
}



}
