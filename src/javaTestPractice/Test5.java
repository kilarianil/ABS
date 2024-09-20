package javaTestPractice;

public class Test5
{
	static int rbg  =1;
	Test5()
	{
		System.out.println("cons of test5 is invoking ");
		rbg =rbg+1;
	}
	public static void main(String[] args) 
	{
		System.out.println(rbg);
		new Test5();
		new Test5();
		new Test5();
		System.out.println(rbg);
	}

}
