package day18amultidimensionalarrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("length?");
	int[] arr=new int[in.nextInt()];
	int index=0;
	do {
		System.out.println("Enter "+(index+1));
		arr[index]=in.nextInt();
		index++;
		
	}while(index<arr.length);
	int[]brr=Arrays.copyOf(arr, arr.length);
	Arrays.sort(brr);
	System.out.println(Arrays.toString(arr));
	System.out.println("least is "+ brr[0]+"\nmost is "+ brr[brr.length-1]);
	
	
	
	
	
	
//	Scanner in=new Scanner(System.in);
//	String name=in.next();
//	boolean isDuplicate=false;
//	if(name.length()==3){
//	  int i=0;
//	while(i<3){
//	  if(name.indexOf(name.charAt(i))!=name.lastIndexOf(name.charAt(i))){
//	    isDuplicate=true;
//	    break;
//	  }
//	  i++;
//
//	}
//	System.out.println(isDuplicate?"String has duplicate characters":"String has unique characters");
//	}
	
}
	
	
}
