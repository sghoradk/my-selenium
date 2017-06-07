package com.gmail.com;

import java.util.Scanner;

public class StringReverse {
	
	public static void main(String[] args)
	{
		String input_string;
		Scanner reader = new Scanner(System.in);
		System.out.println("Please enter a string: ");
		input_string = reader.nextLine();
		
		//String string1 = "Hello World";
		String reverse = "";
		//Using reverse function
		/*String reverse= new StringBuffer(string1).reverse().toString();
		System.out.println(reverse);*/
		
		//Without using reverse function but using toCharArray()
		
		int length = input_string.length();
		/*char[] try1 = string1.toCharArray();
		for(int i=length-1; i>0; i--)
		{
			System.out.println(try1[i]);
			
		}*/
		//Without using any function
		System.out.println("String Length: "+length);
		for(int i=length-1; i>=0; i--)
		{
			reverse = reverse + input_string.charAt(i);
		}
		System.out.println(reverse);
		System.out.println("Input String is:"
				+ ""+input_string);
		if(input_string.equalsIgnoreCase(reverse))
		{
			System.out.println("String is palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
	}
	
	
}
