package javapractice;

public class Odemo10C 
{

	public static void main(String[] args) 
	{
		A a1= new A();
		System.out.println(a1);
		System.out.println(a1);  //same address
		System.out.println(a1);

		System.out.println(new A());
		System.out.println(new A());  //different address
		System.out.println(new A());

	}

}
