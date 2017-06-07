package com.gmail.com;

import java.util.HashMap;
import java.util.*;


public class MapDemo {

	public static void main(String[] args)
	{
		System.out.println("HashMap Demo:");
		HashMap<Integer,String> hm = new HashMap<Integer,String>(); 
		hm.put(1, "ONE");
		hm.put(3, "TWO");
		hm.put(2, "THREE");
		hm.put(5, "FOUR");
		hm.put(4, "FIVE");
		//System.out.println("Hash Map Data: " +hm);
		for(Map.Entry m:hm.entrySet())
		{
			System.out.println(m.getKey()+": "+m.getValue());
		}
		
		System.out.println("\nLinkedHashMap Demo:");
		LinkedHashMap<Integer,String> lhm = new LinkedHashMap<Integer,String>(); 
		lhm.put(1, "ONE");
		lhm.put(3, "TWO");
		lhm.put(2, "THREE");
		lhm.put(5, "FOUR");
		lhm.put(4, "FIVE");
		//System.out.println("Linked Hash Map data: " +hm);
		for(Map.Entry m:lhm.entrySet())
		{
			System.out.println(m.getKey()+": "+m.getValue());
		}
		
		System.out.println("\nTreeMap Demo:");
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>(); 
		tm.put(1, "ONE");
		tm.put(3, "TWO");
		tm.put(2, "THREE");
		tm.put(5, "FOUR");
		tm.put(4, "FIVE");
		//System.out.println("Hash map data: " +hm);
		for(Map.Entry m:tm.entrySet())
		{
			System.out.println(m.getKey()+": "+m.getValue());
		}
	}
	
}
