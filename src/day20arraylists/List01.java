package day20arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



public class List01 {

	public static void main(String[] args) {
	/*
	 Closests two elements or min diff
	 */
		
		List<Integer> list=new ArrayList<>();
		list.add(2);
		list.add(153);
		list.add(31);
		list.add(281);
		list.add(114);
		list.add(16);
		list.add(67);
		list.add(359);
		list.add(120);
		list.add(168);
		list.add(-2);
		
		int distance=Math.abs(list.get(0)-list.get(1));
		for(int i=0;i<list.size();i++) {
			for(int j=i+1;j<list.size();j++) {
				
				if(Math.abs(list.get(i)-list.get(j))<distance) {
					distance=Math.abs(list.get(i)-list.get(j));
				}
			}

		}
		System.out.println(distance);
		Collections.sort(list);
		int dis=Math.abs(list.get(0)-list.get(1));
		for(int i=1;i<list.size()-1;i++) {
		if(Math.abs(list.get(i)-list.get(i+1))<dis) {
			dis=Math.abs(list.get(i)-list.get(i+1));
		}
			
			
		}
		System.out.println(dis);
		
		   int difference=0;
	        
	        Collections.sort(list);
	        int mindif=-list.get(0)+list.get(list.size()-1);
	        for(int i=0;i<list.size()-1;i++) {
	            difference=list.get(i+1)-list.get(i);
	            if(difference<mindif) {
	            mindif=difference;
	                
	        }
	            
	            
	        }System.out.println(mindif);

	}

}
