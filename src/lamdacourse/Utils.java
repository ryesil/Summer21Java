package lamdacourse;

import java.util.List;


public class Utils {


public static void printInTheSameLineWithASpace(Object i) {
	System.out.print(i+" ");
}

public static boolean chechToBeEven(int x) {
	return x%2==0;
}

public static boolean chechToBeOdd(int x) {
	return x%2!=0;
}

public static int getSquare(int x) {
	return x*x;
}

public static int getCubed(int x) {
	return x*x*x;
}

public static Double getHalf(int x) {
	return x/2.0;
}

public static boolean isWovel(String a) {
	String aLower=a.toLowerCase();
	if(aLower=="a"||aLower=="e"||aLower=="i"||aLower=="o"||aLower=="u")
		return true;
		return false;
}
public static boolean isConsanant(String a) {
	String aLower=a.toLowerCase();
	if(aLower.equals("a")||aLower.equals("e")||aLower.equals("i")||aLower.equals("o")||aLower.equals("u"))
		return false;
		return true;
}
public static Integer getSumOfDigits(int x) {
	int sum=0;
	while(x>0) {
		sum+=x%10;
		x/=10;
	}
	return sum;
}


}
