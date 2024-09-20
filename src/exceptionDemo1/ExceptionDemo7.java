package exceptionDemo1;

public class ExceptionDemo7 
{
 static A a1;
	public static void main(String[] args) 
	{
		System.out.println("main method of ExceptionDemo7");
		try
		{
		System.out.println(10/2); 
		int arr[]= {10,20,30,40,50};      
		System.out.println(arr[4]);
		System.out.println(ExceptionDemo7.a1.i);
		}
		catch(Exception e)
		{
			System.out.println(" Exception block is invoking");
		}
		System.out.println("Done");
	}
}
