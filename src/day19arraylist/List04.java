package day19arraylist;


import java.util.ArrayList;
import java.util.List;

public class List04 {
public static void main(String[] args) {
	/*
	 * Common interview Question
	 How to remove repeated elements from a list
	 */
	List<Character> list=new ArrayList<>();
	List<Character> list1=new ArrayList<>();
	list.add('a');
	list.add('b');
	list.add('a');
	list.add('c');
	list.add('b');
	list.add('t');
	System.out.println(list);
	for(int i=0;i<list.size();i++){
		if(!list1.contains(list.get(i))){
			list1.add(list.get(i));
		}

}
	System.out.println(list1);
}
}
