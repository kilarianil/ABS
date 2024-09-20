package javapractice;

public class ThisDemo10
{
	ThisDemo10()
	{
		this(20);  
		System.out.println("Zero args of ThisDemo9");
	}                     
	ThisDemo10(int a)  // "this" keyword cannot called in the two functions at the same time
	{
		this();
		System.out.println("int args of ThisDemo9");
	}
}
