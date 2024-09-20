package javapractice;

public class Odemo10A 
{

	public s
	tatic void main(String[] args) 
	{
		Odemo10A d1= new Odemo10A();
		d1.funA();
		d1.funB();
		Ramesh1 r= new Ramesh1();
	}
	int funA()
	{

		return 10;
	}
	boolean funB()
	{

		return true;
	}
	Ramesh1 funC()
	{

		return  new Ramesh1(); //or// null
	}

}
