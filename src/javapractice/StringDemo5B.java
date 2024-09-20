package javapractice;

public class StringDemo5B 
{

	public static void main(String[] args) 
	{
		String s1=new String("   RBG Technologies    ");
		System.out.println(s1);
		String s3= s1.trim();		
		System.out.println(s3);              
		
		String s2="rbg technologies";
		System.out.println(s2);
		String s4=s2.toUpperCase();
		System.out.println(s4);
	}

}
