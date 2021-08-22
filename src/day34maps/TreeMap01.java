package day34maps;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {
public static void main(String[] args) {
	

/*
	1) TreeMap puts the elements in natural order by using keys.
	2)TreeMap is not thread-safe and is not synchronized
	3) TreeMap doesn't accept null as key and.
	4) TreeMap accepts multiple "null"s in values.
	5) TreeMap is the slowest of all maps. 
	



 */

TreeMap<Integer, String> tm1=new TreeMap<>();
tm1.put(105, "Ali");
tm1.put(101, "Veli");
tm1.put(102, "Kaan");
tm1.put(104, "Eric");
tm1.put(103, "John");
//tm1.put(null, "XXXXX");//Throws NullPointerException
System.out.println(tm1);
	
//Ad elements by using HashMap then convert it to TreeMap
HashMap<Integer, String> hm2=new HashMap<>();
hm2.put(10, "AAA");
hm2.put(13, "CCC");
hm2.put(12, "KKK");
hm2.put(16, "BBB");
hm2.put(17, "AAA");
hm2.put(18, "CCC");
hm2.put(15, "KKK");
hm2.put(16, "BBB");
System.out.println(hm2);
TreeMap<Integer, String> tm2=new TreeMap<>(hm2);

System.out.println(tm2);

tm2.ceilingEntry(15);
System.out.println(tm2.ceilingEntry(9));
System.out.println(tm2.ceilingEntry(19));


}

}
