package javapractice01;

import java.util.Arrays;

public class InterviewQuestions {
	public static void main(String[] args) throws YesilException, YesilOut2Exception {

		swap("Ali", "Veli");
		swap(1, 2);
		//swap(2.3,1.2);
		anagram("Ali", "ilA");
		//anagram(1234.2,312);
		reverse("String");
		
	}
	
//Write a method that sorts an Array int[] without using the sort method.

	
	
	
	
//Reverse a sentence
public static void reverse(String s) throws YesilOut2Exception {
	if(s instanceof String) {
	System.out.println(new StringBuilder(s).reverse());
	} else {
		throw new YesilOut2Exception("Please not again!");
	}
}
	
	
	
	

//Write a method that checks to see if the words u pass is Anagram.
	public static <E> void anagram(E o1, E o2) {
		if((o1 instanceof String)||(o1 instanceof Integer)) {
		if (o1 instanceof String) {
			anag((String) o1, (String) o2);

		}
		if (o1 instanceof Integer) {
			anag((Integer) o1 + "", (Integer) o2 + "");
		}
		
	}else
			throw new YesilOutException("Please enter Integer or String");
		
	}

	public static boolean anag(String a, String b) {
		char[] ch1 = a.toCharArray();
		char[] ch2 = b.toCharArray();
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		System.out.println(Arrays.equals(ch1, ch2));
		return ch1 == ch2;
	}

//Write a method that swap two variables' values without using temp variable.
	public static <E> void swap(E a, E b) throws YesilException {// Ali+dVeli
		
		if((a instanceof String)||(a instanceof Integer)) { 
		if (a instanceof String) {
			String c = (String) a;
			String d = (String) b;
			c += d;
			d = c.replace(d, "");
			c = c.replace(d, "");
			System.out.println(a + " was " + c);
			System.out.println(b + " was " + d);

		}
		if (a instanceof Integer) {
			int c = (int) a;
			int d = (int) b;
			c += d;
			d = c - d;
			c = c - d;
			System.out.println(a + " was " + c);
			System.out.println(b + " was " + d);
		}
		}else{
		throw new InterviewQuestions().new YesilException("Parameter should be instance of String or Integer");	
		}
		

	}
	
	
class YesilException extends Exception {
public	YesilException(String message){
		super(message);
	}
	
	
	
}
	
	

}

class YesilOutException extends RuntimeException{
	public YesilOutException(String message) {
		super(message);
	}
	
	
}
class YesilOut2Exception extends Exception{
	
public YesilOut2Exception(String message) {
	super(message);
}
}
