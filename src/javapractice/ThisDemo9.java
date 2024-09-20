package javapractice;

public class ThisDemo9
{
	ThisDemo9()
	{
		System.out.println("Zero args of ThisDemo9");
	}
	ThisDemo9(int a)
	{
		System.out.println("int args of ThisDemo9");
	   this() // this key word should not write second statement always write first statement .
	}
}
