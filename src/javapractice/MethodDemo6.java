package javapractice;

public class  MethodDemo6 
{

	public static void main(String[] args) 
	{

		System.out.println("main method of MethodDemo1");
		funB();
		System.out.println("Done");
	}
	void funA()
	{
		System.out.println("funA of methodDemo1");
	}

	static void funB()
	{
		System.out.println("funB of methodDemo1");
		MethodDemo6 m1=new  MethodDemo6();
		m1.funA();
	}

}
