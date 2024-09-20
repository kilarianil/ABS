package javapractice;

public class MethodDemo8 
{
	void funA()
	{
		System.out.println("funA of methodDemo8");
	}
	int funB()
	{
		System.out.println("funB of methodDemo8");
		return 10;
		System.out.println("Done");    //this statement should not be write after the return method.
	}

}
