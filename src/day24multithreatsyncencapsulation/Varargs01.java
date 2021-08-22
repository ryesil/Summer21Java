package day24multithreatsyncencapsulation;

public class Varargs01 {
/*
 * Behind the varargs java uses arrays. because of that, varargs behaves like arrays with some differences. VarArgs are like arrays.
 * 
 * 
 */
	public static void main(String[] args) {
/*
 * Behind the varargs java uses arrays, because of that varargs behaves like arrays with some differences
 * YOu cannot use more than one varargs in a method paranthesis
 * varargs must be the last parameter everytime
 * ".." can be put just after data type (int..a) or just before varargs name(int..a) others do not work 
 * Note if you need same method to use with diffrent number of parameters, use "varargs"
 */
		
		
	}
	
//	public static int add() {
//		return 3+5;
//	}
//	
//	
//	public static int add(int a, int b) {
//		return a+b;
//	}
//	
//	public static int add(int a,int b,int c) {
//		return a+b+c;
//	}
	public static int add(int...a) {
		int sum=0;
		for(int w: a) {
			sum+=w;
		}
		return sum;
	}
	
	

}
