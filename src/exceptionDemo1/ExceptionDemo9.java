package exceptionDemo1;

public class ExceptionDemo9 
{
 static A a1;
	public static void main(String[] args) 
	{
		System.out.println("main method of ExceptionDemo8");
		try
		{
		System.out.println(10/2); 
		int arr[]= {10,20,30,40,50};      
		System.out.println(arr[4]);
		System.out.println(ExceptionDemo9.a1.i);
		}
		catch(Throwable a)
		{
			System.out.println(" Throwable block is invoking");
			System.out.println(a);
		}
		catch(Exception e)
		{
			System.out.println(" Exception block is invoking");
			System.out.println(e);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception is invoking");
		}
		catch(ArrayIndexOutOfBoundsException g)
		{
			System.out.println("ArrayIndexOutOfBoundsException is invoking");
		}
		catch(NullPointerException a)
		{
			System.out.println("NullPointerException is invoking");
			ExceptionDemo9.a1= new A();
		}
		
		System.out.println("Done");
	}

} 
