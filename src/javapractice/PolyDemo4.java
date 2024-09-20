package javapractice;

public class PolyDemo4 
{

	public static void main(String[] args)
	{
		PolyDemo4 p1= new PolyDemo4();
		p1.funA(25,true);
		p1.funA(true,45);
	}
		void funA(int a,boolean b)
		{
			System.out.println("int args of PolyDemo4");
		}
	
		void funA(boolean b,int a)
		{
			System.out.println("int,int args of PolyDemo4");
		}
	
}


