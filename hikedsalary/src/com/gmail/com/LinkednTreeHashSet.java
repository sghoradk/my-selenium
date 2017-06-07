package com.gmail.com;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkednTreeHashSet {
	
	public static void main(String[] args)
	{
		//LinkedHashSet
		System.out.println("LinkedHashSet Demo:\n");
		
		LinkedHashSet<String> lhs = new LinkedHashSet<String>();
		lhs.add("Sonal");
		lhs.add("Ansh");
		lhs.add("Sonal");
		lhs.add("Yatharth");
		lhs.add("Yash");
		lhs.add("Rohit");
		
		Iterator<String> itr1 = lhs.iterator();
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		//TreeSet
		System.out.println("\nTreeSet Demo:\n");
		
		TreeSet<String> ts = new TreeSet<String>();
		ts.add("Sonal");
		ts.add("Ansh");
		ts.add("Sonal");
		ts.add("Yatharth");
		ts.add("Yash");
		ts.add("Rohit");
		
		Iterator<String> itr2 = ts.iterator();
		while(itr2.hasNext())
		{
			System.out.println(itr2.next());
		}
		
	}

}
