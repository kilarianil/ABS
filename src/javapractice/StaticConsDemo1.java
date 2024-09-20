package javapractice;

public class StaticConsDemo1 
{

	int i=1;
	static int j=1;
	StaticConsDemo1()
	{
		i++;
		j++;
	}
	public static void main(String[] args) 
	{
		System.out.println(j);
		StaticConsDemo1  scd1=new StaticConsDemo1();
		System.out.println(scd1.i);
		System.out.println(scd1.j);
		StaticConsDemo1  scd2=new StaticConsDemo1();
		System.out.println(scd2.i);
		System.out.println(scd2.j);
	}

}
