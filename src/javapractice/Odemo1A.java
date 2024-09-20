package javapractice;

public class Odemo1A
{

	int x,y;
	void fun1()
	{
		x=x+1;
		A a1= new A();
		a1.i=9;
		System.out.println(a1.i);
	}
	public static void main(String[] args)
	{
		Odemo1A d2=new Odemo1A();
		d2.fun1();
		A a1= new A();
	}
}
