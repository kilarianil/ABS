package javapractice;

public class PolyDemo6 
{

	public static void main(String[] args) 
	{
		PolyDemo6 p1=new  PolyDemo6();
		p1.funA(new A());
		p1.funA(new B());
		p1.funA(new C());
		A m = new A();
		p1.funA(m);
		B n = new B();
		p1.funA(n);
		C p = new C();
		p1.funA(p);

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
