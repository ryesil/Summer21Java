package javapractice01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;

public class Practice0725 {

public static void main(String[] args) {
	
	
//	System.out.println(getMiddle("asdfg"));
//	System.out.println(isSandwich("breadsdfdghfbread"));
//NumberOfTimes("javaasdfgfhgjavaasdgphytonasdfphyton");
//arrayOfArrays();
	
//max();
	//System.out.println(armStrongList(1000));
	System.out.println(isPangram("as"));
	System.out.println((int)'a');
	System.out.println((int)'A');
}
public static boolean isPangram(String str) {
for(int i='A';i<='z';i++) {
	if(!str.contains(""+i)) {
		return false;
	}
}
return true;
}
public static List<Integer> armStrongList(int num) {
	List<Integer> list=new ArrayList<>();
	for(int i=0;i<=num;i++) {
	String str=i+"";
	Integer sum=0;
	for(int j=0;j<str.length();j++) {
		Integer x=Integer.parseInt(""+str.charAt(j));
		sum+=x*x*x;
	}
	if(sum==i) {
	list.add(sum);
	}
	}
	return list;

}



public static int max() {
int arr[][]=arrayOfArrays();

int max=arr[0][0];
for(int[] w:arr) {
	for(int i:w) {
		if(i>max)
			max=i;
	}
}
System.out.println(Arrays.deepToString(arr));
System.out.println(max);
	return max;
}


public static int[][] arrayOfArrays(){
	Random random=new Random();
	int row=random.nextInt(10);
	int column=random.nextInt(10);
	int arr[][]=new int[row][column];
	for(int i=0;i<row;i++) {
		for(int j=0;j<column;j++) {
			arr[i][j]=random.nextInt(1000);
		}
	}
	
	return arr;
}
public static boolean isValid(String zip) {
	//Pattern.compile("\\d{5}").matcher(zip).
	return true;
}



public static boolean NumberOfTimes(String str){
	int phyton=str.replaceAll("[^phyton]","").replaceAll("[phyton]", "p").length();
	int java=str.replaceAll("[^java]","").replaceAll("[java]", "j").length();
	return phyton==java;
}

//1.A sandwich is two pieces of bread with something in between.
//Print the string that is between the first and last appearance of "bread"
//in the given string, or return string "nothing" if there are not two pieces of bread.
public static boolean isSandwich(String str) {
	//return str.startsWith("bread")&&str.endsWith("bread");
return Pattern.compile("^[bread]").matcher(str).find()&&Pattern.compile("[bread]$").matcher(str).find();
}

public static String getMiddle(String word) {
		int middleIndex=word.length()/2;
		System.out.println(middleIndex);
		if(word.length()%2==0){
			return word.substring(middleIndex-1,(middleIndex+1));
	}
	return
		word.substring((middleIndex),(middleIndex+1));
}
public static int getDecimalPlaces(String num) {
	if(num.contains("."))
	return num.substring((num.indexOf(".")+1)).length();
	return 0;
}	



}
