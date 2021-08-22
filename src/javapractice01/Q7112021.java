package javapractice01;

import java.util.Arrays;
import java.util.Random;

public class Q7112021 {
//1.Write a method that returns the sum of numbers starting with 1 to the number passed into the method.
//2. Write method that accepts a String and removes all duplicate from String.
public static String[] slicer(String str) {
	String[] str1=new String[2];
	str1[0]="";
	str1[1]="";
	for(int i=0;i<str.length();i++) {
		Character chr=str.charAt(i);
		if(Character.isDigit(chr)) {
			str1[0]+=chr;
		}else if(Character.isAlphabetic(chr)) {
			str1[1]+=chr;
		}
	}

	return str1;
}

public static String extracter(String str) {
	String letters="";
	String numbers="";
	for(int i=0;i<str.length();i++) {
		char chr=str.charAt(i);
		if(Character.isDigit(chr)) {
			numbers+=chr;
		}else if(Character.isLetter(chr)) {
			letters+=chr;
		}
	}

	return "Letters are: "+letters+"\nNumbers are: "+numbers;
}
	
	
	
	
	
	

public static boolean isPalindrom(String str) {
	String rts="";
	for(int i=str.length()-1;i>=0;i--) {
		rts+=str.charAt(i);
	}
	return rts.equals(str);
}

public static boolean isPalindrom2(String str) {
	return new StringBuilder(str).reverse().toString().equals(str);
}


public static String reverse(String str) {
	return new StringBuilder(str).reverse().toString();
}
public static String reverse2(String str) {
	String rts="";
	for(int i=str.length()-1;i>=0;i--) {
		rts+=str.charAt(i);
	}
	return rts;
}
	
public static int[] randomX(int x) {
	int arr[]=new int[x];
	Random random=new Random();
	for(int i=0;i<=x;i++) {
		arr[i]=new Random().nextInt(100);
		
	}
	
	return arr;
	
}

public static int max(int[] arr) {
	int max=arr[0];
	for(int i:arr) {
		if(i>max) {
			max=i;
		}
	}
	return max;
}

public static int SecondMax(int[] arr) {
	int max=max(arr);
	int secondMax=arr[0];
	for(int i:arr) {
		if(i<max&&i>secondMax) {
			secondMax=i;
		}
	}
	return secondMax;
}
public static int SecondMaxx(int[] arr) {
	Arrays.sort(arr);
	int max=arr[arr.length-1];
	int smax=arr[0];
	
	for(int i=arr.length-1;i>=0;i--) {
		if(arr[i]!=max) {
			smax=arr[i];
			break;
		}
	}
	return smax;

}

public static int[] sort(int[] arr) {
	int temp=911;
	for(int i=0;i<arr.length;i++) {
		for(int j=i;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
	}
	return arr;
}

public static int maxSecondNumber(int[] array) {
	
	Arrays.sort(array);
	
	for (int i = array.length-2;i>=0;i--) {
		if (array[i]!=array[array.length-1]) {
			return array[i];
		}
	}
	
	return -1;
	
}


	
	public static void main(String[] args) {
		System.out.println(maxSecondNumber(new int[] {1,2,2,2,2,2,2,2,2}));
//		System.out.println(Arrays.toString(slicer("Memg12")));
//		System.out.println(Arrays.toString(sort(new int[] {10,1,2,1,1,3,4,61,0,0,0,0,-5})));
//		System.out.println(SecondMax(new int[]{10,1,2,1,1,3,4,61,0,0,0,0,-5}));
//System.out.println(isPalindrom("ramazan"));
//	System.out.println(reverse("Ramazan"));
//	System.out.println(sum(3));
//	System.out.println(reverse2("Ramazan"));
//		System.out.println(isPalindrom("ramar"));
//	System.out.println(duplicate("Ramazan"));	
//	System.out.println(duplicate2("Ramazan"));

	}
public static int sum(int value) {
	if(value==1) {
		return 1;
	}
	return sum(value-1)+value;
}
public static String duplicate(String str) {
	String str2="";
	for(int i=0;i<str.length();i++) {
		if(str.indexOf(str.charAt(i))==str.lastIndexOf(str.charAt(i))) {
		str2+=str.charAt(i);
		}
	}
	return str2;		
}
public static String duplicate2(String str) {
	String result="";
	for(int i=0;i<str.length();i++) {
	char eachLetter=str.charAt(i);
	if(!result.contains(eachLetter+"")) {
		result+=eachLetter;
	}
	
	}
	return result;
}







}
