package javapractice;

public class DatatypeCastindDemo1
{

	public static void main(String[] args)
	{
		int a=10;
		float f1=10;
		float f2=a;                 //implicit data type casting
		System.out.println(f1);
		long k=3000;               //implicit data type casting
		float f3=k;
		System.out.println(f3);
		double d1=20;             //implicit data type casting
		System.out.println(d1);
		double d2=f1;            //implicit data type casting
		System.out.println(d2);
	}
}