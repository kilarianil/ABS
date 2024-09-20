package javapractice;

public class ThisDemo5A
{
	int i=5;
	ThisDemo5A()
	{
		System.out.println("Zero args of ThisDemo5A");
		i=10;
	}
	ThisDemo5A(int a)
	{
		this();
		System.out.println("intr args of ThisDemo5A");
		i=a;
	}

	public static void main(String[] args)
	{


		System.out.println("main method start");
		ThisDemo5A  t1=new ThisDemo5A(20);
		System.out.println(t1.i);
		System.out.println("Done");

	}
}
