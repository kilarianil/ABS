package javapractice;

public class MethodDemo5
{

	public static void main(String[] args) 
	{
		System.out.println("main method of MethodDemo1");
		MethodDemo5 m1=new MethodDemo5();
		m1.funB();
		System.out.println("Done");
	}
	static void funA()
	{
		System.out.println("funA of methodDemo1");
	}
	void funB()
	{
		System.out.println("funB of methodDemo1");
		funA();
	}


}
