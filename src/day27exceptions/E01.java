package day27exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class E01 {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("src/day27exceptions/TextFile01");
		//ObjectInputStream ob=new ObjectInputStream(fis);
		int i=0;
		while((i=fis.read())!=-1) {
			System.out.print((char)i);
		}
		
		fis.close();// reading char by char.
	}
	
	
	
}
