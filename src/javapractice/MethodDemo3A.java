package javapractice;

public class MethodDemo3A 
{
	static int a=30;
	public static void main(String[] args) 
	{
		System.out.println(a);
		System.out.println("main method of MethodDemo1");
		funB();
		System.out.println("Done");
		System.out.println(a);
	}
	static void funA()
	{
		a=60;
		System.out.println("funA of methodDemo1");
	}
	static void funB()
	{
		a=70;
		System.out.println("funB of methodDemo1");
		funA();
	}
}
