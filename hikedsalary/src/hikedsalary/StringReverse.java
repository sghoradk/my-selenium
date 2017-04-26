package hikedsalary;

public class StringReverse {
	
	public static void main(String[] args)
	{
		String string1 = "Hello World";
		String reverse = "";
		//Using reverse function
		/*String reverse= new StringBuffer(string1).reverse().toString();
		System.out.println(reverse);*/
		
		//Without using reverse function but using toCharArray()
		
		int length = string1.length();
		/*char[] try1 = string1.toCharArray();
		for(int i=length-1; i>0; i--)
		{
			System.out.println(try1[i]);
			
		}*/
		//Without using any function
		for(int i=length-1; i>0; i--)
		{
			reverse = reverse + string1.charAt(i);
		}
		System.out.println(reverse);
	}
	
	
}
