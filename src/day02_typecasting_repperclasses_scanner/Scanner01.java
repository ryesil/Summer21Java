package day02_typecasting_repperclasses_scanner;

import java.util.Scanner;

public class Scanner01 {
	public static void main(String[] args) {
		Long y = 123445l;
		/* To get data from use we need to use "Scanner Class" in Java
		 
		 2) To be able to use "Scanner Class"
		 	a) Create an object from "Scanner class"
		 		i) Class Name
		 		ii) Object Name
		 		iii) Type "="
		 		iV) ClassName();
		 		
		 	b) By using the object access to the methods and use them
		 */
		Scanner scanner=new Scanner(System.in);
		System.out.println("Hey user, enter your age...");
		
		int age=scanner.nextInt();
		System.out.println(age);
		
	}

}
