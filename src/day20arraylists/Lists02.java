package day20arraylists;

import java.util.ArrayList;
import java.util.List;

public class Lists02 {

	public static void main(String[] args) {
		/*
		 increase by 2;
		 
		 
		 */

		List<Integer> list=new ArrayList<>();
		
		list.add(12);
		list.add(5);
		list.add(7);
		list.add(20);
		list.add(15);
		list.add(128);
		
		System.out.println(list);
		increase(list);
		
	}
public static void increase(List<Integer> list) {
	for(int i=0; i<list.size();i++) {
		list.set(i,list.get(i)+3);
	}
	System.out.println(list);
}
	
	
}
