package com.collections;
import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {

	public static void main(String[] args) {
		
//		ArrayList al = new ArrayList();
//		
//		al.add(100);
//		al.add(200);
//		al.add(300);
//		
//		System.out.println(al);
//		
//		ArrayList al2 = new ArrayList();
//		
//		al2.add("aaa");
//		al2.add("bbb");
//		al2.add("ccc");
//		
//		System.out.println(al2);
//		
//		al.addAll(al2);
//		System.out.println(al);
		
	//	---------------------------------------------------------------
		
//		ArrayList al = new ArrayList();
//		
//		al.add(100);
//		al.add(200);
//		al.add(300);
//	
//		System.out.println(al.add("aaa"));
//		System.out.println(al);
		
		//-------------------------------------------------------------
		
		ArrayList al = new ArrayList();
		
//		al.add(100);
//		al.add(200);
//		al.add(300);	
//		System.out.println(al);
		
		//System.out.println(al.contains(500));
		//System.out.println(al.isEmpty());
		//System.out.println(al.size());
		
		//--------------------------------------------------------------
		//System.out.println(al.remove(100)); // here instead of integer we have to give index position of 100
	//	al.remove(0);
	//	System.out.println(al);
		
		al.add("aaa");
		al.add("bbb");
		al.add("ccc");
		System.out.println(al);
		
		//al.remove("aaa"); // here there is no need to give index
	//	System.out.println(al);
		//-----------------------------------------------------------------
		al.clear();
		System.out.println(al);
		
		
		
		
		}

}
