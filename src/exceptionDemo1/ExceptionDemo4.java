package exceptionDemo1;

public class ExceptionDemo4 
{

	public static void main(String[] args) 
	{
		System.out.println("main method of ExceptionDemo4");
		try
		{
		System.out.println(10/2); 
		int arr[]= {10,20,30,40,50};      //ArrayIndexOutOfBoundsException
		System.out.println(arr[5]);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception is invoking");
		}
		System.out.println("Done");
	}

}
