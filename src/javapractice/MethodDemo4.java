package javapractice;

public class MethodDemo4 
{

	public static void main(String[] args) 
	{

		System.out.println("main method of MethodDemo1");
		funC();
		System.out.println("Done");
	}
	static void funA()
	{
		System.out.println("funA of methodDemo1");
		funC();
	}
	static void funB()
	{
		System.out.println("funB of methodDemo1");
		funA();
	}
	static void funC()
	{
		System.out.println("funC of methodDemo1");
		funB();
	}


}
