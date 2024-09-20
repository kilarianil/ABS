package javapractice;

public class ThisDemo4 
{
	int i =5;
	int j =10;
	ThisDemo4()
	{
		System.out.println("Zero args of ThisDemo4");
		i=15;
	}
	ThisDemo4(int a)
	{
		System.out.println("intr args of ThisDemo4");
		j=a;
	}

	public static void main(String[] args) 
	{
		ThisDemo4  t1=new ThisDemo4();
		System.out.println(t1.i);
		
		ThisDemo4  t2=new ThisDemo4(25);
		System.out.println(t2.j);
	}

}

