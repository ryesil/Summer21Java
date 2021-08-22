package day18amultidimensionalarrays;

import java.util.Arrays;

public class Arrays03 {
public static void main(String[] args) {
	//How to check if a specific element exists in an array or not.
	//1) Use sort()
	//2) Then use binarySearch()
	char[] crr= {'c','A','!','m'};
	Arrays.sort(crr);
	System.out.println(Arrays.binarySearch(crr, 'x'));
	
}
	
	
}
