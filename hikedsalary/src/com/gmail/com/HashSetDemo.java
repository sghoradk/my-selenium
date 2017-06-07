package com.gmail.com;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	
	public static void main(String[] args)
	{
		HashSet<String> hs = new HashSet<String>();
		hs.add("Sonal");
		hs.add("Sonal"); //Sonal will be displayed only once in the output, in the order as added
		hs.add("Ansh");
		hs.add("Yatharth");
		
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
