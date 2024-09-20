package javapractice;

public class Parameterfunction
{
	void funA(int a)
	{
		Parameterfunction p1= new Parameterfunction();
		p1.funA();    // error
		p1.funA(10);  // initialization
	}
}
