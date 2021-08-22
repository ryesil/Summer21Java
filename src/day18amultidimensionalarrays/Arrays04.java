package day18amultidimensionalarrays;

import java.util.Arrays;

public class Arrays04 {
public static void main(String[] args) {
	//How to check if two arrays are eqaul to each other.
	String[] s1= {"Ali", "Can", "Veli"};
	String[] s2= {"Can", "Veli", "Ali"};
	Arrays.sort(s1);
	Arrays.sort(s2);
	System.out.println(Arrays.equals(s1, s2));
	String s4="Ali Can went to School";
	//How many characters except space were used in the String "Ali Can went to school"
	String charsExceptSpace[] =s4.replace(" ","").split("");
	System.out.println(Arrays.toString(charsExceptSpace));
	System.out.println(charsExceptSpace.length);
	
	//How many 'a' was used in the String "Mama may I go to Alabama";
	
	String s5="amam Mama may I go to ALabama"; //8
//	String arr[]=s5.replaceAll("[^a]","").split("");//[a,a,a,a,a,a,a,a]
//	System.out.println(Arrays.toString(arr));//[a,a,a,a,a,a,a,a]
//	System.out.println(arr.length);//8
	
//	String arr[]=s5.split("a");
//	System.out.println(Arrays.toString(arr));
//	if(!s5.startsWith("a")&&!s5.endsWith("a")) {
//		System.out.println("-->"arr.length-1);
//	}else if(!s5.startsWith("a")&&)
	
	//Second way
	String a1[]=s5.split("");
	String a2[]=s5.replace("a","").split("");
	System.out.println("Second way: "+(a1.length-a2.length));
	//3rd way 
	int count=0;
	
	for(int i=0;i<s5.length();i++) {
		if(s5.charAt(i)=='a') {
			count++;
		}
	}
	System.out.println("third way: "+count);
	
	//4th way
	System.out.println("fourth way: "+s5.replaceAll("[^a]", "").length());
	
}
}
