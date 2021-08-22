package day12loops;

import java.util.Scanner;

public class WhileLoop02 {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	System.out.println("Number?");
	int n=in.nextInt();
	int sum=0;
	while(true) {
		
		sum=sum+n%10;
	if(n/10==0) {
		break;
	}else {
		n=n/10;
	}
		
		
	}
	
	System.out.println(sum);
	
}
}
