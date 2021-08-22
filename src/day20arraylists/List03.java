package day20arraylists;

import java.util.ArrayList;
import java.util.List;

public class List03 {
public static void main(String[] args) {
	
	List<Integer> list=new ArrayList<>();
	
	list.add(12);
	list.add(5);
	list.add(7);
	list.add(20);
	list.add(15);
	list.add(128);
	// Create a method to delete odd elements and increase even elelemnts multiplying by 5;
	removeIncrease(list);
	
}
public static void removeIncrease(List<Integer> list) {
	List<Integer> list2=new ArrayList<>();
	for(int i=0;i<list.size();i++) {
		list.set(i, list.get(i)*5);
		if(list.get(i)%2==0) {
			list2.add(list.get(i));
		}
	}
	System.out.println(list);
	System.out.println(list2);
	
	}
public static void removeIncerease2(List<Integer> list) {
	for(int i=0;i<list.size();i++) {
		
		if(list.get(i)%2!=0) {
			list.remove(i);
		i--; //We decrease by one because everytime we remove elemnts shift to the left
		} else {
			list.set(i, list.get(i)*5);
		}
		
	}
	System.out.println(list);
}
	


}
