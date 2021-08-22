package day34maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class HashMap01 {
public static void main(String[] args) {
	
String str="Java is easy. Type codes to learn Java. To earn money learn Java.";
	System.out.println(counter(str));
}
public static Map<String, Integer> counter(String str){
	Map<String,Integer> map=new HashMap<>();
	String[] arr=str.replaceAll("\\p{Punct}","").split(" ");
	
	str=str.replaceAll("\\p{Punct}","");
	System.out.println(str);
	List<String> list=new LinkedList<>();
	for(String w: arr) {
		str.replaceAll(w, "").replaceAll("\\s+", "");
		map.put(w, ((10-str.length())/w.length()));
		
	}
return map;
}
//Type code to see the number of Occurrences if characters in a given String
//Type code to see the number of Occurrences of words in a given sentences using map. Interview Question



}
