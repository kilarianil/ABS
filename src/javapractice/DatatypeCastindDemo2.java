package javapractice;

public class DatatypeCastindDemo2
{

	public static void main(String[] args) 
	{
		int a=10;
		float f1 =10;
		int b=f1              //compile time error
		long k = f1;           //compile time error
		float f2=10.23789765  ; //compile time error
		double d1=10.23;      
		int c=10.23;          //compile time error
	}

}
