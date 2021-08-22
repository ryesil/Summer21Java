package day27exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E02 {
	/*
	 1) You can use multiple catch blocks for a single try block.
	 2) If you use multiple catch blocks, order the exception classes from child to parent,
	 otherwise you will get Compile Time Error.
	 3) If you use multiple catch blocks, you can get different messages for every exception.
	 jdbc
	 4) Try block cannot be used alone
	 5) When you type code, if you get red underline for Exceptions, that kind of exceptions
	 are called checked exceptions. 
	 	If you don't get any red underline for some exceptions, they are called unchecked exceptions.
	 FilenotFound and IOException are "checked Exceptions".
	 6) If there is any exception java stops execution.
	 */

	public static void main(String[] args) {
		FileInputStream fis=null;
		try {
			 fis=new FileInputStream("src/day27exceptions/TextFile0");
			 int i=0;
			 while((i=fis.read())!=-1) {
					System.out.print((char)i);
				}
		} catch (FileNotFoundException e) {
		
			System.err.println("I think the path is wrong or file doesnt exist..."+e.getMessage());
			e.printStackTrace();//To get detailed error message use that one.
		} catch (IOException e) {
	
		System.out.println("There are some issues in reading the file...");
		}
	}
	}

