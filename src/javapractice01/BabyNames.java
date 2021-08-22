package javapractice01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BabyNames {

	public static void main(String[] args) throws ClassNotFoundException {

	FavoriteBabyNames();	

	}
public static void FavoriteBabyNames() throws ClassNotFoundException {
List<String> list=new ArrayList<>();
Scanner input=new Scanner(System.in);
System.out.println("What year?");
String year=input.next();
input.close();

try(BufferedReader os=new BufferedReader(new FileReader("\\\\PDC\\FolderRedirectionStaff$\\yesil\\Desktop\\baby_Names\\yob"+year+".txt"))){
			for(int i=1;i<6;i++) {
			String line=os.readLine();
			list.add(line);
			String name=line.substring(0,line.indexOf(","));
			String gen=line.substring(line.indexOf(",")+1,line.lastIndexOf(","));
			String gender= gen=="M"?"Male":"Female";
			String rank= line.substring(line.lastIndexOf(",")+1);
			System.out.println(i+") Name "+name+" Gender "+gender+" Rank "+rank);
			}
			
			
} catch (FileNotFoundException e) {
	System.out.println("File not found"+e.getMessage());
	
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}

	
	
	
	
	
	
	
}
	
	
	
	
}
