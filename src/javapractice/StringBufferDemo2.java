package javapractice;

public class StringBufferDemo2 
{

	public static void main(String[] args) 
	{
		StringBuffer s1= new StringBuffer("RBG");
		System.out.println(s1);
		
		StringBuffer s2= new StringBuffer("technologies");
		System.out.println(s2);
		System.out.println(""+s1+s2);
	}

}
