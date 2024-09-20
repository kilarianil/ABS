package exceptionDemo1;

public class ExceptionDemo10A 
{

	public static void main(String[] args) 
	{
		 addNumbers();
		 subNumbers();
		 divNumbers();
		 mulNumbers();
	}
	public static void addNumbers()
	{
		try
		{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void subNumbers()
	{

		try
		{
		int a=10;
		int b=20;
		int c=a-b;
		System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void divNumbers()
	{

		try
		{
		int a=10;
		int b=0;
		int c=a/b;
		System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}	}
	public static void mulNumbers()
	{

		try
		{
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println(c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

















