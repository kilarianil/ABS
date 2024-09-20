package javapractice;

public class MethodDemo8B 
{
	void funA()
	{
		System.out.println("funA of methodDemo1");
		return; //return key word is not mandatory in "non-return method" ,but we can use , but not use 
	}
	int funB()
	{
		System.out.println("funB of methodDemo1");
		return 10; // last statement is mandatory in "return method".
	}

}
