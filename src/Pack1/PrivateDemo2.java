package Pack1;

public class PrivateDemo2 
{
	 private PrivateDemo2()
	{
		System.out.println("cons of PrivateDemo2");
	}
	private int a=10;
	private void funA()
	{
		System.out.println("funA of PrivateDemo1");
	}
	 void funB()
	{
		System.out.println(a);
		funA();
		System.out.println("funC of PrivateDemo1");	
	}
	 
	 
}
