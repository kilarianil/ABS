package javapractice;

public class Odemo10B 
{
	A getA(int x)
	{
		A a1= new A();
		a1.i=x;
		a1.j=x+1;
		return a1;
	}
	public static void main(String[] args) 
	{
		Odemo10B d1= new Odemo10B();
		A x= d1.getA(4);
		int a = d1.getA(4);
		int i = d1.getA(4).i;
		int b = d1.getA(4).i;
		A x= d1.getA(4).i
		A x2 = d1.getA(4).funA();
		int c =d1.getA(4).funA();
	}

}
