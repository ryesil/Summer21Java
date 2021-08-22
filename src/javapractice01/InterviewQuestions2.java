package javapractice01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class InterviewQuestions2 {
	/*
	 * 
	 * Write a method that sorts an Array int[] without using the sort method. Write
	 * a method that returns how many times each letter is repeated? Write a method
	 * that checks if word is palindrome. A palindrome is a word, number, phrase, or
	 * other sequence of characters which reads the same backward as forward, such
	 * as madam or racecar or the number 10801. Write a method that returns nth
	 * fibonacci number on given a number num. In fibonacci series, next number is
	 * the sum of previous two numbers for example 0, 1, 1, 2, 3, 5, 8, 13, 21, 34,
	 * 55, 89, 144,... Write a method that takes an array of integers between 1 and
	 * 10 (excluding one number) and returns the missing number.EX:
	 * missingNumber([1, 2, 3, 4, 6, 7, 8, 9, 10]) 5 Write a method that checks if
	 * the passing argument is a prime number. Write a method that finds remainder
	 * of 2 numbers without using the % operator?
	 * 
	 */
	public static void main(String[] args) throws MyException {

		// {65,4,5,9,8,7,12,5,4,33,3,3,2}i=0
//		int[] arr = { 12, 4, 5, 9, 8, 7, 65, 5, 4, 33, 3, 3, 2 };
//		sorter(arr);
//		repeater("Custommmm");
//		System.out.println(palindrome(10801));
//		System.out.println(palindrome(10.2));
//		System.out.println(palindrome2("AsdaddadsA"));
//		System.out.println(missing(1,2,4,5,7,6,8,9,10));
//		System.out.println(prime(13));
		// System.out.println(divide(400098776,7));
		// System.out.println(pangram("zxcvbnmasdf ghjklqwertyuiop"));
		//System.out.println(pangram3("12The quick brown fox jumps over the lazy dog"));
		//sumGame();
		//summer("12sdf");
		//List<Integer> list=new ArrayList<>();
	
System.out.println(longestName());
		
		
	}
	public static String longestName() {
		List<String> list=names();
		String longestName=list.get(0);
		for(String w:list) {
			if(w.length()>longestName.length())
			longestName=w;
			
		}
		return longestName;
		
	}
	
	public static List names() {
		List<String> list=new ArrayList<>();
		int size=3+new Random().nextInt(20);
		while(list.size()<size) {
			list.add(name());	
		}
		return list;
	}
	
	
	public static String name() {
		int nameLength=5+new Random().nextInt(15);
		String name="";
		while(name.length()<=nameLength) {
				name+=alp().get(new Random().nextInt(26));	
			}
			return name;
		}
		
	
	
	public static List alp() {
		List<Character> list=new ArrayList<>();
		
		for(int i='a';i<='z';i++) {
			list.add((char) i);
		}
		return list;
	}
	
	

	public static List remove2(List<Integer> num) {
	Iterator it=num.iterator();
	List<Integer> list=new ArrayList<>();
	while(it.hasNext()) {
	if(!list.contains(it.next())) {
		list.add((Integer) it.next());
	}
		
	}
	return list;		
	}
	
	
public static Set remove(List<Integer> num){
	System.out.println(new LinkedHashSet<Integer>(num));
	return new LinkedHashSet<Integer>(num);
}
	
	
	
	
	
public static void summer(String num) {
	int sum=0;
for(char w: num.toCharArray()) {
	if(Character.isDigit(w)) {
		sum+=Integer.parseInt(w+"");
	}
}
System.out.println(sum);
// 2.Write a method where u ask a user to enter a number until the total is 100
//    or number of trials is equal to 3.	
//	public static void sumGame() {
//		Scanner scan=new Scanner(System.in);
//		int sum,trials;
//		sum=trials=0;
//		while(sum<100&&trials<3) {
//			System.out.println("Enter a number");
//			sum+=scan.nextInt();
//			trials++;
//		}
//if(sum>=100) {
//	System.out.println("Great you win!!!");
//} throw new RuntimeException()
//}
	

	}

	// 2.Write a method where u ask a user to enter a number
	// until the total is 100 or number of trials is equal to 3.
	// EX: 1,2,3 --> You ran out of trials! EX2: 1,2,97 -->
	// You made it! your sum is 100.

	public static boolean pangram3(String s) {
		Set<String> set = new TreeSet<>();
		String str[] = s.toLowerCase().replaceAll("[^a-z]", "").split("");
		System.out.println(Arrays.toString(str));
		Collections.addAll(set, str);
		System.out.println(set);
		return set.size() == 26;

	}

	public static boolean pangram(String s1) {
		for (int i = 'a'; i <= 'z'; i++) {
			if (!s1.toLowerCase().replace("\s+", "").contains((char) i + ""))
				return false;
		}
		return true;
	}

	public static boolean pangram2(String s) {

		Set<Character> chars = new TreeSet<>();
		Set<Character> chars2 = new TreeSet<>();
		for (int i = 'a'; i <= 'z'; i++) {
			chars2.add((char) i);
		}
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != ' ' && (chars2.contains(s.charAt(i))))
				chars.add(s.toLowerCase().charAt(i));
		}

		System.out.println(chars);
		return chars.containsAll(chars2);
	}

	public static int fib(int a) {
		if (a <= 1)
			return a;
		return fib(a - 1) + fib(a - 2);
	}

	public static int divide(int num, int num2) {
		int i = 0;
		while (num2 * i < num) {
			i++;
			if (num2 * i > num) {
				i--;
				break;
			}
		}
		return num - num2 * i;

	}

	public static boolean prime(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0)
				count++;
		}
		if (count == 2)
			return true;
		return false;

	}

	public static int missing(int... arr) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		int sum2 = Arrays.stream(arr).sum();
		return sum - sum2;
	}

	public static boolean palindrome2(String s) {

		String ss = "";
		for (int i = s.length() - 1; i >= 0; i--) {
			ss += s.charAt(i);
		}
		return s.equals(ss);
	}

	public static <E> boolean palindrome(E o) {
		if (o instanceof String) {
			String s = (String) o;
			return s.equals(new StringBuffer(s).reverse().toString());
		} else if (o instanceof Integer) {
			String s = String.valueOf((Integer) o);
			return s.equals(new StringBuffer(s).reverse().toString());
		} else {
			throw new InterviewQuestions2().new ReverseException("String or Integer");
		}

	}

	class ReverseException extends RuntimeException {
		ReverseException(String message) {
			super(message);
		}
	}

//Write a method that returns how many times each letter is repeated? ramazan 
	public static void repeater(String str) throws MyException {
		String store = "";
		if (str instanceof String) {
			store = "";
			int counter = 0;
			for (int i = 0; i < str.length(); i++) {
				counter = 0;
				for (int j = 0; j < str.length(); j++) {
					if (str.charAt(i) == str.charAt(j)) {
						counter++;
					}
				}

				if (!store.contains(str.charAt(i) + ""))
					store = store + str.charAt(i) + "=  " + counter + "| ";

			}
		} else {
			throw new MyException("Please enter a string");
		}
		System.out.println(store);
	}

//Write a method that sorts an Array int[] without using the sort method.
	public static void sorter(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));

	}

}

class MyException extends Exception {
	public MyException(String message) {
		super(message);
	}
}
