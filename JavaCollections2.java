package com.collections;

import java.util.Iterator;
import java.util.LinkedList;

public class JavaCollections2 {

	public static void main(String[] args) 
	{
		LinkedList<String> list  = new LinkedList<String>();
		
		list.add("ravi");
		list.add("vijay");
		list.add("ravi");
		list.add("ajay");
		
		Iterator<String> itr = list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		

	}

}
