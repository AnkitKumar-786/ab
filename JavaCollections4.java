package com.collections;

import java.util.*;

public class JavaCollections4 {

	public static void main(String[] args) 
	{
		
		Stack<String> str = new Stack<String>();
		
		str.push("hari");
		str.push("narayan");
		str.push("aman");
		str.push("rohit");
		
		
		
		Iterator<String> itr = str.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		

	}

}
