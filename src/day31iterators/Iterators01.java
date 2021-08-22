package day31iterators;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
public class Iterators01{

	public static void main(String[] args) {
	
	

		List<String> list2=new ArrayList<>();
		list2.add("Apple");
		list2.add("Samsun");
		    list2.add("Huavei");

		//Update all elements and print them in reverse order
		// when you use hasPrevious() and previous methods, you will be able to work with the list element
		//in reverse order.      
		    ListIterator<String> listIterator= list2.listIterator();
		    while (listIterator.hasNext()){
		      listIterator.next();
		    }
		    while( listIterator.hasPrevious()){
		     String element=listIterator.previous();
		     listIterator.set(element+"?");
		    }
	Collections.reverse(list2);
		     System.out.println(list2);	
		      
		   List<String> list3=new ArrayList<>();
		   list3.add("A");
		   list3.add("B");
		   list3.add("C");
		   ListIterator<String> it=list3.listIterator();
		   while(it.hasNext()) {
			   it.next();
			   it.remove();
		   }
		      System.out.println("After removing: "+list3);
		//////How to add elements into a list by using ListIterator
		      List<String> list4=new ArrayList<>();
		      list4.add("X");
		      list4.add("Y");
		      list4.add("Z");
		      ListIterator<String> it2=list4.listIterator();
		      while(it2.hasNext()) {
		    	  it2.next();//We do this to move the pointer to the end of the loop.
		      }
		      it2.add("T");
		      it2.add("U");
		      it2.add("V");
		      System.out.println(list4);//Basa ekliyor [T, U, V, X, Y, Z]
		      
		      ///Difference between Iterator and ListIterator
		      List<String> list5=new ArrayList<>();
		      list5.add("AB");
		      list5.add("CD");
		      list5.add("EF");
		      Iterator<String> list5It=list5.iterator();
		      //In Iterator, there is no hasPrevious() and previous methods, because of that it is one-directional
		      //In Iterator, there is no add method we cannot add new elements by using Iterator.
		      //In iterator, there is no set method, we cannot modify the element by using Iterator.
		      //In Iterator and ListIterator there is remove() method
		      //Iterator can be used in other Collections (Map,Set,List) but ListIterator can be used just in Lists
		      
		      
		      while(list5It.hasNext()) {
		    	 String element= list5It.next();
		    	 list5It.remove();
		      }
		      
	
	}

}