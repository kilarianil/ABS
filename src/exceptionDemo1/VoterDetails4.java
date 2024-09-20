package exceptionDemo1;

import java.io.IOException;

public class VoterDetails4 
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
			throw	new ArithmeticException();
			throw   new NumberFormatException();
			throw	new NullPointerException();
			throw	new ArrayIndexOutOfBoundsException();

			throw new IOException();

		}
		System.out.println("continue...");
	}
}
