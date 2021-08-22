package lamdacourse;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
public class FunctionalProgramming06 {

	public static void main(String[] args) throws IOException {
	//C:\Users\yesil.MMSA\eclipse-workspace\summer21eng\src\lamdacourse\LambdaTextFile.txt
		//How to read text from the file
		//Files.lines(Paths.get("src\\lamdacourse\\LambdaTextFile.txt")).forEach(System.out::println);
		System.out.println("=====================================================");
	//How to convert all characters in the file to upper case
		//Files.lines(Paths.get("src\\lamdacourse\\LambdaTextFile.txt")).map(String::toUpperCase).forEach(System.out::println);
		
		//Files.lines(Paths.get("src\\lamdacourse\\LambdaTextFile.txt")).anyMatch(t->t.contains("Lambda"));
		
		//Print distinct words on the console in the file
//		Files.lines(Paths.get("//Print distinct words on the console in the file")).map(t->t.split(" ")).
//		flatMap(Arrays::stream).distint().forEach(System.out::println);
		//Get the words which end with 'e' and print them on the console
		Files.
			  lines(Paths.get("src\\lamdacourse\\LambdaTextFile.txt")).
			  map(t->t.split(" ")).
			  flatMap(Arrays::stream).
			  filter(t->t.endsWith("e")).
			  forEach(System.out::println);

	}

}
