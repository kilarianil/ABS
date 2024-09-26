package exceptionDemo1;


public class VoterDetails6 
{

	public static void main(String[] args) throws voterAgeExeption 
	{
		
		voterAgeValidation(17);
	}
	static void voterAgeValidation(int age) throws voterAgeExeption  
	{
		if(age>=18)
		{
			System.out.println("valid voter");
		}
		else
		{
			System.out.println("age is not valid voter");
	      throw new voterAgeExeption();
	      
		}
		System.out.println("continue...");
	}
}
