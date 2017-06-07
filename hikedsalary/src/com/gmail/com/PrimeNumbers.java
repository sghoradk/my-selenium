package com.gmail.com;

import java.util.Scanner;

public class PrimeNumbers {
	
	public static void main(String[] args){

			int i, num, flag=0;
			Scanner reader = new Scanner(System.in);  // Reading from System.in
			System.out.println("Enter a number: ");
			num = reader.nextInt();
			for(i=2; i<=num-1; i++)
			{
				if(num%i==0)
				{
					flag = 1;
					break;
				}
			}
			if(flag==1)
			{
				System.out.println(+num+ " is not a prime number");
					
			}
			else
			{
				System.out.println(+num+ " is a prime number");
			}
				
	}
}
