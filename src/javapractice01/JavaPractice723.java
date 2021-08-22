package javapractice01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class JavaPractice723 {
	public static void main(String[] args) {

//String[] arr1= {"john","brad","ange","sohpe"};
//String[] arr2= {"john","brad","asfdf","adsd"};	
//	System.out.println(common(arr1,arr2));

//		System.out.println(natural(new String[][] { { "John", "Brad", "Fox" }, { "Lee", "Ali" }, { "Suzan" } }));
//		System.out.println(natural(new String[][] { { "John", "Brad", "Fox" }, { "Lee", "Ali" }, { "Suzan" } }));
//System.out.println(repeat());

int arr[]= {1,2,2,3,43,4,5};
	
	//System.out.println(Arrays.stream(arr).reduce(0, );
email();

	}

	public static void email() {
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter your email");
		String email=in.next();
		if(email.contains("@")) {
			if(email.substring(email.indexOf("@")).contains("gmail.com")||email.substring(email.indexOf("@")).contains("hotmail.com")) {
				System.out.println("confirmed");
			}else {
				System.out.println("Enter gmail or hotmail account");
			}
		}else {
			System.out.println("Not a valid email");
		}
	}
	
	
	
	
	
	
	
public static int sum(int...arr) {
	int summer=0;
	for(int w:arr) {
		summer+=w;
	}
	System.out.println(summer);
	return summer;
}
	
	
	
	
	
public static String repeat() {
	Scanner in=new Scanner(System.in);
	System.out.println("string ?");
	String str=in.next();

char arr[]=str.toCharArray();
	String store="";
	for(int i=0;i<str.length();i++) {
		String temp="";
		int count=0;
		for(int j=0;j<str.length();j++) {
			if(arr[i]==arr[j]) {
				count++;
			}
		}
		if(count>1) {
		temp=arr[i]+"==>"+count+"\n";	
		}
		if(!store.contains(temp)) {
			store+=temp;
		}
	}
	store=store.length()>0?store:"No repeatiton!";
	System.out.println(store);
	return store;
	
}
	
	
	
	
	
	public static List<String> order(String[][] arr) {
		List<String> list = new ArrayList<>();
		for (String[] w : arr) {
			for (String x : w) {
				list.add(x);
			}
		}
		Collections.sort(list);
		return list;

	}

	public static Set<String> natural(String[][] arr) {
		Set<String> arr1 = new TreeSet<>();

		for (String[] w : arr) {
			for (String x : w) {
				arr1.add(x);
			}
		}

		return arr1;
	}

	public static Set<String> common(String arr1[], String arr2[]) {

		Set<String> set1 = new HashSet<>();
		Set<String> set2 = new HashSet<>();
		for (String w : arr1) {
			set1.add(w.toLowerCase());
		}
		for (String w : arr2) {
			set2.add(w.toLowerCase());
		}

		set1.retainAll(set2);

		return set1;

	}
}
