package day33collections;

import java.util.HashMap;
/*
 1) hashMap doesnot put the elements in any order.
 	Because of that it is fast.
 2) Keys must be unique in Maps, if you try to put repeated key, java will overwrite
 3) values can be repeated in maps
 4) We can use null in keys, but you can use it just once
 5) We can use null in values repeatedly.
 6) HashMaps are not thread-safe and not synchronized
 
 
 
 
 */
public class HashMap01 {
public static void main(String[] args) {
	
	// hashing technique : java will create unique codes for every data
	
	HashMap<Integer,String> hm1=new HashMap<>();
	hm1.put(100,"Ali Can");
	hm1.put(101, "Veli Han");
	hm1.put(102, "Mark Stone");
	hm1.put(103, "Angle Ocean");
	hm1.put(105, null);
	hm1.put(106, null);
	
	System.out.println(hm1.getOrDefault(108, "No value for that key"));// Harika bir method
	
	
	//returns the keys in a set collection
	System.out.println(hm1.values());// returns all the values
	System.out.println(hm1.keySet());
	System.out.println(hm1);
	
	//returns true if this map contains a mapping for the specified key.
	System.out.println(hm1.containsKey(100));
	System.out.println(hm1.containsKey(103));
	
	System.out.println(hm1.containsValue("Veli han"));
	System.out.println(hm1.containsValue("XXXX XXXXXXX"));
	
	HashMap<Integer,String> hm2=new HashMap<>();
	hm2.put(108,"X");
	hm2.put(109, "Y");
	hm2.put(110, "Z");
	//Copies all of the mappings from the specified map to this map. careful, keys must be different otherwise it will override.
	hm1.putAll(hm2);
	
	
	hm1.putIfAbsent(108, "Suleyman"); // will not work because we already have 108
	hm1.putIfAbsent(111, "Suleyman");// will add because 111 is not in the keySet() It works the same for null
	hm1.putIfAbsent(106, "KKKKKKKKKK");
	
	//Replace method is used to update value by using key
	//If you use replace method with a non-Existing key it will do nothing
	hm1.replace(106, "LLLLLLL");
	hm1.replace(112, "?????????????");
	
	hm1.replace(106, "LLLLLLL", "!!!!!!!!!!!!!");
	
	
	System.out.println(hm1);
	
	
	
	
	
	
}
	
}
