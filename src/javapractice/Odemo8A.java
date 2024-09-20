package javapractice;

public class Odemo8A 
{

	public static void main(String[] args) 
	{
		Odemo8A m1= new Odemo8A();
		m1.funA();
		m1.funB(10);
		m1.funC(true);
		Ramesh1 k=new Ramesh1();
		m1.funD(k);

	}

	void funA()
	{
		System.out.println("funA of Odemo8");
	}
	void funB(int a)
	{
		System.out.println("funB of Odemo8");
	}
	void funC(boolean b)
	{
		System.out.println("funC of Odemo8");
	}
	void funD(Ramesh1 r)
	{
		System.out.println("funD of Odemo8");
	}
}
