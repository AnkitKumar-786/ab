package com.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {

	public static void main(String[] args) {
		
		HashMap<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "Mango");
		map.put(2, "Apple");
		map.put(3, "Banana");
        map.put(1, "Grapes");
        
        System.out.println("Iterating Hashmap");
        
        for(Map.Entry m: map.entrySet())
        {
        System.out.println(m.getKey()+ " "+ m.getValue());
        }

	}

}

// we are storing Integer as the key and String as the value, so we are using HashMap<Integer,String> as the type. The put() method inserts the elements in the map.

//To get the key and value elements, we should call the getKey() and getValue() methods. The Map.Entry interface contains the getKey() and getValue() methods. But, we should call the entrySet() method of Map interface to get the instance of Map.Entry.
