package com.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
public class JavaCollections 
{

	public static void main(String[] args) 
	
	{
		ArrayList<String> list = new ArrayList<String>();
		   
		list.add("ram");
	    list.add("krishna");
	    list.add("shiva");
	    System.out.println("qwert");
	    Iterator itr = list.iterator();
	    
	    while(itr.hasNext());
	    {
	    	System.out.println(itr.next());
	    	
	    
	    }
}

}
