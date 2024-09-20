package javapractice;

public class StaicDemo1A 
{
	StaticDemo1A s1 = new StaticDemo1A();

	public static void main(String[] args) 
	{
		System.out.println("main method start");
		StaticDemo1A s1 = new StaticDemo1A();
		System.out.println("Done");
	}

}
