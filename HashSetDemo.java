package com.collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<Integer> set = new HashSet<>(); // creating
		
      // Insert
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(1);
		
	// Size
		System.out.println("size of set is :" + set.size());
		
	// Print all elements
		System.out.println(set);
		
	// Iterator
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	// Search - contains
//		if(set.contains(1)) {
//			System.out.println("set contains 1");
//		}
//		if(!set.contains(6)) {
//			System.out.println("doesnot contain");
//		}
		
	// Delete
//		set.remove(1);
//		if(!set.contains(1)) {
//			System.out.println("doesnot contain 1- we deleted 1");
//		}
			
		
	}

}
