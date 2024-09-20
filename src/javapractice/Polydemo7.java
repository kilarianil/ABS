package javapractice;

public class Polydemo7 
{

	public static void main(String[] args) 
	{
		Polydemo7 p1=new Polydemo7();
		p1.funA(10);
		p1.funA(20);
		
	}
	void funA(int a)   //compile time error
	{
                      //it is not accepted based on the data type
	}
	void funA(int b)
	{
		
	}
}
