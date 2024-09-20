package javapractice;

public class ObjectDemo2
{
	int a=10;
	boolean b=true;
	static int c=20;
	public static void main(String[] args)
	{
		System.out.println(c );
		System.out.println(a);  //compile time error
		System.out.println(b );  //compile time error
		new ObjectDemo2();
		new ObjectDemo2();
		System.out.println(a);  //compile time error
		System.out.println(b);  //compile time error
	}

}
