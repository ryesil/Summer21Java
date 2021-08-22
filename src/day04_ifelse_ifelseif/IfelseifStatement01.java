package day04_ifelse_ifelseif;

import java.util.Scanner;

public class IfelseifStatement01 {
public static void main(String[] args) {
	
	Scanner input=new Scanner(System.in);
	System.out.println("number");
	int num=input.nextInt();
	if(num<0) {
		System.out.println("Negative");
	} else if(num==0) {
		System.out.println("Neutr");
	}else {
		System.out.println("positive");
	}
}

}
