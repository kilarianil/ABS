package javaTestPractice;

public class Test_7
{

	public static void main(String[] args) 
	{
		int i=10;
		if (i>9)

			System.out.println("statementn1 Done");
		System.out.println("statementn2 Done");

		if (i>11)

			System.out.println("statementn3 Done");
		System.out.println("statementn4 Done");
	}
	int funA()
	{
		int i=10;

		if(i>9)

			return i;
		else

			return 0;
	}
}