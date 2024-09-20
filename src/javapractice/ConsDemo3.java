package javapractice;

public class ConsDemo3 
{
	ConsDemo3()
	{
		System.out.println("Con of Cons of ConsDemo2");
	}

	public static void main(String[] args) 
	{
		System.out.println("Main method of methodDemo2");
		ConsDemo3 c1=new ConsDemo3();
		System.out.println("Done");
	}



}
