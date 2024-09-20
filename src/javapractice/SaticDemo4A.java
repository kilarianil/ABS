package javapractice;

public class SaticDemo4A 
{

	public static void main(String[] args) 
	{
		StaticDemo3 s1= new StaticDemo3();
		System.out.println(s1.b);
		System.out.println(s1.b2);
		System.out.println(s1.b2.i);
		s1.b2.funA();
	}
}
