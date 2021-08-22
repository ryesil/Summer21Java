package day34maps;

import java.util.Hashtable;
/*
 1) Hashtable is thread-safe and synchronized
 2) Hashtable does not put the elements in any order
 3) Hashtable doesn't allow to use null in keys and values
 4) Hashtable works with being thread-safe and synchronization, and checking to be null.
 	Because of that it is slower than HashMap.
 */
public class HashTable01 {
public static void main(String[] args) {
Hashtable<Integer, String> ht1=new Hashtable<>();

ht1.put(100, "Ali");
ht1.put(101, "Veli");
ht1.put(102, "Can");
//ht1.put(null, "XXXX"); throws nullPointerException

System.out.println(ht1);

	
}


}
