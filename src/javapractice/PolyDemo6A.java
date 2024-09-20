package javapractice;

public class PolyDemo6A 
{

	public static void main(String[] args) 
	{
		PolyDemo6A  p1= new PolyDemo6A();
		A a=null;
		p1.funA(a);
		B b=null;
		p1.funA(b);
		C c=null;
		p1.funA(c);

	}
	void funA(A a)
	{
		System.out.println("classA args of PolyDemo6");
	}
	void funA(B b)
	{
		System.out.println("classB args of PolyDemo6");
	}
	void funA(C c)
	{
		System.out.println("classC args of PolyDemo6");
	}
}
