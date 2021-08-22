package lamdacourse;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FunctionalProgramming04 {

	public static void main(String[] args) {
		
		
		List<Integer> l = new ArrayList<Integer>();
        l.add(12);
        l.add(9);
        l.add(13);
        l.add(4);
        l.add(9);
        l.add(2);
        l.add(4);
        l.add(12);
        l.add(15);
        sum(l);
        getSumOfIntsFrom7To100();
        getSumOfIntsFrom7To100B();
        System.out.println(fac2(5));
        sumOfDigits(123,127);
        
	}
	
	//6)
	
	public static void sumOfDigits(int a,int b) {
		System.out.println(IntStream.rangeClosed(a, b).map(Utils::getSumOfDigits).sum());
	}
	
	
	
	
	//5 Find the sum of Even integers between a and b
	public static void evenSum(int a, int b) {
		System.out.println(IntStream.rangeClosed(a, b).filter(Utils::chechToBeEven).sum());
	}
	
	
	
	
	
	
	//4)Find the factorial of a number
	public static int fac2(int n) {
		if(n==1)
		return n;
		
	return	(n*fac2(n-1));
	}
	
	public static void fac(int f) {
		Integer result =0;
		if(f<0) {
			System.out.println("Do not use negative numbers...");
		} else {
			
		System.out.println(IntStream.rangeClosed(1, f).reduce(1,Math::multiplyExact));
		}
	}
	
	
	//3)Create a method to find the multiplication of the integers from 2(inc) to 11(inc)

	
	public static void mul() {
		System.out.println(IntStream.rangeClosed(2, 11).reduce(1, Math::multiplyExact));
	}
	
	
	
	//2))Create a method to find the sum of all elements from 7 to 100;
	
	public static void getSumOfIntsFrom7To100B() {
		System.out.println(IntStream.rangeClosed(7, 100).sum());//Returns the sum of the integers
	}
	
	
	public static void getSumOfIntsFrom7To100() {
		System.out.println(IntStream.range(7, 101).reduce(0,Math::addExact));
	}
	
	
	
	
	
	//1))Create a method to find the sum of all elements in the list
	public static void sum2(List<Integer> l) {
		int sum=l.stream().reduce(0,Math::addExact);
		System.out.println(sum);
		
	}
	public static void sum(List<Integer> l) {
		int sum=l.stream().reduce(0,Integer::sum);
		System.out.println(sum);
		
		
		
	}
	
	
}
