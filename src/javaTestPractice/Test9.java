package javaTestPractice;

public class Test9
{
	int id;
	String name ;
	void display()
	{
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) 
	{
		Test9 s1=new Test9();
		Test9 s2=new Test9();
		s1.display();
		s2.display();
		
	}

}
