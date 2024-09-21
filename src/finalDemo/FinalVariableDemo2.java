package finalDemo;

public class FinalVariableDemo2 
{
	final static int a=10;
	final int b=20;
	public static void main(String[] args)
	{
		a=15;
		FinalVariableDemo2 f1= new FinalVariableDemo2();
		f1.b=25;
		final int c=30;
		c=35;
	}
}
