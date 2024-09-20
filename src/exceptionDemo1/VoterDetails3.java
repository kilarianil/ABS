package exceptionDemo1;

public class VoterDetails3 
{

	public static void main(String[] args) 
	{
		voterAgeValidation(19);
		voterAgeValidation(18);
		voterAgeValidation(17);
	}
	static void voterAgeValidation(int age)
	{
		if(age>=18)
		{
			System.out.println("valid voter");
		}
		else
		{
			System.out.println("age is not valid voter");
	      throw new ArithmeticException();
		}
		System.out.println("continue...");
	}
}
