package javaTestPractice;

public class Practice5 
{

	public static void main(String[] args) 
	{
		String s1= "{[('abc':'123')]},{[('def':'456')]},{[('ghi':'789')]}";
		
		String r= s1.replace("{[('","");
		System.out.println(r);
		
		String r1= r.replace("')]}","");
		System.out.println(r1);
		
		String r2= r1.replace("':'","=");
		System.out.println(r2);
		
		String s[]=r2.split(",");
		System.out.println(s[0]);
		System.out.println(s[1]);
		System.out.println(s[2]);

	}
}
