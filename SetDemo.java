package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		
		Set s = new HashSet();
		s.add(100);
		s.add(200);
		s.add(300);
		s.add(400);
		// s.add(100);  cannot store duplicate elements
		
		s.add(null);
		s.add(null);     // can store only one null value
		
		//System.out.println(s);
		Iterator itr = s.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
			
			}
	}

}
