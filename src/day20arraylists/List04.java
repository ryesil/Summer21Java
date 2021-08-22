package day20arraylists;

import java.util.ArrayList;
import java.util.List;

public class List04 {

	public static void main(String[] args) {
		List<Integer> list1=new ArrayList<>();
		
list1.add(10);
list1.add(20);
list1.add(25);
list1.add(505);
list1.add(21);
list1.add(257);
List<Integer> list2=new ArrayList<>();

list2.add(147);
list2.add(5);
list2.add(600);
list2.add(404);
list2.add(202);
list2.add(888);

//add all the elements of the of the second list
list1.addAll(list2);
System.out.println(list1);

list1.removeAll(list2);
System.out.println(list1);
//remove all the elements from a list
//list1.removeAll(list1);
System.out.println(list1);
list1.clear();
System.out.println(list1);


	}

}
