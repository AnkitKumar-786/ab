package com.collections;

import java.util.*;

public class LinkedListDemo {

	public static void main(String[] args) 
	{
		LinkedList l = new LinkedList();
		l.add("ramesh");
		l.add(30);
		l.add(null);
		l.add("ramesh");  // [ramesh,30,null,ramesh]
		l.set(0,"Technology"); //[Technology,30,null,ramesh]
		l.add(0,"venky"); //[venky, Technology,30,null,ramesh
		l.removeLast(); //[venky, Technology,30,null]
		l.addFirst("CCC"); //[CCC,venky, Technology,30,null]
		
		System.out.println(l); //[ CCC,venky,Technology,30,null]
		
		

	}

}
