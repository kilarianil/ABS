package javapractice;

public class ThisDemo5 
{
	ThisDemo5()
	{
		System.out.println("Zero args of ThisDemo5");
	
	}
	ThisDemo5(int a)
	{
		this();

		System.out.println("intr args of ThisDemo5");
	}

	public static void main(String[] args) 
	{
		System.out.println("main method start");
		ThisDemo5  t1=new ThisDemo5(20);
		System.out.println("Done");
	}

}

