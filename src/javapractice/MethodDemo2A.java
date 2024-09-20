package javapractice;

public class MethodDemo2A
{

	public static void main(String[] args)
	{
		System.out.println("main method of MethodDemo1");
		funC();
		MethodDemo2A m1=new MethodDemo2A();
		m1.funA(); 
		m1.funB();
		System.out.println("Done");
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
