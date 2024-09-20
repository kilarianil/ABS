package javapractice;

public class MethodDemo2
{

	public static void main(String[] args) 
	{

		System.out.println("main method of MethodDemo1");
		funC();
		funA(); //compile time error 
		funB(); //compile time error
	}
	void funA()
	{
		System.out.println("funA of methodDemo1");
	}
	void funB()
	{
		System.out.println("funB of methodDemo1");
	}
	static void funC()
	{
		System.out.println("funC of methodDemo1");
	}
}
