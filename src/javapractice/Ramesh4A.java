package javapractice;

public class Ramesh4A 
{

	public static void main(String[] args) 
	{
		Ramesh4A  v1=new Ramesh4A();
		v1.funA(10);
		v1.funB(20);
		v1.funC(30.045f);
		v1.funD(50.5678);
		v1.funE('l');
		v1.funF(true);
	}
	void funA(int a)
	{
		int b=a;
		System.out.println(b);	
	}
	void funB(long l)
	{
		long b=l;
		System.out.println(b);	
	}
	void funC(float f)
	{
		float c=f;
		System.out.println(c);	
	}
	void funD(double d)
	{
		double e=d;
		System.out.println(e);	
	}
	void funE(char c)
	{
		char b=c;
		System.out.println(b);	
	}
	void funF(boolean b)
	{
		boolean g=b;
		System.out.println(g);	
	}
}
