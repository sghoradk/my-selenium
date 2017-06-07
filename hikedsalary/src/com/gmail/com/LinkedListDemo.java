package com.gmail.com;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	
	public static void main(String[] args)
	{
		List<String> ll = new LinkedList<String>();
		ll.add("Welcome");
		ll.add("To");
		ll.add("The");
		ll.add("World");
		ll.add("Welcome");
		
		//Using for loop
		System.out.print("Using for loop:\n");
		for(String obj:ll)
		{
			System.out.println(obj);
		}
		
		//Using Iterator
		System.out.print("\nUsing for Iterator:\n");
		Iterator<String> itr = ll.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
