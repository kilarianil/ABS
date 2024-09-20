package javapractice;

public class PolyDemo1A 
{

	public static void main(String[] args) 
	{
        funA();
		funA(10);
		funA(25l);
		funA(35.32f);
		funA(40.0);
		funA('అ');
		funA(true);
	}
	static void funA()
	{
		System.out.println("Zero args of funA");
	}
	static void funA(int a)
	{
		System.out.println("int args of funA");
	}
	static void funA(long b)
	{
		System.out.println("long args of funA");
	}
	static void funA(float c)
	{
		System.out.println("flote args of funA");
	}
	static void funA(double d)
	{
		System.out.println("double args of funA");
	}
	static void funA(char e)
	{
		System.out.println("char args of funA");
	}
	static void funA(boolean f)
	{
		System.out.println("boolean args of funA");
	}
}


