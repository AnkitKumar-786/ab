package com.collections;

import java.util.ArrayList;

public class TestAL4 
{

	public static void main(String[] args) 
	{
		ArrayList<String> al = new ArrayList<String>();
		al.add("mango");
		al.add("apple");
		al.add("banana");
		al.add("grapes");
		
		System.out.println("returning element : " + al.get(1));
		
		al.set(2, "guava");
		
		for(String fruit: al)
		{
			System.out.println(fruit);
		}
				
		

	}

}
