package javapractice;

public class WraperClassDemo1 
{

	public static void main(String[] args) 
	{
		int a=10;
		Integer i1=new Integer(a);  //Boxing
		int b=i1.intValue();       //unBoxing
		System.out.println(b);

		Integer i2=20; //new Integer(20)//Auto Boxing
		int c = i2;  //i2.intvalue //Auto-unBoxing
		System.out.println(c);
	}

}
