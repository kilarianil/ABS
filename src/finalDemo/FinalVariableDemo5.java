package finalDemo;

public class FinalVariableDemo5 
{

	public static void main(String[] args) 
	{
		funA(10);
		funA(20);
		funA(30);
	}
	public static void funA(final int a)
	{
		System.out.println(a);
		a=50;
		
	}
}
