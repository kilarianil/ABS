package javapractice;

public class StaticDemo2 
{
	int a=10;
	static int b=20;

	public static void main(String[] args) 
	{
		int a=30;
		StaticDemo2 s1=new StaticDemo2();
		System.out.println(s1.a);
		int b=40;
		System.out.println(b);
	}

}
