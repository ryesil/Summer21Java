package day25encapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InterviewQuestion {

	public static void main(String[] args) {
	/*
	 * Print 0 to 100 w/o using any number.
	 */

		for(int i="a".compareTo("a");i<=('z'-'a')*('e'-'a');i++) {
			System.out.println(i);
		}
		
		/*
		 *  If the characters and the numbers of characters of the Strings are same then print "Anagram" on the console.
		  Otherwise, print "Not Anagram" on the console.
		  Ignore cases.
		  For example; "Mary" and "army" and "RAMY" are Anagrams.
		 */
	//System.out.println(anagram("Ali","iAl"));
	System.out.println(reverser2("ALis dAsd"));
	
	
	}
	public static String reverser2(String str) {
		char[] arr=str.toCharArray();
		String s="";
		for(char i:arr) {
			if(Character.toLowerCase(i)==i) {
				i=Character.toUpperCase(i);
				s+=i;
			}else {
				i=Character.toLowerCase(i);
				s+=i;
			}
			
		}
		
		return s ;
		
		
		
	}
	public static String reverser(String str) {
		
		String[] arr=str.split("");
		String str1="";
		for(String w:arr) {
			if(w.charAt(0)==w.toUpperCase().charAt(0)) {
				str1+=w.toLowerCase();
				
			}else { str1+=w.toUpperCase();
		}
			
	}	
	return str1;
	}
public static boolean anagram(String str1, String str2) {
	char[] arr=str1.toLowerCase().toCharArray();
	char[] arr2=str2.toLowerCase().toCharArray();
	
	Arrays.sort(arr);
	Arrays.sort(arr2);
	return Arrays.equals(arr, arr2);
	
}
/*
 * Given a string, create a function to reverse the case. All lower-cased letters should be upper-cased, and vice versa.
 */


}

