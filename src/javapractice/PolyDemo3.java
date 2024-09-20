package javapractice;

public class PolyDemo3 
{

	public static void main(String[] args)
	{
		PolyDemo3 p1= new PolyDemo3();
		p1.funA(25);
		p1.funA(25,45);
	}
		void funA(int a)
		{
			System.out.println("int args of PolyDemo3");
		}
	
		void funA(int a,int b)
		{
			System.out.println("int,int args of PolyDemo3");
		}
	
}
