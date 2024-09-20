package exceptionDemo1;

import java.io.IOException;

public class VoterDetails5 
{

	public static void main(String[] args) throws IOException   
	{
		voterAgeValidation(19);
		voterAgeValidation(18);
		voterAgeValidation(17);
	}
	static void voterAgeValidation(int age) throws IOException
	{
		if(age>=18)
		{
			System.out.println("valid voter");
		}
		else
		{
			System.out.println("age is not valid voter");
	      throw new IOException();
		}
		System.out.println("continue...");
	}
}
