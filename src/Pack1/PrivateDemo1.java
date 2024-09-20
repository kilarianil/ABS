package Pack1;

public class PrivateDemo1 
{
	private int a=10;
	private void funA()
	{
		System.out.println("funA of PrivateDemo1");
	}
	void funC()
	{
	System.out.println(a);
	funA();
	System.out.println("funC of PrivateDemo1");	
	}
	
}
