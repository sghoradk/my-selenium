package com.gmail.com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {
	
	public static void main(String[] args)
	{
		List<String> al = new ArrayList<String>();
		al.add("Ansh");
		al.add("Rohit");
		al.add("Sonal");
		al.add("Yash");
		al.add("Mummy");
		al.add("Pappa");
		al.add("Sonal");
		
		//Traversing Using loop
		System.out.println("Using for loop:");
		for(String obj:al)
		{
			System.out.println(obj);
		}
		
		ListIterator<String> itr = al.listIterator();
		//Traversing using Iterator in forward direction
		System.out.println("\nUsing Iterator in forward direction:");
		
		while(itr.hasNext())
		{
			System.out.println(itr.next() );
		}
		
		//Traversing using Iterator in backward direction
		System.out.println("\nUsing Iterator in backward direction:");
		
		while(itr.hasPrevious())
		{
			System.out.println(itr.previous());
		}
	}

}
