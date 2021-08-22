package day34maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMap02 {
	public static void main(String[] args) {
		//How to iterate in hashmap
		//1) use for-each loop and Map.EntrySet();
		HashMap<Integer, String> hm1=new HashMap<>();
		
		hm1.put(100, "Ali Can");
		hm1.put(101, "Veli Han");
		hm1.put(102, "Mark Stone");
		hm1.put(103, "Angie Ocean");
		System.out.println(hm1);
		//1. way: use for-each loop and Map.entrySet();
		//To convert a Map to a collection, tou need to use entrySet() method.
		for(Map.Entry<Integer, String> w: hm1.entrySet()) {//Collections can be used in for-each loop.
														   //
			System.out.print("The Key is "+ w.getKey() + " ");
			System.out.println("The Value is "+ w.getValue()+" ");
			System.out.println("------------------");
		}
		
		//2nd way: Iterator on Map.Entry<K,V>
		Iterator<Map.Entry<Integer, String>> hm1It=hm1.entrySet().iterator();
		
		while(hm1It.hasNext()) {
			Map.Entry<Integer,String> entry=hm1It.next();
			System.out.println(entry.getValue());
			System.out.println(entry.getKey());			
		}
	}
	
	
	

}
