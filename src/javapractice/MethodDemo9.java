package javapractice;

public class MethodDemo9 
{

	public static void main(String[] args) 
	{
		MethodDemo9 v1=new MethodDemo9();
		v1.funA();
		v1.funB();
	}
		void funA()
		{
			System.out.println("funA of methodDemo9");
			int a=10;
			int b=20;
			int c=a+b;
			System.out.println(c);
		}
		int funB()
		{
			System.out.println("funB of methodDemo9");
			int a=10;
			int b=20;
			int c=a+b;
			System.out.println(c);
			return 10;

		}

	}
