package javapractice;

public class Odemo10D 
{

	public static void main(String[] args) 
	{
		A a1= new A();
		System.out.println(a1.i);
		System.out.println(a1.j);
		a1.funA();
		System.out.println(new A().i);
		System.out.println(new A().j);
		new A().funA();
	}




}
